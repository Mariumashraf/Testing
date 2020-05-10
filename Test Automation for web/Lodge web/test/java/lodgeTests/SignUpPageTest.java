package lodgeTests;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.SignUpPage;

public class SignUpPageTest extends BaseTests{
	
	@Test
	public void register() {
		SignUpPage signUpPage = homePage.clickOnSignUp();
		signUpPage.performSingUp();
	}

}
