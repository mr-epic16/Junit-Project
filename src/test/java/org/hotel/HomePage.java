package org.hotel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	// Home page

	@FindBy(id = "location")
	private WebElement Location;
	@FindBy(id = "hotels")
	private WebElement Hotels;
	@FindBy(id = "room_type")
	private WebElement Roomtype;
	@FindBy(id = "room_nos")
	private WebElement RoomNumber;
	@FindBy(id = "datepick_in")
	private WebElement DatecheckIn;
	@FindBy(id = "datepick_out")
	private WebElement DatecheckOut;
	@FindBy(id = "adult_room")
	private WebElement AdultPerRoom;
	@FindAll({ @FindBy(id = "child_room"), @FindBy(name = "child_room") })
	private List<WebElement> ChildrenRoom;
	@FindBy(id = "Submit")
	private WebElement Submit;
	@FindBy(id = "username")
	private WebElement Reset;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomNumber() {
		return RoomNumber;
	}

	public WebElement getDatecheckIn() {
		return DatecheckIn;
	}

	public WebElement getDatecheckOut() {
		return DatecheckOut;
	}

	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}

	public List<WebElement> getChildrenRoom() {
		return ChildrenRoom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getReset() {
		return Reset;
	}

}
