package configuration;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import zid.base.BaseClass;

public class Config extends BaseClass {

	public Config() throws IOException {
		super();
	}

	@BeforeSuite
	public void start() {
		// true means delete the old report
		extent = new ExtentReports("C:\\Users\\lenovo\\eclipse-workspace\\TaskZid\\TestReport\\index.html", true);
		extent.addSystemInfo("OS", "Windows");
		extent.addSystemInfo("Owner", "Mariam Ashraf");
		extent.addSystemInfo("Test Name", "Zid Test");
	}

	@AfterSuite
	public void end() {
		extent.flush();

	}
}
