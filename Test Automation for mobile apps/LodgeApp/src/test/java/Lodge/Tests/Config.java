package Lodge.Tests;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import Lodge.base.TestBase;

public class Config extends TestBase {
	

	public Config() throws IOException {
		super();
	}
	
	@BeforeSuite
	public void start() {
		//true means delete the old report
		extent = new ExtentReports("C:\\Users\\lenovo\\eclipse-workspace\\Lodge\\TestReport\\index.html",true);
		extent.addSystemInfo("OS", "Android");
		extent.addSystemInfo("Owner", "Mariam Ashraf");
		extent.addSystemInfo("Test Name", "Lodge Test");		
	}
	
	@AfterSuite
	public void end() {
		extent.flush();
		
	}
	

}
