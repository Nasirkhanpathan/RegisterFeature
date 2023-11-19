package com.cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = ("input-firstname"))
	private WebElement firstName;

	@FindBy(id = ("input-lastname"))
	private WebElement lastName;

	@FindBy(id = ("input-email"))
	private WebElement email;
	
	@FindBy(id = ("input-telephone"))
	private WebElement phone;

	@FindBy(id = ("input-password"))
	private WebElement password;

	@FindBy(id = ("input-confirm"))
	private WebElement confirmPassword;

	@FindBy(xpath = ("//input[@name='newsletter' and  @value='']"))
	private WebElement newsletterYes;
	
	@FindBy(xpath = ("//input[@name='newsletter' and  @value='0']"))
	private WebElement newsletterNo;

	@FindBy(name = ("input-agree"))
	private WebElement privacyPolicy;

	@FindBy(name = ("//input[@value='continue']"))
	private WebElement continueButton;
	
	@FindBy(xpath = ("//div[text()='E-Mail Address does not appear to be valid!']"))
	private WebElement emailMassage;
	
	@FindBy(xpath = ("//div[text()='Telephone must be between 3 and 32 characters!']"))
	private WebElement phoneMassage;
	
	@FindBy(xpath = ("//div[text()='Password must be between 4 and 20 characters!']"))
	private WebElement passwordMassage;
	
	@FindBy(xpath = ("//div[text()='Last Name must be between 1 and 32 characters!']"))
	private WebElement lastnameMassage;

	@FindBy(xpath = ("//div[text()='First Name must be between 1 and 32 characters!']"))
	private WebElement firsnameMassage;

	@FindBy(xpath = ("//div[text()='Warning: E-Mail Address is already registered!']"))
	private WebElement emailWarningpl;
	
	@FindBy(xpath = ("//div[text()='Warning: You must agree to the Privacy Policy']"))
	private WebElement privacyPolicyWarningMassage;
	
	
	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void enterPhoneNumber(String telephone) {
		phone.sendKeys(telephone);
	}
	
	public void enterPassword(String pword) {
		password.sendKeys(pword);
	}
	
	public void enterConfirmPassword(String cpword) {
		confirmPassword.sendKeys(cpword);
	}
	
	public void selectNewsletterYesRadioButton() {
		newsletterYes.click();
	}
	public void selectNewsletterNoRadioButton() {
		newsletterNo.click();
	}
	public void selectPrivacyPolicyCheckBox() {
		privacyPolicy.click();
	}
	public void unSelectPrivacyPolicyCheckBox() {
		privacyPolicy.click();
		privacyPolicy.click();
	}
	public AccountSuccessPage clickOnContinueButoton() {
		continueButton.click();
		return new AccountSuccessPage(driver);
	}
	
	public String getRegisterPageTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	public String getFirstNameWarningMassage() {
		String text=firsnameMassage.getText();
		return text;
	}
	public String getPasswordWarningMassage() {
		String text=passwordMassage.getText();
		return text;
	}
	public String getLastNameWarningMassage() {
		String text=lastnameMassage.getText();
		return text;
	}
	public String getEmailWarningMassage() {
		String text=emailMassage.getText();
		return text;
	}
	
	public String getEmailWarningMassagePageLevel() {
		String text=emailWarningpl.getText();
		return text;
	}

	public String getPhoneWarningMassage() {
		String text=phoneMassage.getText();
		return text;
	}
	
	public String getPrivacyPolicyWarningMassage() {
		String text=privacyPolicyWarningMassage.getText();
		return text;
	}

}
