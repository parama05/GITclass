package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnSelect;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement selectHotel;


	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}