package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhonePage {
	WebDriver driver;
	public PhonePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void setPhone() {
	driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("01252369874");
		driver.findElement(By.xpath("//div[@class='favorites']//button[@class='mat-raised-button']")).click();
	}

}
