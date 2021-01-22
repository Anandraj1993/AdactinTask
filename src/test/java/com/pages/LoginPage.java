package com.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
private WebElement userName;
public WebElement getUserName() {
	return userName;
}
@FindBy(id="password")
private WebElement password;
public WebElement getPassword() {
	return password;
}
@FindBy(id="login")
private WebElement loginClk;
public WebElement getLoginClk() {
	return loginClk;
}


}
