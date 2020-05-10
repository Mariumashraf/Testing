package Lodge.Tests;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.appium.java_client.android.AndroidDriver;



public class loginTest {
	static AndroidDriver<WebElement> driver;
	
	@Test 
	public void testLogin(Method method) throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Marium");
		caps.setCapability("udid", "ce5e5c1e");

		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator1");
		caps.setCapability("bundleId", "com.innovitics.lodge");
		caps.setCapability("AppPackage", "com.innovitics.lodge");
		caps.setCapability("appWaitPackage", "com.innovitics.lodge");

		caps.setCapability("AppActivity", ".AppActivities.MainActivity");
		caps.setCapability("appWaitActivity", ".AppActivities.MainActivity");
		caps.setCapability("appWaitDuration", 100000);


		caps.setCapability("noReset", true);
		caps.setCapability("fullReset", false);
		

		File file = new File("F:\\lodge\\lodge.apk");
		caps.setCapability("app", file.getAbsolutePath());
		
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("com.innovitics.lodge:id/SignUpButtonID")).click();
		
		
		
	}
	
	@AfterMethod
	public void afterTest(Method method) throws InterruptedException, IOException, ATUTestRecorderException {
		takeSnapShot(method.getName());
		Thread.sleep(10000);
		driver.quit();
	

	}
	public static void takeSnapShot(String name) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\lenovo\\eclipse-workspace\\Lodge\\Snapshots\\"+name+".png"));
		
	}
  

}
