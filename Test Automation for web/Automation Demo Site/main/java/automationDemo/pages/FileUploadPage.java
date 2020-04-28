package automationDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FileUploadPage {

    private WebDriver driver;
	private By browseButton = By.id("input-4");
    private By uploadButton = By.xpath("//span[contains(text(),'Upload')]");
    private By removeButton = By.xpath("//span[contains(text(),'Remove')]");
    
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

  
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(browseButton).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public void deleteFile(){
       driver.findElement(removeButton).click();
    }
}
