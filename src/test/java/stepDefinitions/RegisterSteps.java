package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bankguru.HomePage;
import com.bankguru.LogInPage;
import com.bankguru.RegisterPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegisterSteps extends CommonTestcase {

	WebDriver driver;
	LogInPage logInPage;
	HomePage homePage;
	RegisterPage registerPage;
	String username, password;

	public RegisterSteps() {
		driver = CommonTestcase.openBrowser();
		logInPage = PageFactory.initElements(driver, LogInPage.class);
	}

	@Given("^I navigate to Guru bank and click Here link$")
	public void i_navigate_to_Guru_bank_and_click_Here_link() {
		registerPage = logInPage.clickHereLink();
	}

	@When("^I input email \"(.*?)\"$")
	public void i_input_email(String arg1) {

		registerPage.inputEmailToRegister(arg1 + randomEmail() + "@gmail.com");

	}

	@When("^I click to submit account$")
	public void i_click_to_submit_account() {

		registerPage.clickSubmit();
	}

	@When("^I get email and password$")
	public void i_get_email_and_password() {
		username = registerPage.getUsername();
		password = registerPage.getPassword();
	}

	@When("^I navigate to Log In page \"(.*?)\"$")
	public void i_navigate_to_Log_In_page(String url) {
		logInPage = registerPage.navigateToLoginPage(url);
		logInPage.inputUserName(username);
		logInPage.inputPassword(password);
	}

	@When("^I log in system$")
	public void i_log_in_system() {
		homePage = logInPage.clickButonLogin();
	}
}
