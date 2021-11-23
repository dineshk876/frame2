package org.suiteJunit;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.pom.BaseClass;

public class FbLoginPage extends BaseClass{
@Test
public void testcase1() throws Throwable {
	launch();
	url("https://www.facebook.com/");
	maximize();
	waits();
	PojoFBLogin p=new PojoFBLogin();
	WebElement user = p.getUser();
	tofill(user, excelRead("Sheet2", 1, 0));
	WebElement pass = p.getPass();
	tofill(pass, excelRead("Sheet2", 1, 3));
	WebElement login = p.getLogin();
	buttonclick(login);
	driver.navigate().back();
	driver.navigate().refresh();
}
@Test
public void testcase2() throws Throwable {
	
	PojoFBLogin p=new PojoFBLogin();
	WebElement user = p.getUser();
	tofill(user, excelRead("Sheet2", 2, 0));
	WebElement pass = p.getPass();
	tofill(pass, excelRead("Sheet2", 2, 3));
	WebElement login = p.getLogin();
	buttonclick(login);
	driver.navigate().back();
	driver.navigate().refresh();
}
@Test
public void testcase3() throws Throwable {
	
	PojoFBLogin p=new PojoFBLogin();
	WebElement user = p.getUser();
	tofill(user, excelRead("Sheet2", 3, 0));
	WebElement pass = p.getPass();
	tofill(pass, excelRead("Sheet2", 3, 3));
	WebElement login = p.getLogin();
	buttonclick(login);
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().refresh();
}
}
