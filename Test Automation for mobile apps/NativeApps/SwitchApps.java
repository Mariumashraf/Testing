package appium.demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwitchApps {
	AndroidDriver<WebElement> driver;
	DesiredCapabilities caps = new DesiredCapabilities();

	@BeforeTest
	public void Capabi() {
		caps.setCapability("deviceName", "Marium");
		caps.setCapability("udid", "ce5e5c1e");

		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator1");
		
		caps.setCapability("noReset", true);
		caps.setCapability("fullReset", false);
	}
	public void otlob() throws MalformedURLException {
		caps.setCapability("bundleId", "otlob.UI");
		caps.setCapability("AppPackage", "otlob.UI");
		caps.setCapability("appWaitPackage", "otlob.UI");

		caps.setCapability("AppActivity", "com.talabat.HomeScreen");
		caps.setCapability("appWaitActivity", "com.talabat.HomeScreen");
		caps.setCapability("appWaitDuration", 100000);

		File file = new File("C:\\Users\\lenovo\\eclipse-workspace\\demo\\apk\\Otlob.apk");
		caps.setCapability("app", file.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}
	public void whatsapp() throws MalformedURLException {
		caps.setCapability("bundleId", "com.whatsapp");
		caps.setCapability("AppPackage", "com.whatsapp");
		caps.setCapability("appWaitPackage", "com.whatsapp");

		caps.setCapability("AppActivity", ".HomeActivity");
		caps.setCapability("appWaitActivity", ".HomeActivity");
		caps.setCapability("appWaitDuration", 100000);
		
		File file = new File("D:\\Testing\\Appium\\whatsapp.apk");
		caps.setCapability("app", file.getAbsolutePath());
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	public void calculator() throws MalformedURLException {
		caps.setCapability("bundleId", "com.coloros.calculator");
		caps.setCapability("appPackage", "com.coloros.calculator");
		caps.setCapability("appWaitPackage", "com.coloros.calculator");

		caps.setCapability("AppActivity", "com.android.calculator2.Calculator");
		caps.setCapability("appWaitActivity", "com.android.calculator2.Calculator");
		caps.setCapability("appWaitDuration", 100000);
		
		File file = new File("D:\\Testing\\Appium\\cal.apk");
		caps.setCapability("app", file.getAbsolutePath());
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Test
	public void testSwitch() throws MalformedURLException {
	otlob();
	whatsapp();
	calculator();
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException{
	Thread.sleep(5000);
	driver.quit();
	}
}
