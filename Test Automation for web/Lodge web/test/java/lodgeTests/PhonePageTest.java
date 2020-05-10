package lodgeTests;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.HomePage;
import pages.PhonePage;
import pages.SignUpPage;

public class PhonePageTest extends BaseTests {
	SignUpPage signUpPage;
	PhonePage phonePage;
	HomePage homePage;

	@Test
	public void performRegister() {
		homePage = new HomePage(driver);
		signUpPage = homePage.clickOnSignUp();
		signUpPage = new SignUpPage(driver);
		phonePage = signUpPage.performSingUp();
		phonePage = new PhonePage(driver);
		phonePage.setPhone();

	}

}
