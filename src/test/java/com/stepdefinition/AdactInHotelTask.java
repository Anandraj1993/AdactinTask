package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactInHotelTask {
	WebDriver driver;

	@Given("Im in the login page")
	public void im_in_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\CucuTask1\\src\\driver\\chromedriver.exe");
	 	driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

	}

	@When("Im going to enter username and password")
	public void im_going_to_enter_username_and_password() {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Karthi007");
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("Karthi@1989");
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

}
