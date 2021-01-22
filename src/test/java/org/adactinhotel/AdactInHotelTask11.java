package org.adactinhotel;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactInHotelTask11 extends BaseClass {
	WebDriver driver;

	@Given("Im in the login page")
	public void im_in_the_login_page() {
		getDriver();
		getUrl("https://adactinhotelapp.com/");

	}

	@When("Im going to enter {string} and {string}")
	public void im_going_to_enter_and(String userName, String password) {
		sendKeys(findElementByID("username"), userName);
		assertEqualsCheck(userName, getAttribute(findElementByID("username")), "Given UserName is Correct");
		sendKeys(findElementByID("password"), password);
		assertEqualsCheck(password, getAttribute(findElementByID("password")), "Given Password is Correct");
	}

	@When("Im going to click login button")
	public void im_going_to_click_login_button() {
		btnClick(findElementByID("login"));
	}

	@Then("Im going to verify the message")
	public void im_going_to_verify_the_message() {
		assertTrueCheck(getCurrentUrl().contains("adact"), "To Check Url");
	}

	@Then("Im going to Select {string} {string} {string} {string} {string} {string} {string} and {string}")
	public void im_going_to_Select_and(String location, String hotel, String room, String roomNo, String pickUpDate,
			String endUpDate, String adultRoom, String childRoom) {

		selectByVisibleText(findElementByID("location"), location);
		selectByVisibleText(findElementByID("hotels"), hotel);
		selectByVisibleText(findElementByID("room_type"), room);
		selectByVisibleText(findElementByID("room_nos"), roomNo);
		clearTextBox(findElementByXpath("//input[@name='datepick_in']"));
		sendKeys(findElementByXpath("//input[@name='datepick_in']"), pickUpDate);
		clearTextBox(findElementByXpath("//input[@name='datepick_out']"));
		sendKeys(findElementByXpath("//input[@name='datepick_out']"), endUpDate);
		selectByVisibleText(findElementByID("adult_room"), adultRoom);
		selectByVisibleText(findElementByID("child_room"), childRoom);

	}

	@Then("Im going to click Search button")
	public void im_going_to_click_Search_button() {
		findElementByID("Submit").click();
	}

	@Then("Im going to Click Radio button")
	public void im_going_to_Click_Radio_button() {
		findElementByID("radiobutton_0").click();
	}

	@Then("Im going to click Continue")
	public void im_going_to_click_Continue() {
		findElementByID("continue").click();
	}

	@Then("Im going to enter {string} {string} {string} {string} {string} {string} {string} {string}")
	public void im_going_to_enter(String first, String last, String add, String card, String cardType, String expMonth,
			String expYear, String cvv) {
		sendKeys(findElementByID("first_name"), first);
		assertEqualsCheck(first, getAttribute(findElementByID("first_name")), "Given FirstName is Correct");
		sendKeys(findElementByID("last_name"), last);
		assertEqualsCheck(last, getAttribute(findElementByID("last_name")), "Given LastName is Correct");
		sendKeys(findElementByID("address"), add);
		assertEqualsCheck(add, getAttribute(findElementByID("address")), "Given Address is Correct");
		sendKeys(findElementByID("cc_num"), card);
		assertEqualsCheck(card, getAttribute(findElementByID("cc_num")), "Given CardNUmber is Correct");
		selectByVisibleText(findElementByID("cc_type"), cardType);
		selectByVisibleText(findElementByID("cc_exp_month"), expMonth);
		selectByVisibleText(findElementByID("cc_exp_year"), expYear);
		sendKeys(findElementByID("cc_cvv"), cvv);
		assertEqualsCheck(cvv, getAttribute(findElementByID("cc_cvv")), "Given CVV is Correct");

	}

	@Then("Im going to click Book Now")
	public void im_going_to_click_Book_Now() {
		findElementByID("book_now").click();
	}

	@Then("Im going to get Order No")

	public void im_going_to_get_Order_No() throws InterruptedException {

		System.out.println("\n" + "OrderNo:   " + getAttribute(findElementByID("order_no")));
		quitBrowser();
	}

}
