package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoChild extends BaseClass{
	
public static void main(String[] args) throws Throwable {
	/*launch();
	url("http://adactinhotelapp.com/Register.php");
	waits();
	Pojo p = new Pojo();
	WebElement userid = p.getUserid();
	tofill(userid, excelRead("Sheet1", 1, 0));
	WebElement pass = p.getPass();
	tofill(pass, excelRead("Sheet1", 1, 1));
	WebElement repass = p.getRepass();
	tofill(repass, excelRead("Sheet1", 1, 2));
	WebElement fullname = p.getFullname();
	tofill(fullname, excelRead("Sheet1", 1, 3));
	WebElement email = p.getEmail();
	tofill(email, excelRead("Sheet1", 1, 4));
	WebElement captcha = p.getCaptcha();
	tofill(captcha,excelRead("Sheet1", 1, 5));
	*/
	
	launch();
	url("https://www.facebook.com/");
	waits();
	Pojo p = new Pojo();
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	WebElement firstname = p.getFirstname();
	tofill(firstname, excelRead("Sheet2", 1, 0));
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
}
}
