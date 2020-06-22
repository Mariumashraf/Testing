package camelan.configuration;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import camelan.base.TestBase;

public class Config extends TestBase{
	
	public Config() throws IOException {
		super();
	}
	
	//@BeforeSuite
	//public void start() {
		//true means delete the old report
		/*extent = new ExtentReports("C:\\Users\\lenovo\\eclipse-workspace\\Camelan\\TestReport\\index.html",true);
		extent.addSystemInfo("OS", "Android");
		extent.addSystemInfo("Owner", "Mariam Ashraf");
		extent.addSystemInfo("Test Name", "Camelan Test");		
	}
	
	@AfterSuite
	public void end() {
		extent.flush();
		
	}*/

}
