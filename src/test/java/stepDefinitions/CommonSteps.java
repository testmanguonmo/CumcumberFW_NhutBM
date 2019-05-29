package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.CommonPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps extends CommonTestcase {
	WebDriver driver;
	CommonPage commonPage;
	public CommonSteps() {
		driver= CommonTestcase.driver;
		commonPage=PageFactory.initElements(driver, CommonPage.class );
	} 
	
	@Then("^Verify successfully with message \"(.*?)\"$")
	public void verify_successfully_with_message(String message) throws Throwable {
		verifyTrue(commonPage.isDisplayed_DynamicMessage(message));
	}
	
	@Then("^Quit brower$")
	public void quit_brower() {
		CommonTestcase.closeBrowser();
	}
	@Given("^I open \"(.*?)\" page$")
	public void i_open_page(String dynamic) {
	  commonPage.openPage_Dynamic(dynamic);
		
	}
	
	
	
}
