package com.cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {

	WebDriver driver;

	public AccountSuccessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("//a[text()='Continue']"))
	private WebElement continueButton;
	
	@FindBy(xpath = ("//h1[text()='Your Account Has Been Created!']"))
	private WebElement accountSuccesmsg;
	
	public MyAccountPage clickOnContinueButoton() {
		continueButton.click();
		return new MyAccountPage(driver);
	}
	
	public void getAccountSuccessMassage() {
		accountSuccesmsg.click();
	}
	
	public String getAccountSuccessPageTitle() {
		String title=driver.getTitle();
		return title;
	}

}
