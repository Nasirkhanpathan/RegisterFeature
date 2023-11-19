package com.cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountDpd;
	
	@FindBy(xpath=("//a[text()='Register']"))
	private WebElement registerOption;
	
	@FindBy(xpath=("//a[text()='Login']"))
	private WebElement loginOption;
	
	public void clickOnMyAccountDpd() {

		myAccountDpd.click();
	}

	public RegisterPage clickOnRegisterOption() {
		registerOption.click();
		return new RegisterPage(driver);
	}

	public LoginPage clickOnLoginOption() {
		loginOption.click();
		return new LoginPage(driver);
	}
	public String getHomePageTitle() {
		String title=driver.getTitle();
		return title;
	}

}