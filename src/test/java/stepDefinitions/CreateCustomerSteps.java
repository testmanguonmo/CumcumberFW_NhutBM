package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.HomePage;
import com.bankguru.LogInPage;
import com.bankguru.NewCustomer;
import com.bankguru.RegisterPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCustomerSteps extends CommonTestcase {

	WebDriver driver;
	LogInPage logInPage;
	HomePage homePage;
	RegisterPage registerPage;
	NewCustomer newCustomer;

	
	static String customerid;

	public CreateCustomerSteps() {
		driver = CommonTestcase.driver;
		newCustomer = PageFactory.initElements(driver, NewCustomer.class);
	}

	@When("^I input key tab to customer name$")
	public void i_input_key_tab_to_customer_name() {
		newCustomer.tabCustomerName(Keys.TAB);

	}

	@When("^I input data \"(.*?)\" to customer name$")
	public void i_input_data_to_customer_name(String arg1) {
		newCustomer.inputCustomerName(arg1);
	}

	@When("^I input key space to customer name$")
	public void i_input_key_space_to_customer_name() {
		newCustomer.tabCustomerName(Keys.SPACE);

	}

	@When("^I input key tab to address$")
	public void i_input_key_tab_to_address() {
		newCustomer.tabAddress(Keys.TAB);

	}

	@When("^I input key space to address$")
	public void i_input_key_space_to_address() {
		newCustomer.tabAddress(Keys.SPACE);

	}

	@When("^I input key tab to city$")
	public void i_input_key_tab_to_city() {
		newCustomer.tabCity(Keys.TAB);

	}

	@When("^I input data \"(.*?)\" to city$")
	public void i_input_data_to_city(String arg1) {
		newCustomer.inputCity_TXT(arg1);

	}

	@When("^I input key space to city$")
	public void i_input_key_space_to_city() {
		newCustomer.tabCity(Keys.SPACE);

	}

	@When("^I input key tab to state$")
	public void i_input_key_tab_to_state() {
		newCustomer.tabState_TXT(Keys.TAB);

	}

	@When("^I input data \"(.*?)\" to state$")
	public void i_input_data_to_state(String arg1) {
		newCustomer.inputState_TXT(arg1);

	}

	@When("^I input key space to state$")
	public void i_input_key_space_to_state() {
		newCustomer.tabState_TXT(Keys.SPACE);

	}

	@When("^I input data \"(.*?)\" to pin$")
	public void i_input_data_to_pin(String arg1) {
		newCustomer.inputPin_TXT(arg1);

	}

	@When("^I input key tab to pin$")
	public void i_input_key_tab_to_pin() {
		newCustomer.tabPin_TXT(Keys.TAB);

	}

	@When("^I input key space to pin$")
	public void i_input_key_space_to_pin() {
		newCustomer.tabPin_TXT(Keys.SPACE);

	}

	@When("^I input key tab to phone$")
	public void i_input_key_tab_to_phone() {
		newCustomer.tabMobileNumber_TXT(Keys.TAB);

	}

	@When("^I input key space to phone$")
	public void i_input_key_space_to_phone() {
		newCustomer.tabMobileNumber_TXT(Keys.SPACE);

	}

	@When("^I input data \"(.*?)\" to phone$")
	public void i_input_data_to_phone(String arg1) {
		newCustomer.inputMobileNumber_TXT(arg1);

	}

	@When("^I input key tab to email$")
	public void i_input_key_tab_to_email() {
		newCustomer.tabEmail_TXT(Keys.TAB);

	}

	@When("^I input data \"(.*?)\" to email$")
	public void i_input_data_to_email(String arg1) {
		newCustomer.inputEmail_TXT(arg1);

	}

	@When("^I input key space to email$")
	public void i_input_key_space_to_email() {
		newCustomer.tabEmail_TXT(Keys.SPACE);

	}

	@When("^I input with data \"(.*?)\" to customer name$")
	public void i_input_with_data_to_customer_name(String arg1) {
		newCustomer.inputCustomerName(arg1);

	}

	@When("^I input with data \"(.*?)\" to date of birth$")
	public void i_input_with_data_to_date_of_birth(String arg1) {
		newCustomer.inputDOB(arg1);

	}

	@When("^I input with data \"(.*?)\" to address$")
	public void i_input_with_data_to_address(String arg1) {
		newCustomer.inputAddress(arg1);

	}

	@When("^I input with data \"(.*?)\" to city$")
	public void i_input_with_data_to_city(String arg1) {
		newCustomer.inputCity_TXT(arg1);

	}

	@When("^I input with data \"(.*?)\" to state$")
	public void i_input_with_data_to_state(String arg1) {
		newCustomer.inputState_TXT(arg1);

	}

	@When("^I input with data \"(.*?)\" to pin$")
	public void i_input_with_data_to_pin(String arg1) {
		newCustomer.inputPin_TXT(arg1);

	}

	@When("^I input with data \"(.*?)\" to phone$")
	public void i_input_with_data_to_phone(String arg1) {
		newCustomer.inputMobileNumber_TXT(arg1);

	}

	@When("^I input with data \"(.*?)\" to email$")
	public void i_input_with_data_to_email(String arg1) {
		newCustomer.inputEmail_TXT(arg1 + randomEmail() + "@gmail.com");

	}

	@When("^I input with data \"(.*?)\" to password$")
	public void i_input_with_data_to_password(String arg1) {
		newCustomer.inputPassword(arg1);

	}

	@When("^I click submit button$")
	public void i_click_submit_button() {
		newCustomer.clickSubmit();

	}

	@Then("^I get text UserID \"(.*?)\"$")
	public void i_get_text_UserID(String arg1) {
		customerid = newCustomer.getTextCustomer_ID();
		System.out.println("Customer ID: " + customerid);

	}
}
