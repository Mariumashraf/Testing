package appium.courseHendi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AutomateAmazon {
	AndroidDriver<AndroidElement> driver;
	
	@Test
	public void testAmazon() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "Marium");
		capabilities.setCapability("udid", "ce5e5c1e");
		capabilities.setCapability("platformVersion","9.0");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("automationName", "UiAutomator1");
		capabilities.setCapability("chromedriverExecutableDir", "C:\\Users\\lenovo\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
		capabilities.setCapability("chromedriverUseSystemExecutable", true);
		capabilities.setCapability("appPackage","com.android.chrome");
		capabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");

		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		Set<String> contexts = driver.getContextHandles();
		System.out.println(contexts.size());
		for(String context : contexts){
		System.out.println(context);
		
		}
		driver.context("NATIVE_APP");
		
		driver.get("http://www.amazon.com");
		driver.findElement(By.id("nav-search-keywords")).sendKeys("Clothes");
		driver.findElement(By.id("issDiv1")).click();
	
	}
	@AfterTest
	public void afterTest() throws InterruptedException{
	Thread.sleep(5000);
	driver.quit();
	}


}
