package pageObjects;

import org.openqa.selenium.By;

public class CalculatorPageObjects {

	public By number_Buttons(char c) {
		By ele = By.xpath("//android.widget.TextView[@text='"+c+"']");
		return ele;
	}
	
	public By plus_Button() {
		By ele = By.xpath("//android.widget.ImageView[@content-desc='plus']");
		return ele;
	}
	
	public By minus_Button() {
		By ele = By.xpath("//android.widget.ImageView[@content-desc='minus']");
		return ele;
	}
	
	public By multiply_Button() {
		By ele = By.xpath("//android.widget.ImageView[@content-desc='multiply']");
		return ele;
	}
	
	public By divide_Button() {
		By ele = By.xpath("//android.widget.ImageView[@content-desc='divide']");
		return ele;
	}
	
	public By equals_Button() {
		By ele = By.xpath("//android.widget.ImageView[@content-desc='equals']");
		return ele;
	}
	
	public By result_Displayed() {
		By ele = By.xpath("//android.widget.TextView[@resource-id='com.miui.calculator:id/result']");
		return ele;
	}
	
	public By clear_Button() {
		By ele = By.xpath("//android.widget.ImageView[@content-desc='clear']");
		return ele;
	}
	
	
}
