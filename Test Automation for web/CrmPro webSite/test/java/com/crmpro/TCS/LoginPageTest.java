package com.crmpro.TCS;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.crmpro.base.TestBase;
import com.crmpro.pages.LoginPage;
import com.crmpro.util.TestUtils;
import com.relevantcodes.extentreports.LogStatus;
import com.crmpro.pages.HomePage;


import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

import java.lang.reflect.Method;


public class LoginPageTest extends TestBase  {
		public LoginPageTest() throws IOException {
		super();
	}
		LoginPage loginPage;
		HomePage homePage;
		
		
		@Parameters({"browser"})
		@BeforeMethod 
		public void setUp(String browser, Method method) throws ATUTestRecorderException, IOException {
			logger = extent.startTest(method.getName());
			initialization(browser);
			loginPage = new LoginPage();
			recorder = new ATUTestRecorder("C:\\Users\\lenovo\\eclipse-workspace\\CRMMaven\\TestReport",method.getName(),false);
			recorder.start();
		}
		@AfterMethod  
		public void tearDown(Method method, ITestResult result) throws ATUTestRecorderException, IOException {
			TestUtils.takeSnapShot(driver,method.getName());
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
		
		@Test (priority = 1  )
		public void titleTest(Method method) throws IOException {

			String expectedResult = ("CRMPRO - CRM software for customer relationship management, sales, and support.");
			String actualResult = loginPage.getTitle();
			System.out.println(actualResult);
			Assert.assertEquals(actualResult, expectedResult,"The title is not correct");
			System.out.println("Marium is the best tester in the world");
		}
		
		@Test (priority = 2)
		public void urlTest(Method method) throws IOException {
			String expectedResult = ("https://www.crmpro.com/");
			String actualResult = loginPage.getURL();
			System.out.println(actualResult);
			Assert.assertEquals(actualResult, expectedResult,"The URL is not correct");

			



		}
		@Test (priority = 3 )
		public void logoTest(Method method) throws IOException {
			boolean expectedResult = true;
			boolean actualResult = loginPage.logoIsDisplayed();
			System.out.println(actualResult);
			Assert.assertEquals(actualResult, expectedResult,"The logo is not displayed");




		}
		@Test (priority = 4)
		public void loginTest(Method method) throws IOException {	
			homePage = loginPage.performLogin();
			String expectedResult = "Cogmento CRM";
			String actualResult = homePage.getTitle();
			System.out.println(actualResult);
			Assert.assertEquals(actualResult, expectedResult,"The title is not correct");	
		}
		
		
		@DataProvider
		public Object[][] Mydata() {
			//array of 2 dimension 
			//4 no. of rows & 2 no. of colunms
			Object [][] data = new Object[4][2]; 
			data[0][0] ="mariamashraf910@gmail.com" ;		
			data[0][1] ="mero#tester" ;	
			data[1][0] ="mariamashraf910@gmail.com" ;	
			data[1][1] ="hhghjhgj%" ;	
			data[2][0] ="mero23" ;	
			data[2][1] ="mero#tester" ;	
			data[3][0] ="mememdddm" ;	
			data[3][1] ="dheuheu" ;	
			
			return data;
		}
		

}
