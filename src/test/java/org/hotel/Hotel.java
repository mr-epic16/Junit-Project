package org.hotel;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Hotel extends BaseClass {

	@BeforeClass
	public static void beforeClass() {
		launchBrowser("chrome");
	}

	@Test
	public void test() throws Exception {

		// login page
		launchUrl("http://adactinhotelapp.com/SearchHotel.php");
		LoginPage l = new LoginPage();
		fillTheTextBox(l.getUsername(), "muruga9500");
		fillTheTextBox(l.getPassword(), "#murugasrm#sr");
		clickTheButton(l.getLogin());

		// Home page
		HomePage h = new HomePage();
		getSelectOption(h.getLocation(), "Paris");
		getSelectOption(h.getHotels(), "Hotel Hervey");
		getSelectOption(h.getRoomtype(), "Super Deluxe");
		getSelectOption(h.getRoomNumber(), "5");
		getSelectOption(h.getAdultPerRoom(), "3");
		getSelectOption(h.getChildrenRoom().get(0), "4");
		clickTheButton(h.getSubmit());

		// Select hotel page
		SelectPage s = new SelectPage();
		clickTheButton(s.getSelectHotel().get(0));
		clickTheButton(s.getContinue());

		// Book Hotel page
		HotelBook hb = new HotelBook();
		fillTheTextBox(hb.getFistName(), "Muruga");
		fillTheTextBox(hb.getLastName(), "Sakthi");
		fillTheTextBox(hb.getAddress(), "Thiruvancherry,Chennai");
		fillTheTextBox(hb.getCreditCardNo(), "1231231231231231");
		getSelectOption(hb.getCreditCardType(), "VISA");
		getSelectOption(hb.getCardExpiryMonth(), "12");
		getSelectOption(hb.getCardExpiryYear(), "2021");
		fillTheTextBox(hb.getCCNumber(), "555");
		clickTheButton(hb.getBookNow());

		// Booking Confirmation page
		Thread.sleep(5000);
		BookingConfirmation bc = new BookingConfirmation();
		getText(bc.getOrderNo());

	}

}
