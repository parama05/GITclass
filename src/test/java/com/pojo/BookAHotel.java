package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class BookAHotel extends BaseClass{

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcnum() {
		return txtCcnum;
	}

	public WebElement getDdCctype() {
		return ddCctype;
	}

	public WebElement getDdExpMonth() {
		return ddExpMonth;
	}

	public WebElement getDdExpYear() {
		return ddExpYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCcnum;
	
	@FindBy(id="cc_type")
	private WebElement ddCctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ddExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ddExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id="book_now")
	private WebElement btnClick;
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement bookAHotel;

	public WebElement getBookAHotel() {
		return bookAHotel;
	}

}
