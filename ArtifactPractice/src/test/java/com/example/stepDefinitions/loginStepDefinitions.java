package com.example.stepDefinitions;

import static org.junit.Assert.assertEquals;

import ResuableMethods.Utility;
import TestFunctions.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

public class loginStepDefinitions extends BaseTest {
	
	Utility util = new Utility();
	LoginPageObjects loginpage = new LoginPageObjects();
	String message=null;

	@Given("User launches the app and user is on login page")
	public void user_launches_the_app_and_user_is_on_login_page() {
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
	    setup();		
	}
	
	@Given("User navigates to enrollment screen")
	public void user_navigates_to_enrollment_screen() throws Exception {
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, loginpage.Cancel_Button(), 25);
		util.Click(driver, loginpage.Cancel_Button(), 5);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, loginpage.Enroll_Button(), 10);
		util.Click(driver, loginpage.Enroll_Button(), 5);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, loginpage.Activate_Your_Account(), 10);
		util.Click(driver, loginpage.Activate_Your_Account(), 5);
		
	}

//	@When("User enters the valid credentials")
//	public void user_enters_the_valid_credentials() throws Exception {
//		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
//		System.out.println(CurrentMethod);
//		util.wait_for_Element_isDisplayed(CurrentMethod, driver, loginpage.Username(), 10);
//		util.Sendkeys(CurrentMethod, driver, loginpage.Username(), "3478791652", 5);
//		util.wait_for_Element_isDisplayed(CurrentMethod, driver, loginpage.Activation_Code(), 3);
//		util.Sendkeys(CurrentMethod, driver, loginpage.Activation_Code(), "Password123", 3); 
//	}
	
	
	@When("User enters the valid credentials {string} and {string}")
	public void user_enters_the_valid_credentials_and(String string1, String string2) throws Exception {
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, loginpage.Username(), 10);
		util.Sendkeys(CurrentMethod, driver, loginpage.Username(), string1, 5);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, loginpage.Activation_Code(), 3);
		util.Sendkeys(CurrentMethod, driver, loginpage.Activation_Code(), string2, 3); 
	}
	
	@When("clicks on verify button")
	public void clicks_on_verify_button() throws Exception {
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, loginpage.Verify(), 10);
		util.Click(driver, loginpage.Verify(), 3);
		this.message = "success";  //For the sake of this example, we simulate activation being successful.
	   
	}
	
//	@Then("User should be successfully logged in")
//	public void user_should_be_successfully_logged_in() {
//	    
//	}
	
	@Then("User should be successfully logged in {string}")
	public void user_should_be_successfully_logged_in(String string) {
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
		assertEquals(string, this.message);
        System.out.println("Expected Message: " + string);
        System.out.println("Actual Message: " + this.message);
        
        util.quit_Driver(driver);
        
	}
	
	
}
