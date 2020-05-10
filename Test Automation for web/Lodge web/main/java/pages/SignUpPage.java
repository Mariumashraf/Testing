package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	WebDriver driver;
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public PhonePage performSingUp() {
		driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).sendKeys("MARIUM");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email Address')]")).sendKeys("amarium430@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("mero#tester");
		driver.findElement(By.xpath("//span[contains(text(),'SIGN UP')]")).click();

		return new PhonePage(driver);
		
	}

}
