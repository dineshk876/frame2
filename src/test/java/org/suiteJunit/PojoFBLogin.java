package org.suiteJunit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.BaseClass;

public class PojoFBLogin extends BaseClass{
	public PojoFBLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement user;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement login;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
}
