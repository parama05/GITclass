package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Base.BaseClass;
import com.pojo.AdactinLoginPage;
import com.pojo.BookAHotel;
import com.pojo.BookingConfirmation;
import com.pojo.SearchHotelPage;
import com.pojo.SelectHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass extends BaseClass{
	
	AdactinLoginPage ad;
	SearchHotelPage sh;
	SelectHotelPage sp;
	BookAHotel bh;
	

	public static WebDriver driver;
	
	@Given("User launch Adactin web Application")
	public void user_launch_Adactin_web_Application() {
		
	}

	@Then("User verify Login Page is displayed")
	public void user_verify_Login_Page_is_displayed() {
		ad = new AdactinLoginPage();
		boolean loginPage = ad.getLoginPage().isDisplayed();
		System.out.println(ad.getLoginPage().getText());
		System.out.println(loginPage);
		
	}

	@When("User enters valid userName and valid passWord")
	public void user_enters_valid_userName_and_valid_passWord() {
		ad = new AdactinLoginPage();
		insertText(ad.getUserName(), "parama0505");
		insertText(ad.getPassWord(), "Pg@54321");
		
	}

	@When("User clicks Login Button")
	public void user_clicks_Login_Button() {
		ad= new AdactinLoginPage();
		btnClick(ad.getLoginBtn());
	}

	@Then("User verify search hotel page is displayed")
	public void user_verify_search_hotel_page_is_displayed() {
		sh = new SearchHotelPage();
		boolean searchHotel = sh.getSearchHotelPage().isDisplayed();
		System.out.println(sh.getSearchHotelPage().getText());
		System.out.println(searchHotel);
	}

	@When("User select Location select Hotel, Room Type, Number of Rooms, CheckIn date, Checkout date, Adults per Room, Children per Room")
	public void user_select_Location_select_Hotel_Room_Type_Number_of_Rooms_CheckIn_date_Checkout_date_Adults_per_Room_Children_per_Room() {
		
		sh = new SearchHotelPage();
		selectByVisibleText(sh.getDdLocation(), "Sydney");
		selectByVisibleText(sh.getDdHotels(), "Hotel Sunshine");
		selectByVisibleText(sh.getDdRoomType(), "Deluxe");
		selectByVisibleText(sh.getDdRoomNos(), "2 - Two");
		
		insertText(sh.getCheckIn(), "01/04/2022");
		insertText(sh.getCheckOut(), "02/04/2022");
		selectByVisibleText(sh.getDdAdultRoom(), "1 - One");
		selectByVisibleText(sh.getDdChildRoom(), "0 - None");
	}

	@When("User clicks submit Button")
	public void user_clicks_submit_Button() {
		sh = new SearchHotelPage();
		btnClick(sh.getBtnClick());
	}

	@Then("User verify Select Hotel page is displayed")
	public void user_verify_Select_Hotel_page_is_displayed() {
		sp = new SelectHotelPage();
		boolean selectHotel = sp.getSelectHotel().isDisplayed();
		System.out.println(sp.getSelectHotel().getText());
		System.out.println(selectHotel);
	}

	@When("User clicks radio Button and clicks continue Button")
	public void user_clicks_radio_Button_and_clicks_continue_Button() {
		sp = new SelectHotelPage();
		btnClick(sp.getBtnSelect());
		btnClick(sp.getBtnContinue());
	}

	@Then("User verify Book A Hotel page is displayed")
	public void user_verify_Book_A_Hotel_page_is_displayed() {
		bh = new BookAHotel();
		boolean bookAHotel = bh.getBookAHotel().isDisplayed();
		System.out.println(bh.getBookAHotel().getText());
		System.out.println(bookAHotel);
	}

	@When("User enters valid First Name, Last Name, Billing Address, Credit Card No, Card Type, Expiry date, CVV Number")
	public void user_enters_valid_First_Name_Last_Name_Billing_Address_Credit_Card_No_Card_Type_Expiry_date_CVV_Number() {
		
		bh = new BookAHotel();
		insertText(bh.getTxtFirstName(), "Paramaguru");
		insertText(bh.getTxtLastName(), "Panneer");
		insertText(bh.getTxtAddress(), "Thanjavur");
		insertText(bh.getTxtCcnum(), "9876543212345678");
		
		selectByVisibleText(bh.getDdCctype(), "VISA");
		selectByVisibleText(bh.getDdExpMonth(), "December");
		selectByVisibleText(bh.getDdExpYear(), "2022");
		insertText(bh.getTxtCvv(), "985");
		
	}

	@When("User clicks Book Now Button")
	public void user_clicks_Book_Now_Button() {
		bh = new BookAHotel();
		btnClick(bh.getBtnClick());
	}

	@Then("User verify Booking confirmation page is displayed and order id is displayed")
	public void user_verify_Booking_confirmation_page_is_displayed_and_order_id_is_displayed() throws InterruptedException {
		Thread.sleep(5000);
		BookingConfirmation bc = new BookingConfirmation();
		boolean bookingconfirm = bc.getBookingConfirmation().isDisplayed();
		System.out.println(bc.getBookingConfirmation().getText());
		System.out.println(bookingconfirm);
		
		String orderid = bc.getOrderId().getAttribute("value");
		System.out.println(orderid);
		
	}
	@When("User enters valid {string} and valid {string}")
	public void user_enters_valid_and_valid(String userName, String passWord) {
		ad = new AdactinLoginPage();
		insertText(ad.getUserName(), userName);
		insertText(ad.getPassWord(), passWord);
	}

	@When("User select{string} {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_select(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	
		
		sh = new SearchHotelPage();
		selectByVisibleText(sh.getDdLocation(), string);
		selectByVisibleText(sh.getDdHotels(), string2);
		selectByVisibleText(sh.getDdRoomType(), string3);
		selectByVisibleText(sh.getDdRoomNos(), string4);
		
		insertText(sh.getCheckIn(), string5);
		insertText(sh.getCheckOut(), string6);
		selectByVisibleText(sh.getDdAdultRoom(), string7);
		selectByVisibleText(sh.getDdChildRoom(), string8);
	}
	
	@When("User enters valid {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters_valid(String string, String string2, String string3, String string4, String string5, String string6, String string7,  String string8) {
		
		bh = new BookAHotel();
		insertText(bh.getTxtFirstName(), string);
		insertText(bh.getTxtLastName(), string2);
		insertText(bh.getTxtAddress(), string3);
		insertText(bh.getTxtCcnum(), string4);
		
		selectByVisibleText(bh.getDdCctype(), string5);
		selectByVisibleText(bh.getDdExpMonth(), string6);
		selectByVisibleText(bh.getDdExpYear(), string7);
		insertText(bh.getTxtCvv(), string8);
		
	}

}

