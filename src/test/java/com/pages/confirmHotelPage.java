package com.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmHotelPage extends BaseClass{
public confirmHotelPage() {
PageFactory.initElements(driver,this);
}
@FindBy(id="radiobutton_0")
private WebElement radioButton;


@FindBy(id="continue")
private WebElement continueClick;


public WebElement getRadioButton() {
	return radioButton;
}


public WebElement getContinueClick() {
	return continueClick;
}


}
