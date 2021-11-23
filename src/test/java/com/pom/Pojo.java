package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
public Pojo() {
	PageFactory.initElements(driver, this);
}
/*@FindBy(id="username")
private WebElement userid;

@FindBy(id="password")
private WebElement pass;

@FindBy(id="re_password")
private WebElement repass;

@FindBy(id="full_name")
private WebElement fullname;

@FindBy(id="email_add")
private WebElement email;

@FindBy(id="captcha-form")
private WebElement Captcha;

public WebElement getUserid() {
	return userid;
}

public WebElement getPass() {
	return pass;
}

public WebElement getRepass() {
	return repass;
}

public WebElement getFullname() {
	return fullname;
}

public WebElement getEmail() {
	return email;
}

public WebElement getCaptcha() {
	return Captcha;
}*/
@FindBy(name="firstname")
private WebElement firstname;
@FindBy(name="lastname")
private WebElement surname;
@FindBy(xpath="(//input[@type='text'])[4]")
private WebElement mob;
@FindBy(xpath="(//input[@type='password'])[2]")
private WebElement pass;
@FindBy(id="day")
private WebElement date;
@FindBy(id="month")
private WebElement mon;
@FindBy(id="year")
private WebElement year;

@FindBy(name="sex")
private WebElement female;

public WebElement getFirstname() {
	return firstname;
}

public WebElement getSurname() {
	return surname;
}

public WebElement getMob() {
	return mob;
}

public WebElement getPass() {
	return pass;
}

public WebElement getDate() {
	return date;
}

public WebElement getMon() {
	return mon;
}

public WebElement getYear() {
	return year;
}

public WebElement getFemale() {
	return female;
}
}
