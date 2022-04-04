package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void loadUrl(String URL) {
		driver.get(URL);
	}
	
	public void insertText(WebElement a, String name) {
		a.sendKeys(name);
	}
	
	public void btnClick(WebElement b) {
		b.click();
	}
	
	public void selectByVisibleText(WebElement W, String text) {
		Select s = new Select(W);
		s.selectByVisibleText(text);
	}
}