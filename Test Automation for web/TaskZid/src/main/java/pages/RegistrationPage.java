package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	private WebDriver driver;

	private By fullName = By.id("name");
	private By codsList = By
			.xpath("//a[@class='input-group-addon-ltr input-group-addon dropdown-toggle login-inputs']");
	private By emiratesCode = By.xpath("//li[6]");
	private By phoneNumber = By.id("mobile");
	private By emailField = By.id("registration_email");
	private By passwordField = By.id("registration_password");
	private By nextButton = By.xpath("//button[@class='btn next-tab-btn']");
	private By storeNameEn = By.id("store_username");
	private By storeNameAr = By.id("store_name");
	private By yesRadioButton = By.id("started_business_before_registration_yes");
	private By register = By.xpath("//button[@class='btn btn-primary login-btn']");

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;

	}

	public void setAccount(String name, String phone, String email, String password, String nameEn, String nameAr,
			String value) throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(fullName).sendKeys(name);
		driver.findElement(codsList).click();
		driver.findElement(emiratesCode).click();
		driver.findElement(phoneNumber).sendKeys(phone);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(passwordField).sendKeys(password);

		driver.findElement(nextButton).click();
		driver.findElement(storeNameEn).sendKeys(nameEn);
		driver.findElement(storeNameAr).sendKeys(nameAr);
		WebElement storeCategory = driver.findElement(By.name("store_category_id"));
		Select categoryValue = new Select(storeCategory);
		categoryValue.selectByValue(value);
		driver.findElement(yesRadioButton).click();
		driver.findElement(register).click();

	}

}
