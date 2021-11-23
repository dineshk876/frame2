package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.pom.BaseClass;

import com.pom.PojoFlipkart;

public class Flipkart extends BaseClass{
@Test
public void testcase1() {
	launch();
	url("https://www.flipkart.com/");
	maximize();
	waits();
	PojoFlipkart p=new PojoFlipkart();
	WebElement close = p.getClose();
	buttonclick(close);
	WebElement text = p.getText();
	tofill(text, "poco x3 pro");
	WebElement search = p.getSearch();
	buttonclick(search);
	WebElement product = p.getProduct();
	buttonclick(product);
	windowsHanding(1);
	WebElement pincode = p.getPincode();
	tofill(pincode, "600080");
	String t = getattribute(pincode);
	Assert.assertFalse("To Check", t.contains("600076"));
	WebElement check = p.getCheck();
	buttonclick(check);
	
	
}
@Test
public void testcase2() {
WebElement click = driver.findElement(By.xpath("//div[text()='Buy with Exchange']"));
try {
	click.click();
} catch (StaleElementReferenceException e) {
	click = driver.findElement(By.xpath("//div[text()='Buy with Exchange']"));
	click.click();
}

}
}
