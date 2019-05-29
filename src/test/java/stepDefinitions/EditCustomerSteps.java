package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.EditCustomer;
import com.bankguru.HomePage;
import com.bankguru.LogInPage;
import com.bankguru.NewCustomer;
import com.bankguru.RegisterPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditCustomerSteps extends CommonTestcase {
	
	WebDriver driver;
	LogInPage logInPage;
	HomePage homePage;
	RegisterPage registerPage;
	NewCustomer newCustomer;
	EditCustomer editCustomer;
	
	public EditCustomerSteps()
	{
		driver = CommonTestcase.driver;
		editCustomer = PageFactory.initElements(driver, EditCustomer.class);
	}

	@When("^I input key tab to customer id$")
	public void i_input_key_tab_to_customer_id()  {
	    editCustomer.tabCustomerID_TXT(Keys.TAB);
	    
	}

	@When("^I input data \"(.*?)\" to customer id$")
	public void i_input_data_to_customer_id(String arg1)  {
	    editCustomer.inputCustomerID_TXT(arg1);
	}
//
	@When("^I input customer id$")
	public void i_input_customer_id()  {
	    editCustomer.inputCustomerID_TXT(CreateCustomerSteps.customerid);
	    
	}
//
	@When("^I click to submit button$")
	public void i_click_to_submit_button()  {
	    editCustomer.clickSubmit_BTT();
	    
	}
//
	@When("^I update key tab to address$")
	public void i_update_key_tab_to_address()  {
	    editCustomer.cleanAddress_AREA();
	    
	}
//
	@When("^I update key tab to city$")
	public void i_update_key_tab_to_city()  {
	    
		editCustomer.cleanCity_TXT();
	}
//
	@When("^I update data \"(.*?)\" to city$")
	public void i_update_data_to_city(String arg1)  {
	 
		editCustomer.cleanCity_TXT();
		
		editCustomer.inputCity_TXT(arg1);
	    
	}
//
	@When("^I update key tab to state$")
	public void i_update_key_tab_to_state()  {
	    
		editCustomer.cleanState_TXT();
	    
	}
//
	@When("^I update data \"(.*?)\" to state$")
	public void i_update_data_to_state(String arg1)  {
	    
		editCustomer.cleanState_TXT();
		
		editCustomer.inputState_TXT(arg1);
	    
	}
//
	@When("^I update data \"(.*?)\" to pin$")
	public void i_update_data_to_pin(String arg1)  {
	    
		editCustomer.cleanPin_TXT();
		
		editCustomer.inputPin_TXT(arg1);
	    
	}
//
	@When("^I update key tab to pin$")
	public void i_update_key_tab_to_pin()  {
	    
		editCustomer.cleanPin_TXT();
	    
	}
//
	@When("^I update key tab to phone$")
	public void i_update_key_tab_to_phone()  {
	    
	    editCustomer.cleanTelephoneNumber_TXT();
	}
//
	@When("^I update data \"(.*?)\" to phone$")
	public void i_update_data_to_phone(String arg1)  {
	    
	    editCustomer.cleanTelephoneNumber_TXT();

	    editCustomer.inputTelephoneNumber_TXT(arg1);
	}
//
	@When("^I update key tab to email$")
	public void i_update_key_tab_to_email()  {
	    
	    editCustomer.cleanEmail_TXT();
		
	}
//
	@When("^I update data \"(.*?)\" to email$")
	public void i_update_data_to_email(String arg1)  {
	    
	    editCustomer.cleanEmail_TXT();
	    
	    editCustomer.inputEmail_TXT(arg1);
	}
//
	@When("^I update key space to email$")
	public void i_update_key_space_to_email()  {
	    
		editCustomer.cleanEmail_TXT();
		
		editCustomer.inputEmail_TXT(" ");
	    
	}
//
	@Then("^Close browser$")
	public void close_browser()  {
	    
		closeBrowser();

	}
}
