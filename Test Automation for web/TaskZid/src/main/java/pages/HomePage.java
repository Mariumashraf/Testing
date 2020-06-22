package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	private By registerButton = By.xpath("//a[@class='a--white btn']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public RegistrationPage clickOnRegister() throws IOException {
		driver.findElement(registerButton).click();
		return new RegistrationPage(driver);
	}

}
