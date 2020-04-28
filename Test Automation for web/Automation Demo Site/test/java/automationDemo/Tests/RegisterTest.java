package automationDemo.Tests;

import org.testng.annotations.Test;

import automationDemo.pages.HomePage;
import automationDemo.pages.RegisterPage;

public class RegisterTest extends BaseTests {
	protected HomePage homePage;

	protected RegisterPage registerPage;
	
	@Test
	public void testResgister() {
		registerPage= new RegisterPage(driver);
		registerPage.setFirstName("Marium");
		registerPage.setLastName("Ashraf");
		registerPage.setAddress("Dokki");
		registerPage.setEmail("mariamashraf910@gmail.com");
		registerPage.setPhone("8000187025");
		registerPage.setGenderFemale();
		registerPage.setHobby();
		registerPage.selectLanguage();
		registerPage.selectSkills("Java");
		registerPage.selectCountry("Egypt");
		registerPage.selectCountry2();
		registerPage.chooseBirthDay("3", "December", "1995");
		registerPage.setPasswords("mEro#&*12354548");
		registerPage.clickOnSubmit();
		
		
	}

}
