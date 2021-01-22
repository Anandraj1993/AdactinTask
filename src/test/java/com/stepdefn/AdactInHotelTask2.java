package com.stepdefn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactInHotelTask2 {
	WebDriver driver;
	@Given("Im in the login page")
	public void im_in_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\CucuTask1\\src\\driver\\chromedriver.exe");
	 	driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@When("Im going to enter {string} and {string}")
	public void im_going_to_enter_and(String userName, String password) {
	  WebElement element = driver.findElement(By.id("username"));
	  element.sendKeys(userName);
	  WebElement element2 = driver.findElement(By.id("password"));
	  element2.sendKeys(password);
	}

	@When("Im going to click login button")
	public void im_going_to_click_login_button() {
		WebElement loginclk = driver.findElement(By.id("login"));
		loginclk.click();
	}

	@Then("Im going to verify the message")
	public void im_going_to_verify_the_message() {
		String currentUrl = driver.getCurrentUrl();
		boolean b = currentUrl.contains("adact");
		Assert.assertTrue(b,"To check Url");
	}
	@Then("Im going to Select {string} {string} {string} {string} {string} {string} {string} and {string}")
	public void im_going_to_Select_and(String location, String hotel, String room, String roomNo, String pickUpDate, String endUpDate, String adultRoom, String childRoom) {
		WebElement element = driver.findElement(By.id("location"));
		element.click();
		Select s = new Select(element);
		s.selectByVisibleText(location);
		Select s1= new Select(driver.findElement(By.id("hotels")));
		s1.selectByVisibleText(hotel);
		Select s2= new Select(driver.findElement(By.id("room_type")));
		s2.selectByVisibleText(room);
		Select s3= new Select(driver.findElement(By.id("room_nos")));
		s3.selectByVisibleText(roomNo);
		WebElement element2 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		element2.clear();
		element2.sendKeys(pickUpDate);
		WebElement element3 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		element3.clear();
		element3.sendKeys(endUpDate);
		Select s4= new Select(driver.findElement(By.id("adult_room")));
		s4.selectByVisibleText(adultRoom);
		Select s5= new Select(driver.findElement(By.id("child_room")));
		s5.selectByVisibleText(childRoom);
	}

	@Then("Im going to click Search button")
	public void im_going_to_click_Search_button() {
		 WebElement element = driver.findElement(By.id("Submit"));
		    element.click();
	}
	@Then("Im going to Click Radio button")
	public void im_going_to_Click_Radio_button() {
	   driver.findElement(By.id("radiobutton_0")).click();
	   
	}

	@Then("Im going to click Continue")
	public void im_going_to_click_Continue() {
		driver.findElement(By.id("continue")).click();
	}

	@Then("Im going to enter {string} {string} {string} {string} {string} {string} {string} {string}")
	public void im_going_to_enter(String first, String last, String add, String card, String cardType, String expMonth, String expYear, String cvv) {
	   driver.findElement(By.id("first_name")).sendKeys(first);
	   driver.findElement(By.id("last_name")).sendKeys(last);
	   driver.findElement(By.id("address")).sendKeys(add);
	   driver.findElement(By.id("cc_num")).sendKeys(card);
	   Select s = new Select(driver.findElement(By.id("cc_type")));
	   s.selectByVisibleText(cardType);
	   Select s1 = new Select(driver.findElement(By.id("cc_exp_month")));
	   s1.selectByVisibleText(expMonth);
	   Select s2 = new Select(driver.findElement(By.id("cc_exp_year")));
	   s2.selectByVisibleText(expYear);
	   driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
	}

	@Then("Im going to click Book Now")
	public void im_going_to_click_Book_Now() {
		driver.findElement(By.id("book_now")).click();;
	}

	@Then("Im going to get Order No")
	
	public void im_going_to_get_Order_No() throws InterruptedException {
		Thread.sleep(8000);
		WebElement element = driver.findElement(By.id("order_no"));
		String attribute = element.getAttribute("value");
		System.out.println("\n"+"OrderNo:   "+  attribute);
		Thread.sleep(8000);
		driver.quit();
	}

	
}
