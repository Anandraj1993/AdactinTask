package com.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass{
public SearchHotelPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="location")
private WebElement findLocation;

@FindBy(id="hotels")
private WebElement hotel;


@FindBy(id="room_type")
private WebElement findRoomType;


@FindBy(id="room_nos")
private WebElement findRoomNos;


@FindBy(xpath="//input[@name='datepick_in']")
private WebElement checkInDate;

@FindBy(xpath="//input[@name='datepick_out']")

private WebElement checkOutDate;


@FindBy(id="adult_room")

private WebElement adultRoom;


@FindBy(id="child_room")

private WebElement ChildRoom;

@FindBy(id="Submit")

private WebElement submitBtn;


public WebElement getSubmitBtn() {
	return submitBtn;
}


public WebElement getFindLocation() {
	return findLocation;
}


public WebElement getHotel() {
	return hotel;
}


public WebElement getFindRoomType() {
	return findRoomType;
}


public WebElement getFindRoomNos() {
	return findRoomNos;
}


public WebElement getCheckInDate() {
	return checkInDate;
}


public WebElement getCheckOutDate() {
	return checkOutDate;
}


public WebElement getAdultRoom() {
	return adultRoom;
}


public WebElement getChildRoom() {
	return ChildRoom;
}

}
