package com.cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//a[text()='Subscribe / unsubscribe to newsletter']"))
	private WebElement subscribeNewsletter;
	
	public NewsletterPage clickOnSubscribeOrUnsubscribeNewsletter() {
		subscribeNewsletter.click();
		return new NewsletterPage(driver);
	}
	
	public String getMyAccountPagetitle() {
		String title=driver.getTitle();
		return title;
	}
}
