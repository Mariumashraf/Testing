package base;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.LogStatus;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import pages.HomePage;
import utils.TestUtils;
import zid.base.BaseClass;

public class BaseTests extends BaseClass {
	protected HomePage homePage;
	int counter = 1;

	@BeforeClass
	public void setUp() {
		initialization();

	}

	@org.testng.annotations.Parameters({ "URL" })
	@BeforeMethod
	public void goHome(String URL, Method method) throws ATUTestRecorderException {
		// String timeStamp = new
		// SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

		// int counter = 1;

		logger = extent.startTest(method.getName() + counter);
		recorder = new ATUTestRecorder("C:\\Users\\lenovo\\eclipse-workspace\\TaskZid\\TestReport",
				method.getName() + counter, false);
		recorder.start();
		initializationHome(URL);
		homePage = new HomePage(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@AfterMethod
	public void record(Method method, ITestResult result)
			throws IOException, InterruptedException, ATUTestRecorderException {
		TestUtils.takeSnapShot(method.getName() + counter);
		recorder.stop();

		if (result.getStatus() == ITestResult.SUCCESS) {
			// logger.log(LogStatus.PASS, "Test Pass");
			String picturePath = TestUtils.takeSnapShot(result.getName() + counter);
			logger.log(LogStatus.PASS, logger.addScreenCapture(picturePath));
			logger.log(LogStatus.PASS, "<a href='" + result.getName() + counter + ".mov"
					+ "'download><span class='lable info'>Video</span></a>");

			logger.log(LogStatus.PASS, "<a href='" + result.getName() + counter + ".png"
					+ "'download><span class='lable info'>SnapShot</span></a>");

		} else if (result.getStatus() == ITestResult.FAILURE) {
			// logger.log(LogStatus.FAIL, "Test Failed");
			logger.log(LogStatus.FAIL, "The testcase is failed because of " + result.getThrowable());
			String picturePath = TestUtils.takeSnapShot(result.getName() + counter);
			logger.log(LogStatus.FAIL, logger.addScreenCapture(picturePath));
			logger.log(LogStatus.FAIL, "<a href='" + result.getName() + counter + ".mov"
					+ "'download><span class='lable info'>Video</span></a>");

			logger.log(LogStatus.FAIL, "<a href='" + result.getName() + counter + ".png"
					+ "'download><span class='lable info'>SnapShot</span></a>");

		} else {
			// logger.log(LogStatus.SKIP, "Test Skkiped");

			logger.log(LogStatus.SKIP, "Test Skipped because of " + result.getThrowable());
			String picturePath = TestUtils.takeSnapShot(result.getName() + counter);
			logger.log(LogStatus.SKIP, logger.addScreenCapture(picturePath));
			logger.log(LogStatus.SKIP, "<a href='" + result.getName() + counter + ".mov"
					+ "'download><span class='lable info'>Video</span></a>");

			logger.log(LogStatus.SKIP, "<a href='" + result.getName() + counter + ".png"
					+ "'download><span class='lable info'>SnapShot</span></a>");

		}
		extent.endTest(logger);
		counter++;
		// Thread.sleep(8000);
		// driver.quit();
	}

}
