package automationDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    
    public RegisterPage clickGoToRegister() {
    	driver.findElement(By.id("email")).sendKeys("mariamashraf910@gmail.com");
    	driver.findElement(By.id("enterimg")).click();
    	return new RegisterPage(driver);
    }


}
