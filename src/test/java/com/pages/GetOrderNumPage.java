package com.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetOrderNumPage extends BaseClass{
public GetOrderNumPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="order_no")
private WebElement getOrderNum;
public WebElement getGetOrderNum() {
	return getOrderNum;
}

}
