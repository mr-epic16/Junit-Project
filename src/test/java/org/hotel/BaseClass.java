package org.hotel;

import java.io.File;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equals("gecko")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else {
			System.setProperty("webdriver.ie.driver", "./driver/IEserverDriver.exe");
			driver = new InternetExplorerDriver();
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static String getTheTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public static String getTheCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}

	public static void fillTheTextBox(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void clickTheButton(WebElement e) {
		e.click();

	}

	static Select s;

	public static void getSelectOption(WebElement e, String value) {
		s = new Select(e);
		s.selectByValue(value);
	}

	public static void getSelectVisibleText(WebElement e, String value) {
		s = new Select(e);
		s.selectByVisibleText(value);
	}

	public static String getText(WebElement e) {
		String text = e.getAttribute("value");
		System.out.println("OrderNo:" + text);
		return text;

	}

}
