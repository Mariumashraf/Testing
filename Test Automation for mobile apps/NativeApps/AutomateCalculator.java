package appium.demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;


import io.appium.java_client.android.AndroidDriver;

public class AutomateCalculator {
	AndroidDriver<WebElement> driver;
	
	@Test 
	public void testCalculator() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Marium");
		caps.setCapability("udid", "ce5e5c1e");

		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator1");
		caps.setCapability("bundleId", "com.coloros.calculator");
		caps.setCapability("appPackage", "com.coloros.calculator");
		caps.setCapability("appWaitPackage", "com.coloros.calculator");

		caps.setCapability("AppActivity", "com.android.calculator2.Calculator");
		caps.setCapability("appWaitActivity", "com.android.calculator2.Calculator");
		caps.setCapability("appWaitDuration", 100000);


		caps.setCapability("noReset", true);
		caps.setCapability("fullReset", false);
		

		File file = new File("D:\\Testing\\Appium\\cal.apk");
		caps.setCapability("app", file.getAbsolutePath());
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElementById("com.coloros.calculator:id/digit_3").click();
		driver.findElementById("com.coloros.calculator:id/op_add").click();
		driver.findElementById("com.coloros.calculator:id/digit_7").click();
		driver.findElementById("com.coloros.calculator:id/eq").click();
		
		WebElement resultElement = driver.findElementById("com.coloros.calculator:id/result");
		Assert.assertEquals(resultElement.getText(), "10");
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}


}
