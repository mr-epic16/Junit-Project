package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBook extends BaseClass {

	public HotelBook() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement FistName;
	@FindBy(id = "last_name")
	private WebElement LastName;
	@FindBy(id = "address")
	private WebElement Address;
	@FindBy(id = "cc_num")
	private WebElement CreditCardNo;
	@FindBy(id = "cc_type")
	private WebElement CreditCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement CardExpiryMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement CardExpiryYear;
	@FindBy(id = "cc_cvv")
	private WebElement CCNumber;
	@FindBy(id = "book_now")
	private WebElement BookNow;
	@FindBy(id = "cancel")
	private WebElement Cancel;

	public WebElement getFistName() {
		return FistName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getCardExpiryMonth() {
		return CardExpiryMonth;
	}

	public WebElement getCardExpiryYear() {
		return CardExpiryYear;
	}

	public WebElement getCCNumber() {
		return CCNumber;
	}

	public WebElement getBookNow() {
		return BookNow;
	}

	public WebElement getCancel() {
		return Cancel;
	}

}
