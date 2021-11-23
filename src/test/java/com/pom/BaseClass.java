package com.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	public static void launch() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void gettext(WebElement element) {
		element.getText();
	}
	public static String  getattribute(WebElement element) {
		String t = element.getAttribute("value");
		return t;
	}

	public static void url(String url) {
		driver.get(url);
	}
	public static void tofill(WebElement element , String text) {
		element.sendKeys(text);
	}
	public static void buttonclick(WebElement element) {
		element.click();
	}
	public static void actions(WebElement target) {
		a=new Actions(driver);
		a.moveToElement(target).perform();
	}
	public static void draganddrop(WebElement src,WebElement desc) {
		a.dragAndDrop(src, desc).perform();
	}
	public static void doubleClick(WebElement target) {
		a.doubleClick(target).perform();
	}
	public static void contextClick(WebElement element) {
		a.contextClick(element).perform();
	}
	public static void keyEnter() throws Throwable {
		 r =new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void keyUp() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	public static void keyDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void alertAccept() {
		 al = driver.switchTo().alert();
		 al.accept();
	}
	public static void alertDismiss() {
		al.dismiss();
	}
	public static void alertsendkeys(String text) {
		al.sendKeys(text);
	}
	public static void alertext() {
		al.getText();
	}
	public static void scrollDown(WebElement pagedown) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", pagedown);
	}
	public static void scrollUp(WebElement pageup) {
		js.executeScript("argunment[0].scrollintroview(false)",pageup);

	}
	public static void frames(String text) {
		driver.switchTo().frame(text);
		
	}
	public static void windowsHanding(int index) {
		Set<String> allwindow = driver.getWindowHandles();
		List<String> li=new LinkedList<String>();
		li.addAll(allwindow);
		driver.switchTo().window(li.get(index));
	}
	public static void dropdown(WebElement element,String text) {
		 s =new Select (element);
		 s.selectByVisibleText(text);
	}
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static String excelRead(String Sheet,int rowno,int cellno) throws Throwable {
		File f = new File("C:\\Users\\sathyanarayanan\\eclipse-workspace\\SampleMaven\\workbook\\newdd.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet s= book.getSheet(Sheet);
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		String name="";
		if (type == 1) {
			 name = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat si = new SimpleDateFormat("dd MMM,yyyy");
			 name = si.format(dd);
		} else {
			double d = c.getNumericCellValue();
			long lo = (long) d;
			 name = String.valueOf(lo);
		}
		return name;
	}
	public static void excelWrite(String Sheet, int rowno, int Cellno, String text) throws Throwable {
		File f = new File("C:\\Users\\sathyanarayanan\\eclipse-workspace\\SampleMaven\\workbook\\newdd.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet s = book.getSheet(Sheet);
		Row r = s.createRow(rowno);
		Cell c = r.createCell(Cellno);
		c.setCellValue(text);	
		FileOutputStream fout = new FileOutputStream(f);
		book.write(fout);
	}
}
