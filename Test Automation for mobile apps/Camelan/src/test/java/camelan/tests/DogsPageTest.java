package camelan.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import camelan.base.TestBase;
import camelan.pages.DogsPage;
import camelan.pages.ListAdsPage;
import camelan.utils.TestUtils;

public class DogsPageTest extends TestBase {
	ListAdsPage listAdsPage;
	DogsPage dogsPage;

	public DogsPageTest() throws IOException {
		super();
	}

	public void setup(Method method) throws IOException {
		initialization();
		listAdsPage = new ListAdsPage(driver);
	}

	@Test
	public void clickOnAd(Method method) throws IOException {
		dogsPage = listAdsPage.clickOnDogsCategory();
		dogsPage.clickOnFirstAd();
	}

	@AfterMethod
	public void afterTestt(Method method, ITestResult result) throws InterruptedException, IOException {
		Thread.sleep(10000);
		TestUtils.takeSnapShot(driver, method.getName());
		driver.quit();
	}

}
