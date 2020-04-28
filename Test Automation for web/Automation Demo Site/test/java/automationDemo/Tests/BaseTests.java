package automationDemo.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationDemo.pages.HomePage;
import automationDemo.pages.RegisterPage;

public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;
    protected RegisterPage registerPage;
	
    
    @BeforeClass
    public void setUp(){
      
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver(); 
        
    }
    
  
    @BeforeMethod
    public void goHome() {
    	driver.get("http://demo.automationtesting.in/Index.html");
        homePage = new HomePage(driver);
        registerPage = homePage.clickGoToRegister();
    }

    @AfterClass
    public void tearDown(){
       // driver.quit();
    }
    

}
