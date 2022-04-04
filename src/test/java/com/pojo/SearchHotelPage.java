package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement ddLocation;
	
	@FindBy(id="hotels")
	private WebElement ddHotels;
	
	@FindBy(id="room_type")
	private WebElement ddRoomType;
	
	@FindBy(id="room_nos")
	private WebElement ddRoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement searchHotelPage;
	
	public WebElement getSearchHotelPage() {
		return searchHotelPage;
	}

	public WebElement getDdLocation() {
		return ddLocation;
	}

	public WebElement getDdHotels() {
		return ddHotels;
	}

	public WebElement getDdRoomType() {
		return ddRoomType;
	}

	public WebElement getDdRoomNos() {
		return ddRoomNos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getDdAdultRoom() {
		return ddAdultRoom;
	}

	public WebElement getDdChildRoom() {
		return ddChildRoom;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="adult_room")
	private WebElement ddAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement ddChildRoom;
	
	@FindBy(id="Submit")
	private WebElement btnClick;
}
