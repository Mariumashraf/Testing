package registrationTestCases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTests;
import junit.framework.Assert;
import pages.RegistrationPage;
import utils.TestUtils;

public class RegistrationPageTest extends BaseTests {

	@Test(priority = 1, dataProvider = "validData")
	public void validRegisterTest(String name, String phone, String email, String password, String nameEn,
			String nameAr, String value) throws InterruptedException, IOException {
		RegistrationPage registrationPage = homePage.clickOnRegister();
		registrationPage.setAccount(name, phone, email, password, nameEn, nameAr, value);
		Thread.sleep(10000);

		String expectedResult = "https://web.zid.sa/home";
		String actualResult = driver.getCurrentUrl();
		Assert.assertEquals(expectedResult, actualResult);

	}

	@Test(priority = 2, dataProvider = "invalidData")
	public void inValidRegisterTest(String name, String phone, String email, String password, String nameEn,
			String nameAr, String value) throws IOException, InterruptedException {
		RegistrationPage registrationPage = homePage.clickOnRegister();
		registrationPage.setAccount(name, phone, email, password, nameEn, nameAr, value);
		Thread.sleep(10000);

		String expectedResult = "https://web.zid.sa/register";
		String actualResult = driver.getCurrentUrl();
		Assert.assertEquals(expectedResult, actualResult);

	}

	@DataProvider
	public Object[][] validData() throws IOException {
		Object data[][] = TestUtils.getDataFromExcel("F:\\zid\\SignUpValidData.xlsx", "Sheet1");
		return data;

	}

	@DataProvider
	public Object[][] invalidData() throws IOException {
		Object data[][] = TestUtils.getDataFromExcel("F:\\zid\\SignUpInvalidData.xlsx", "Sheet1");
		return data;

	}
}