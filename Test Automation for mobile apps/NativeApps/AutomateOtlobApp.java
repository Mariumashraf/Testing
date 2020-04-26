package appium.demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AutomateOtlobApp {
	AndroidDriver<WebElement> driver;
	@Test 
	public void testLogin() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Marium");
		caps.setCapability("udid", "ce5e5c1e");

		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator1");
		caps.setCapability("bundleId", "otlob.UI");
		caps.setCapability("AppPackage", "otlob.UI");
		caps.setCapability("appWaitPackage", "otlob.UI");

		caps.setCapability("AppActivity", "com.talabat.HomeScreen");
		caps.setCapability("appWaitActivity", "com.talabat.HomeScreen");
		caps.setCapability("appWaitDuration", 100000);


		caps.setCapability("noReset", true);
		caps.setCapability("fullReset", false);
		

		File file = new File("C:\\Users\\lenovo\\eclipse-workspace\\demo\\apk\\Otlob.apk");
		caps.setCapability("app", file.getAbsolutePath());
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"otlob.UI:id/btnLogin\")" ).click();	
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.google.android.gms:id/credential_primary_label\")" ).click();
		
		//driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"otlob.UI:id/eTEmail\")" ).sendKeys("mariamashraf910@gmail.com");
		//driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"otlob.UI:id/eTPassword\")" ).sendKeys("mero1995");
		//driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"otlob.UI:id/btnLogin\")" ).click();
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}


}
