package com.crmpro.TCS;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.crmpro.base.TestBase;
import com.relevantcodes.extentreports.ExtentReports;

public class Config extends TestBase {

	public Config() throws IOException {
		super();
	}
	
	@BeforeSuite
	public void start() {
		//true means delete the old report
		extent = new ExtentReports("C:\\Users\\lenovo\\eclipse-workspace\\CRMMaven\\TestReport\\index.html",true);
		extent.addSystemInfo("OS", "Windows");
		extent.addSystemInfo("Owner", "Mariam Ashraf");
		extent.addSystemInfo("Test Name", "CRM PRO Test");


		
		
	}
	
	@AfterSuite
	public void end() {
		extent.flush();
		
	}

}
