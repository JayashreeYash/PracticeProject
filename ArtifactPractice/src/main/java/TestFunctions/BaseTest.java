package TestFunctions;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import ResuableMethods.Utility;
import io.appium.java_client.AppiumDriver;

public class BaseTest {
	
	public AppiumDriver driver;
	Utility util = new Utility();
	
	String platform = util.readProperty("Platform");
	
	public void setup() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		if(platform.equalsIgnoreCase("Android")) {
			caps.setCapability("appium:deviceName", util.readProperty("Device_Name"));
			caps.setCapability("appium:platformName", util.readProperty("Platform"));
			caps.setCapability("appium:platformVersion", util.readProperty("Platform_Version"));
			caps.setCapability("appium:app", util.readProperty("App"));
			caps.setCapability("appium:automationName", util.readProperty("Automation_Name"));
			caps.setCapability("noReset", true);
			caps.setCapability("autoGrantPermissions", true);
//			caps.setCapability("appium:appPackage", util.readProperty("AppPackage"));
		}else if(platform.equalsIgnoreCase("Ios")) {
			
		}
		
		try {
			
			driver = new AppiumDriver<>(new URL(util.readProperty("Appium_Url")), caps);
			System.out.println("Driver Initialized Successfully : " + platform);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}catch (Exception e) {
			System.out.println("Failed to Initialized Driver. Please check Appium url");
			e.printStackTrace();
		}
		
	}

}
