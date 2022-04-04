package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class AdactinLoginPage extends BaseClass {
	
	public AdactinLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLoginPage() {
		return loginPage;
	}
	

	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(id="login")
	private WebElement loginBtn;
	
	@FindBy(xpath="//td[text()='Existing User Login - Build 1']")
	private WebElement loginPage;




}
