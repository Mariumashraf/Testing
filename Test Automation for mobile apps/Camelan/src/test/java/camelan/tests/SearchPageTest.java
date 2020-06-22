package camelan.tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import camelan.base.TestBase;
import camelan.pages.ListAdsPage;
import camelan.pages.SearchPage;
import camelan.utils.TestUtils;

public class SearchPageTest extends TestBase {
	ListAdsPage listAdsPage;
	SearchPage searchPage;

	public SearchPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup(Method method) throws IOException {
		initialization();
		listAdsPage = new ListAdsPage(driver);
	}

	@Test
	public void SearchAd(Method method) throws IOException {
		searchPage = listAdsPage.clickOnSearch();
		searchPage.searchAd();
	}

	@AfterMethod
	public void afterTest(Method method, ITestResult result) throws InterruptedException, IOException {
		Thread.sleep(8000);

		TestUtils.takeSnapShot(driver, method.getName());
		driver.quit();
	}

}
