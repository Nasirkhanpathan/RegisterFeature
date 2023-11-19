package com.cart.features;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cart.pages.AccountSuccessPage;
import com.cart.pages.HomePage;
import com.cart.pages.MyAccountPage;
import com.cart.pages.NewsletterPage;
import com.cart.pages.RegisterPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	WebDriver driver;
	HomePage homepage;
	RegisterPage registerPage;
	AccountSuccessPage accountSuccessPage;
	MyAccountPage myAccountPage;
	NewsletterPage newsletterPage;
	
	@After
	public void tearDown() {
		driver.close();
	}

	@Given("User opens the application {string}")
	public void user_opens_the_application(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("User clicks on my account dropdown menu")
	public void user_clicks_on_my_account_dropdown_menu() {
		homepage = new HomePage(driver);
		homepage.clickOnMyAccountDpd();

	}

	@When("User clicks on register option")
	public void user_clicks_on_register_option() {
		registerPage = new RegisterPage(driver);
		registerPage = homepage.clickOnRegisterOption();

	}

	@When("User enters first name {string}")
	public void user_enters_first_name(String firstname) {
		registerPage.enterFirstName(firstname);

	}

	@When("User enters last name {string}")
	public void user_enters_last_name(String lastname) {
		registerPage.enterLastName(lastname);

	}

	@When("User enters email {string}")
	public void user_enters_email(String email) {
		registerPage.enterEmail(email);

	}

	@When("User enters phone {string}")
	public void user_enters_phone(String phonenumber) {
		registerPage.enterPhoneNumber(phonenumber);

	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		registerPage.enterPassword(password);

	}

	@When("User enters confirm password {string}")
	public void user_enters_confirm_password(String cpassword) {
		registerPage.enterConfirmPassword(cpassword);

	}

	@When("User select yes newsletter option")
	public void user_select_yes_newsletter_option() {
		registerPage.selectNewsletterYesRadioButton();

	}

	@When("User select privacy policy option")
	public void user_select_privacy_policy_option() {
		registerPage.selectPrivacyPolicyCheckBox();

	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		accountSuccessPage = new AccountSuccessPage(driver);
		accountSuccessPage = registerPage.clickOnContinueButoton();

	}

	@Then("User should get logged in successfuly")
	public void user_should_get_logged_in_successfuly() {
		accountSuccessPage.getAccountSuccessPageTitle();

	}

	@Then("User should navigate on account success page")
	public void user_should_navigate_on_account_success_page() {
		accountSuccessPage.getAccountSuccessPageTitle();

	}

	@When("User clicks on continue button from account success page")
	public void user_clicks_on_continue_button_from_account_success_page() {
		myAccountPage = new MyAccountPage(driver);
		myAccountPage = accountSuccessPage.clickOnContinueButoton();

	}

	@Then("User should navigate on my account page")
	public void user_should_navigate_on_my_account_page() {
		myAccountPage.getMyAccountPagetitle();
	}

	@Then("User should get warning massage for email field {string}")
	public void user_should_get_warning_massage_for_email_field(String string) {
		registerPage.getEmailWarningMassage();

	}

	@Then("User should get warning massages for first name {string}")
	public void user_should_get_warning_massages_for_first_name(String string) {
		registerPage.getFirstNameWarningMassage();
	}

	@Then("for last name {string}")
	public void for_last_name(String string) {
		registerPage.getLastNameWarningMassage();
	}

	@Then("for email {string}")
	public void for_email(String string) {
		registerPage.getEmailWarningMassage();
	}

	@Then("for phone {string}")
	public void for_phone(String string) {
		registerPage.getPhoneWarningMassage();
	}

	@Then("for password {string}")
	public void for_password(String string) {
		registerPage.getPasswordWarningMassage();
	}

	@Then("for pravacy policy field {string}")
	public void for_pravacy_policy_field(String string) {
		registerPage.getPrivacyPolicyWarningMassage();
	}

	@Then("User should get warning massage for phone field {string}")
	public void user_should_get_warning_massage_for_phone_field(String string) {
		registerPage.getPhoneWarningMassage();
	}

	@When("User Unselect privacy policy option")
	public void user_unselect_privacy_policy_option() {
		registerPage.unSelectPrivacyPolicyCheckBox();

	}
	
	@Then("User should not get logged in successfuly")
	public void user_should_not_get_logged_in_successfuly() {
		registerPage.getRegisterPageTitle();

	}

	@When("User should get warning massage for password confirm field {string}")
	public void user_should_get_warning_massage_for_password_confirm_field(String string) {
		registerPage.getPasswordWarningMassage();
	}

	@When("User clicks on subscribe\\/unsubscribe to newsletter option")
	public void user_clicks_on_subscribe_unsubscribe_to_newsletter_option() {
		newsletterPage = new NewsletterPage(driver);
		newsletterPage = myAccountPage.clickOnSubscribeOrUnsubscribeNewsletter();
	}

	@Then("User should display yes option selected by default")
	public void user_should_display_yes_option_selected_by_default() {
		newsletterPage.isNewsletterSelectedYes();
	}

	@When("User select no newsletter option")
	public void user_select_no_newsletter_option() {
		registerPage.selectNewsletterNoRadioButton();
	}

	@Then("User should display no option selected by default")
	public void user_should_display_no_option_selected_by_default() {
		newsletterPage.isNewsletterSelectedNo();

	}

	@Then("User should display all entered registered data in database")
	public void user_should_display_all_entered_registered_data_in_database() {

	}
	
}