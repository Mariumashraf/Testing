package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExplorePage {
	WebDriver driver;

	public ExplorePage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchProperty() {
		// driver.findElement(By.xpath("//div[contains(text(),'For Rent')]")).click();

		driver.findElement(By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-value']")).click();
		
		 driver.findElement(By.xpath("//mat-option[@id='mat-option-904']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Villa')]")).click();


		// driver.findElement(By.xpath("//span[contains(text(),'Flat')]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Done')]")).click();

		driver.findElement(By.xpath("//mat-select[@id='mat-select-3']//div[@class='mat-select-value']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Alexendria')]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Done')]")).click();

		driver.findElement(By.xpath("//mat-select[@id='mat-select-4']//div[@class='mat-select-value']")).click();
		driver.findElement(By.partialLinkText(" Abbis ")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Done')]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");

		driver.findElement(By.xpath("//div[@class='col-12 textcenter']//button[@class='mat-raised-button']")).click();

	}

}
