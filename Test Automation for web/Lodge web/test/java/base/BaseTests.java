package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseTests {
	protected HomePage homePage;
	protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	    driver = new ChromeDriver();

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://letslodge.com/en");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
      //  driver.quit();
    }
    
   /* @AfterMethod
    public void record() {
    	
    }*/
    

}
