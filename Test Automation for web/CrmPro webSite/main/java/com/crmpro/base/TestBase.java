package com.crmpro.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crmpro.util.WebListener;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import atu.testrecorder.ATUTestRecorder;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebListener webListener;
	public static ATUTestRecorder recorder;
	public static ExtentReports extent; //create reports
	public static ExtentTest logger;  //create test cases
	
	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\CRMMaven\\src\\main\\java\\com\\crmpro\\config\\config.properties");
		prop.load(fis);
		
	}
	
	
	public static void initialization (String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\ec2\\freeCRMApp\\resources\\chromedriver.exe");
		    driver = new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","D:\\Testing\\seleniumarabic\\geckodriver.exe");
		    driver = new FirefoxDriver();
			
			
		}
		
		

	    e_driver = new EventFiringWebDriver(driver);
	    webListener = new WebListener();
	    e_driver.register(webListener);
	    driver = e_driver;
	    
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}


	




}
