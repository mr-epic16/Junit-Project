package org.hotel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BaseClass {
	public SelectPage() {
		PageFactory.initElements(driver, this);
	}

	// Select Hotel page

	@FindAll({ @FindBy(id = "radiobutton_0"), @FindBy(name = "radiobutton_0") })
	private List<WebElement> SelectHotel;
	@FindBy(id = "continue")
	private WebElement Continue;
	@FindBy(name = "cancel")
	private WebElement Cancel;

	public List<WebElement> getSelectHotel() {
		return SelectHotel;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getCancel() {
		return Cancel;
	}

}
