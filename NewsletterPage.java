package com.cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsletterPage {

	WebDriver driver;

	public NewsletterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("//input[@name='newsletter' and  @value='']"))
	private WebElement newsletterYes;
	
	@FindBy(xpath = ("//input[@name='newsletter' and  @value='0']"))
	private WebElement newsletterNo;
		
	public Boolean isNewsletterSelectedYes() {
		Boolean text=newsletterYes.isSelected();
		return text;
	}
	public Boolean isNewsletterSelectedNo() {
		Boolean text=newsletterNo.isSelected();
		return text;
	}
	
	public String getNewsletterPageTitle() {
		String title=driver.getTitle();
		return title;
	}

}
