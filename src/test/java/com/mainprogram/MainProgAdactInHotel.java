package com.mainprogram;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;

import com.pages.EnterUserDetailsPage;
import com.pages.GetOrderNumPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.confirmHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainProgAdactInHotel extends BaseClass {
	LoginPage login;	
	SearchHotelPage hotelPage;
	confirmHotelPage confirm;
	EnterUserDetailsPage userDetail;
	GetOrderNumPage orderNum;
	@Given("Im in the login page")
	public void im_in_the_login_page() {
		getDriver();
		getUrl("https://adactinhotelapp.com/");
		login = new LoginPage();
	}

	@When("Im going to enter {string} and {string}")
	public void im_going_to_enter_and(String userName, String password) {
		sendKeys(login.getUserName(), userName);
		assertEqualsCheck(userName, getAttribute(login.getUserName()), "Given UserName is Correct");
		sendKeys(login.getPassword(), password);
		assertEqualsCheck(password, getAttribute(login.getPassword()), "Given Password is Correct");
	}

	@When("Im going to click login button")
	public void im_going_to_click_login_button() {
		btnClick(login.getLoginClk());
	}

	@Then("Im going to verify the message")
	public void im_going_to_verify_the_message() {
		assertTrueCheck(getCurrentUrl().contains("adact"), "To Check Url");
		hotelPage= new SearchHotelPage();
	}

	@Then("Im going to Select {string} {string} {string} {string} {string} {string} {string} and {string}")
	public void im_going_to_Select_and(String location, String hotel, String room, String roomNo, String pickUpDate,
			String endUpDate, String adultRoom, String childRoom) {

		selectByVisibleText(hotelPage.getFindLocation(), location);
		selectByVisibleText(hotelPage.getHotel(), hotel);
		selectByVisibleText(hotelPage.getFindRoomType(), room);
		selectByVisibleText(hotelPage.getFindRoomNos(), roomNo);
		clearTextBox(hotelPage.getCheckInDate());
		sendKeys(hotelPage.getCheckInDate(), pickUpDate);
		clearTextBox(hotelPage.getCheckOutDate());
		sendKeys(hotelPage.getCheckOutDate(), endUpDate);
		selectByVisibleText(hotelPage.getAdultRoom(), adultRoom);
		selectByVisibleText(hotelPage.getChildRoom(), childRoom);

	}

	@Then("Im going to click Search button")
	public void im_going_to_click_Search_button() {
		hotelPage.getSubmitBtn().click();
		confirm= new confirmHotelPage();
		
	}

	@Then("Im going to Click Radio button")
	public void im_going_to_Click_Radio_button() {
		confirm.getRadioButton().click();
	}

	@Then("Im going to click Continue")
	public void im_going_to_click_Continue() {
		confirm.getContinueClick().click();
		userDetail = new EnterUserDetailsPage();
		
	}

	@Then("Im going to enter {string} {string} {string} {string} {string} {string} {string} {string}")
	public void im_going_to_enter(String first, String last, String add, String card, String cardType, String expMonth,
			String expYear, String cvv) {
		sendKeys(userDetail.getFirstName(), first);
		assertEqualsCheck(first, getAttribute(userDetail.getFirstName()), "Given FirstName is Correct");
		sendKeys(userDetail.getLastName(), last);
		assertEqualsCheck(last, getAttribute(userDetail.getLastName()), "Given LastName is Correct");
		sendKeys(userDetail.getUserAddress(), add);
		assertEqualsCheck(add, getAttribute(userDetail.getUserAddress()), "Given Address is Correct");
		sendKeys(userDetail.getCardNum(), card);
		assertEqualsCheck(card, getAttribute(userDetail.getCardNum()), "Given CardNUmber is Correct");
		selectByVisibleText(userDetail.getCardType(), cardType);
		selectByVisibleText(userDetail.getCardExpiryMonth(), expMonth);
		selectByVisibleText(userDetail.getCardExpiryYear(), expYear);
		sendKeys(userDetail.getEnterccv(), cvv);
		assertEqualsCheck(cvv, getAttribute(userDetail.getEnterccv()), "Given CVV is Correct");

	}

	@Then("Im going to click Book Now")
	public void im_going_to_click_Book_Now() {
		userDetail.getClickBookNowBtn().click();
		orderNum= new GetOrderNumPage();
	}

	@Then("Im going to get Order No")

	public void im_going_to_get_Order_No() throws InterruptedException {

		System.out.println("\n" + "OrderNo:   " + getAttribute(orderNum.getGetOrderNum()));
		quitBrowser();
	}
}