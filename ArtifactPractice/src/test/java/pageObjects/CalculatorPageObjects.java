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

	@Given("Launch the calculator app")
	public void launch_the_calculator_app() {
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
	    setup();
	}
	
	@When("get the numbers from console")
	public void get_the_numbers_from_console() {
		
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
		
		Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        this.firstNumber = scanner1.nextLine();	
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        this.secondNumber = scanner2.nextLine();
        
	}
	
	@Then("calculates sum of two number")
	public void calculates_sum_of_two_number() throws Exception {
		
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.clear_Button(), 5);
		util.Click(driver, calPage.clear_Button(), 2);
		Thread.sleep(1000);
		for(int i=0; i<firstNumber.length(); i++) {
			char c = firstNumber.charAt(i);
			util.Click(driver, calPage.number_Buttons(c), 5);
		}
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.plus_Button(), 2);
		util.Click(driver, calPage.plus_Button(), 2);
		for(int i=0; i<secondNumber.length(); i++) {
			char c = secondNumber.charAt(i);
			util.Click(driver, calPage.number_Buttons(c), 5);
		}
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.equals_Button(), 2);
		util.Click(driver, calPage.equals_Button(), 2);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.result_Displayed(), 3);
		String result = util.getText(driver, calPage.result_Displayed());
		System.out.println("Additions of two numbers "+firstNumber+" and "+secondNumber+" : "+result);
		
	}
	@Then("calculates multiple of five numbers")
	public void calculates_multiple_of_five_numbers() throws Exception {
		
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.clear_Button(), 5);
		util.Click(driver, calPage.clear_Button(), 2);
		for(int i=0; i<firstNumber.length(); i++) {
			char c = firstNumber.charAt(i);
			util.Click(driver, calPage.number_Buttons(c), 5);
		}
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.minus_Button(), 2);
		util.Click(driver, calPage.minus_Button(), 2);
		for(int i=0; i<secondNumber.length(); i++) {
			char c = secondNumber.charAt(i);
			util.Click(driver, calPage.number_Buttons(c), 5);
		}
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.equals_Button(), 2);
		util.Click(driver, calPage.equals_Button(), 2);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.result_Displayed(), 3);
		String result = util.getText(driver, calPage.result_Displayed());
		System.out.println("Subtraction of two numbers "+firstNumber+" and "+secondNumber+" : "+result);
		
	}
	@Then("calculates subtract of two numbers")
	public void calculates_subtract_of_two_numbers() throws Exception {
		
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.clear_Button(), 5);
		util.Click(driver, calPage.clear_Button(), 2);
		for(int i=0; i<firstNumber.length(); i++) {
			char c = firstNumber.charAt(i);
			util.Click(driver, calPage.number_Buttons(c), 5);
		}
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.multiply_Button(), 2);
		util.Click(driver, calPage.multiply_Button(), 2);
		for(int i=0; i<secondNumber.length(); i++) {
			char c = secondNumber.charAt(i);
			util.Click(driver, calPage.number_Buttons(c), 5);
		}
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.equals_Button(), 2);
		util.Click(driver, calPage.equals_Button(), 2);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.result_Displayed(), 3);
		String result = util.getText(driver, calPage.result_Displayed());
		System.out.println("Multiplication of two numbers "+firstNumber+" and "+secondNumber+" : "+result);
		
	}
	@Then("calculates division of two numbers")
	public void calculates_division_of_two_numbers() throws Exception {
		
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(CurrentMethod);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.clear_Button(), 5);
		util.Click(driver, calPage.clear_Button(), 2);
		for(int i=0; i<firstNumber.length(); i++) {
			char c = firstNumber.charAt(i);
			util.Click(driver, calPage.number_Buttons(c), 5);
		}
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.divide_Button(), 2);
		util.Click(driver, calPage.divide_Button(), 2);
		for(int i=0; i<secondNumber.length(); i++) {
			char c = secondNumber.charAt(i);
			util.Click(driver, calPage.number_Buttons(c), 5);
		}
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.equals_Button(), 2);
		util.Click(driver, calPage.equals_Button(), 2);
		util.wait_for_Element_isDisplayed(CurrentMethod, driver, calPage.result_Displayed(), 3);
		String result = util.getText(driver, calPage.result_Displayed());
		System.out.println("Division of two numbers "+firstNumber+" and "+secondNumber+" : "+result);
		
		util.quit_Driver(driver);
		
	}
	
	
}
