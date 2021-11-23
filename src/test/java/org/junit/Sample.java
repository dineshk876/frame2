package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pom.BaseClass;
import com.pom.Pojo;
import com.test.Excelwrite;

public class Sample extends BaseClass {
	@BeforeClass
	public static void bfrclass() {
		launch();
		url("https://www.facebook.com/");
		maximize();
		waits();
	}

	@Before
	public void date() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void testcase1() throws Throwable {
		Pojo p = new Pojo();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement firstname = p.getFirstname();
		String read = excelRead("Sheet2", 1, 0);
		tofill(firstname, excelRead("Sheet2", 1, 0));
		Assert.assertTrue("to check", read.contains("Dinesh"));
		//Assert.assertEquals("dinesh", "Dinesh");
		WebElement surname = p.getSurname();
		tofill(surname, excelRead("Sheet2", 1, 1));
		WebElement mob = p.getMob();
		tofill(mob, excelRead("Sheet2", 1, 2));
		WebElement pass = p.getPass();
		tofill(pass, excelRead("Sheet2", 1, 3));
		WebElement date = p.getDate();
		dropdown(date, "18");
		WebElement mon = p.getMon();
		dropdown(mon, "Mar");
		WebElement year = p.getYear();
		dropdown(year, "1996");
		WebElement female = p.getFemale();
		buttonclick(female);
		driver.navigate().refresh();
	}

	@Test
	public void testcase2() throws Throwable {
		Pojo p = new Pojo();
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement firstname = p.getFirstname();
		tofill(firstname, excelRead("Sheet2", 2, 0));
		WebElement surname = p.getSurname();
		tofill(surname, excelRead("Sheet2", 2, 1));
		WebElement mob = p.getMob();
		tofill(mob, excelRead("Sheet2", 2, 2));
		WebElement pass = p.getPass();
		tofill(pass, excelRead("Sheet2", 2, 3));
		WebElement date = p.getDate();
		dropdown(date, "19");
		WebElement mon = p.getMon();
		dropdown(mon, "Mar");
		WebElement year = p.getYear();
		dropdown(year, "1998");
		WebElement female = p.getFemale();
		buttonclick(female);
	}

	@After
	public void enddate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public static void urltext() {
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}
