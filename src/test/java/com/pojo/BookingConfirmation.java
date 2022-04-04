package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class BookingConfirmation extends BaseClass {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingConfirmation;
	
	@FindBy(id="order_no")
	private WebElement orderId;

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getBookingConfirmation() {
		return bookingConfirmation;
	}
}
