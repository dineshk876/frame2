package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoFlipkart extends BaseClass{
	public PojoFlipkart() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	private WebElement close;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	private WebElement text;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	private WebElement search;
	@FindBy(xpath="(//div[text()='POCO X3 Pro (Steel Blue, 128 GB)'])[1]")
	private WebElement product;
	@FindBy(id="pincodeInputId")
	private WebElement pincode;
	@FindBy(xpath="//span[text()='Check']")
	private WebElement check;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/label[2]")
	private WebElement exchange;
	

	public WebElement getClose() {
		return close;
	}
	public WebElement getText() {
		return text;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getProduct() {
		return product;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getExchange() {
		return exchange;
	}
	
	}
	

