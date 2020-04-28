package com.crmpro.TCS;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import com.crmpro.base.TestBase;
import com.crmpro.pages.ContactPage;
import com.crmpro.pages.HomePage;
import com.crmpro.pages.LoginPage;
import com.crmpro.util.TestUtils;
import com.relevantcodes.extentreports.LogStatus;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;



public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	
	public HomePageTest() throws IOException {
		super();
	}
	
    @Parameters({"browser"})
	@BeforeMethod 
	public void login(String browser, Method method) throws ATUTestRecorderException, IOException {
		logger = extent.startTest(method.getName());
		initialization(browser);
		loginPage = new LoginPage();
		recorder = new ATUTestRecorder("C:\\Users\\lenovo\\eclipse-workspace\\CRMMaven\\TestReport",method.getName(),false);
		recorder.start();		
		homePage = loginPage.performLogin();
		
	}
	
	@Test (priority = 1 )
	public void clickOnContactsTest(Method method) throws IOException { 
		contactPage = homePage.clickOnContacts();
		boolean actualResult = homePage.isContactOptionsDisplayed();
		Assert.assertTrue(actualResult,"The option label is not displayed");	
	}
	
	
	@Test (priority = 2 )
	public void clickOnDealsTest(Method method) throws IOException { 
		homePage.clickOnDeals();
		boolean actualResult = homePage.isCompanyLabelDisplayed();
		Assert.assertTrue(actualResult,"The company label is not displayed");


	}
	
	@Test (priority = 3 )
	public void clickOnTasksTest(Method method) throws IOException { 
		homePage.clickOnTasks();
		boolean actualResult = homePage.isContactOptionsDisplayed();
		Assert.assertTrue(actualResult,"The option label is not displayed");


	}
	@Test (priority = 4 )
	public void clickOnUsernameTest(Method method) throws IOException { 
		boolean actualResult = homePage.isUsernameIsDisplayed();
		Assert.assertTrue(actualResult,"The username is not displayed");


	}
	
	@AfterMethod 
	public void tearDown(Method method, ITestResult result) throws ATUTestRecorderException, IOException {
		TestUtils.takeSnapShot(driver, method.getName());
		recorder.stop();
		if(result.getStatus() == ITestResult.SUCCESS) {
			/*	logger.log(LogStatus.PASS, "Test Pass");
			logger.log(LogStatus.PASS, "<a hraf='" + result.getName() + ".png" +"'><span class='label info'>Dowmload SnapShot</span></a");
			logger.log(LogStatus.PASS, "<a hraf='" + result.getName() + ".mov" +"'><span class='label info'>Dowmload Video</span></a");*/
			 String picturePath = TestUtils.takeSnapShot(driver, result.getName());
			 logger.log(LogStatus.PASS, logger.addScreenCapture(picturePath));
			 logger.log(LogStatus.PASS, "<a href='"+result.getName()+".mov" + "'download><span class='lable info'>Video</span></a>");
			 logger.log(LogStatus.PASS, "<a href='"+ result.getName()+".png" +"'download><span class='lable info'>SnapShot</span></a>");

			

		}else if (result.getStatus() == ITestResult.FAILURE) {
			/*logger.log(LogStatus.FAIL,result.getThrowable());
			logger.log(LogStatus.FAIL, "<a hraf='" + result.getName() + ".png" +"'><span class='label info'>Dowmload SnapShot</span></a");
			logger.log(LogStatus.FAIL, "<a hraf='" + result.getName() + ".mov" +"'><span class='label info'>Dowmload Video</span></a");*/
			 logger.log(LogStatus.FAIL, "The testcase is failed because of " + result.getThrowable());
			 String picturePath = TestUtils.takeSnapShot(driver, result.getName());
			 logger.log(LogStatus.FAIL, logger.addScreenCapture(picturePath));
			 logger.log(LogStatus.FAIL, "<a href='"+result.getName()+".mov" + "'><spanclass='lable info'>Video</span></a>");
			 logger.log(LogStatus.FAIL, "<a href='"+ result.getName()+".png" +"'download><span class='lable info'>SnapShot</span></a>");


		}else {
			logger.log(LogStatus.SKIP, "Test Skipped because of " + result.getThrowable());
			String picturePath = TestUtils.takeSnapShot(driver, result.getName());
			logger.log(LogStatus.SKIP, logger.addScreenCapture(picturePath));
			logger.log(LogStatus.SKIP, "<a href='"+result.getName()+".mov" + "'><spanclass='lable info'> Video</span></a>");
			logger.log(LogStatus.SKIP, "<a href='"+ result.getName()+".png" +"'download><span class='lable info'>SnapShot</span></a>");


			//logger.log(LogStatus.SKIP, "<a hraf='" + result.getName() + ".png" +"'><span class='label info'>Dowmload SnapShot</span></a");
			//logger.log(LogStatus.SKIP, "<a hraf='" + result.getName() + ".mov" +"'><span class='label info'>Dowmload Video</span></a");
		
		}
		extent.endTest(logger);
		driver.quit();
		
	}


}
