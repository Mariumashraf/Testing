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

public class AutomateWhatsApp {
	AndroidDriver<WebElement> driver;
	
	@Test
	public void testWhatsApp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Marium");
		caps.setCapability("udid", "ce5e5c1e");

		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator1");
		caps.setCapability("bundleId", "com.whatsapp");
		caps.setCapability("AppPackage", "com.whatsapp");
		caps.setCapability("appWaitPackage", "com.whatsapp");

		caps.setCapability("AppActivity", ".HomeActivity");
		caps.setCapability("appWaitActivity", ".HomeActivity");
		caps.setCapability("appWaitDuration", 100000);


		caps.setCapability("noReset", true);
		caps.setCapability("fullReset", false);
		

		File file = new File("D:\\Testing\\Appium\\whatsapp.apk");
		caps.setCapability("app", file.getAbsolutePath());
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	


}
