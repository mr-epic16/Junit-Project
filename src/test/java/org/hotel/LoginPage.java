package org.hotel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement Username;
	@FindBy(id = "password")
	private WebElement Password;
	@FindBy(id = "login")
	private WebElement Login;

	public WebElement getUsername() {

		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

}
