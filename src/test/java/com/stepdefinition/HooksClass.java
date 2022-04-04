package com.stepdefinition;

import com.Base.BaseClass;
import com.pojo.BookAHotel;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksClass extends BaseClass{
	BookAHotel bh;
	@Before
	public void beforeExecution() {
		launchBrowser();
		maximizeWindow();
		loadUrl("http://adactinhotelapp.com/");
	}
	@After
	public void afterExecution() {
		

	}

}
