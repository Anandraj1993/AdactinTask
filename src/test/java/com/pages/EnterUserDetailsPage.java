package com.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterUserDetailsPage extends BaseClass{
public EnterUserDetailsPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement firstName;

@FindBy(id="last_name")
private WebElement lastName;

@FindBy(id="address")
private WebElement userAddress;
@FindBy(id="cc_num")
private WebElement cardNum;
@FindBy(id="cc_type")
private WebElement cardType;
@FindBy(id="cc_exp_month")
private WebElement cardExpiryMonth;
@FindBy(id="cc_exp_year")
private WebElement cardExpiryYear;
@FindBy(id="cc_cvv")
private WebElement enterccv;
@FindBy(id="book_now")
private WebElement clickBookNowBtn;

public WebElement getEnterccv() {
	return enterccv;
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getUserAddress() {
	return userAddress;
}

public WebElement getCardNum() {
	return cardNum;
}

public WebElement getCardType() {
	return cardType;
}

public WebElement getCardExpiryMonth() {
	return cardExpiryMonth;
}

public WebElement getCardExpiryYear() {
	return cardExpiryYear;
}

public WebElement getClickBookNowBtn() {
	return clickBookNowBtn;
}



}
