package lodgeTests;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.LoginPage;

public class LoginPageTest extends BaseTests {
	@Test
	public void login() {
		LoginPage loginPage = homePage.clickOnLogin();
		loginPage.performLogin();
		
	}

}
