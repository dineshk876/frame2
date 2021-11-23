package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//table[@id='contactList']/descendant::input[1]")).click();

		WebElement table = driver.findElement(By.id("contactList"));

		List<WebElement> row = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			if (i==2) {
				WebElement r = row.get(2);
				System.out.println(r.getText());
			}
			

		}
	}

}
