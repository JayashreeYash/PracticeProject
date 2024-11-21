package ResuableMethods;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utility {
	
//	public AppiumDriver driver;

	public static synchronized String readProperty(String key) {
		String value = null;
		try {
			FileInputStream stream = new FileInputStream(".//ProjectSetting.properties");
			Properties pro = new Properties();
			pro.load(stream);
			value = pro.getProperty(key);
		} catch (Exception e) {

		}
		return value;
	}

	// Mobile Application Utilities

	
