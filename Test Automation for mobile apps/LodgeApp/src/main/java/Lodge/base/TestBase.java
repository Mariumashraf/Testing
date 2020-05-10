package Lodge.base;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


import io.appium.java_client.android.AndroidDriver;

public class TestBase {
	public TestBase() throws IOException {
	
	}
	
	protected static AndroidDriver<WebElement> driver;
	public static ExtentReports extent; //create reports
	public static ExtentTest logger;  //create test cases
	
	public static void initialization() throws MalformedURLException {
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
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

}
