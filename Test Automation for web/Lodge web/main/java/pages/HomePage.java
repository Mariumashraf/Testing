package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	   private WebDriver driver;

	    public HomePage(WebDriver driver){
	        this.driver = driver;
	    }
	    
	    public LoginPage clickOnLogin(){
	    	driver.findElement(By.xpath("//span[@class='mat-select-placeholder ng-tns-c9-0 ng-star-inserted']")).click();
	    	driver.findElement(By.xpath("//mat-option[@id='mat-option-0']")).click();
	        return new LoginPage(driver);
	    }
	    
	    public SignUpPage clickOnSignUp() {
	    	driver.findElement(By.xpath("//span[@class='mat-select-placeholder ng-tns-c9-0 ng-star-inserted']")).click();
	    	driver.findElement(By.xpath("//mat-option[@id='mat-option-1']")).click();
	    	return new SignUpPage(driver);

	    	
	    }
	    
	    public ExplorePage clickOnExplore() {
	    	driver.findElement(By.xpath("//i[@class='icon-explore-tab']")).click();
	    	return new ExplorePage(driver);
	    }

}
