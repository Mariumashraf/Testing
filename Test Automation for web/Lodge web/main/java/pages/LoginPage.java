package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void performLogin() {
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email Address')]")).sendKeys("mariamashraf910@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("mero#tester");
		driver.findElement(By.xpath("//span[@class='mat-button-wrapper']//b[contains(text(),'SIGN IN')]")).click();
	}

}
