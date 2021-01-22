package org.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BaseClass {
	public static WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\CucuTask1\\src\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public void clearTextBox(WebElement element) {
		element.clear();
	}

	public void getUrl(String url) {
		driver.get(url);
		maximizeWindow();
		implicitWait();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void assertEqualsCheck(String expected, String actual, String message) {
		Assert.assertEquals(expected, actual, message);
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void selectByVisibleText(WebElement element, String name) {
		new Select(element).selectByVisibleText(name);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public boolean isEnable(WebElement element) {
		return element.isEnabled();
	}

	public boolean isDisplay(WebElement element) {
		return element.isDisplayed();

	}

	public boolean isSelect(WebElement element) {
		return element.isSelected();
	}

	public WebElement findElementByID(String id) {
		return driver.findElement(By.id(id));
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void assertTrueCheck(boolean condition, String message) {
		Assert.assertTrue(condition, message);
	}

	public WebElement findElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));

	}

	public void sendKeys(WebElement element, String data) {
		if (isEnable(element) && isDisplay(element)) {
			element.sendKeys(data);
		}
	}

	public List<String> getOptions(WebElement element) {
		List<String> getalloptions = new ArrayList();
		List<WebElement> options = new Select(element).getOptions();
		for (WebElement alloptions : options) {
			String text = alloptions.getText();
			getalloptions.add(text);
		}
		return getalloptions;
	}

	public List<String> getAllSelectedOptions(WebElement element) {
		List<String> getAllSelectOptions = new ArrayList();
		List<WebElement> allSelectedOptions = new Select(element).getAllSelectedOptions();
		for (WebElement allSelectOption : allSelectedOptions) {
			String text = allSelectOption.getText();
			getAllSelectOptions.add(text);
		}
		return getAllSelectOptions;
	}

	public String getAttribute(WebElement element) {
		return element.getAttribute("value");
	}

	public void quitBrowser() {
		driver.quit();
	}
}
