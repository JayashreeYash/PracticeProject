package pageObjects;

import org.openqa.selenium.By;


public class LoginPageObjects {

	public By Cancel_Button() {
		By ele = By.xpath("//android.widget.Button[@text='CANCEL']");
		return ele;
	}
	
	
	public By Enroll_Button() {
		By ele = By.xpath("//android.widget.Button[@text='Enroll']");
		return ele;
	}
	
	public By Activate_Your_Account() {
		By ele = By.xpath("//android.widget.TextView[@text='Activate your account']");
		return ele;
	}
	
	public By Username() {
		By ele = By.xpath("//android.widget.EditText[@content-desc='Username']");
		return ele;
	}
	
	public By Activation_Code() {
		By ele = By.xpath("//android.widget.EditText[@content-desc='Password']");
		return ele;
	}
	
	public By Verify() {
		By ele = By.xpath("//android.widget.Button[@text='Verify']");
		return ele;
	}
	
	//android.widget.EditText[@content-desc='Username']
	//android.widget.EditText[@content-desc='Password']
	//android.widget.Button[@text='Verify']
	

}
