package Lodge.Tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Lodge.base.TestBase;
import Lodge.pages.ExplorePage;
import Lodge.pages.FirstPage;
import Lodge.pages.HomePage;
import Lodge.util.TestUtils;

public class ExplorePageTest extends TestBase {
	FirstPage firstPage;
	HomePage homePage;
	ExplorePage explorePage;
	
	public ExplorePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup(Method method) throws IOException {
		logger = extent.startTest(method.getName());
		initialization();
		firstPage = new FirstPage();
		homePage = firstPage.clickOnGuest();

	}

	@Test
	public void searchProperty() throws IOException {
		homePage = new HomePage();
		explorePage = homePage.clickOnExplore();
		explorePage = new ExplorePage();
		explorePage.searchProperty();
			}

	@AfterMethod
	public void afterTest(Method method, ITestResult result) throws InterruptedException, IOException {
		TestUtils.takeSnapShot(driver, method.getName());

		if (result.getStatus() == ITestResult.SUCCESS) {
			String picturePath = TestUtils.takeSnapShot(driver, result.getName());
			logger.log(LogStatus.PASS, logger.addScreenCapture(picturePath));
			logger.log(LogStatus.PASS,
					"<a href='" + result.getName() + ".png" + "'download><span class='lable info'>SnapShot</span></a>");

		} else if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "The testcase is failed because of " + result.getThrowable());
			String picturePath = TestUtils.takeSnapShot(driver, result.getName());
			logger.log(LogStatus.FAIL, logger.addScreenCapture(picturePath));
			logger.log(LogStatus.FAIL,
					"<a href='" + result.getName() + ".png" + "'download><span class='lable info'>SnapShot</span></a>");

		} else {
			logger.log(LogStatus.SKIP, "Test Skipped because of " + result.getThrowable());
			String picturePath = TestUtils.takeSnapShot(driver, result.getName());
			logger.log(LogStatus.SKIP, logger.addScreenCapture(picturePath));
			logger.log(LogStatus.SKIP,
					"<a href='" + result.getName() + ".png" + "'download><span class='lable info'>SnapShot</span></a>");

		}
		extent.endTest(logger);
		Thread.sleep(5000);
		driver.quit();
	}
	

}