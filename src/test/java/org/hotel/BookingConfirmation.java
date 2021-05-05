package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {
	public BookingConfirmation() {

		PageFactory.initElements(driver, this);
	}

	// booking confirmation page
	@FindBy(id = "order_no")
	private WebElement OrderNo;
	@FindBy(id = "search_hotel")
	private WebElement SearchHotel;
	@FindBy(id = "my_itinerary")
	private WebElement MyItinerary;
	@FindBy(id = "logout")
	private WebElement Logout;

	public WebElement getOrderNo() {
		return OrderNo;
	}

	public WebElement getSearchHotel() {
		return SearchHotel;
	}

	public WebElement getMyItinerary() {
		return MyItinerary;
	}

	public WebElement getLogout() {
		return Logout;
	}

}
