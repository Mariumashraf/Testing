package automationDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
	
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[@class='btn btn-danger']");
    private By triggerConfirmButton = By.xpath(".//button[text()='click the button to display a confirm box ']");
    private By triggerPromptButton = By.xpath(".//button[text()='click the button to demonstrate the prompt box ']");
    private By results = By.id("demo");


	public AlertsPage(WebDriver driver) {
        this.driver = driver;
	}
	
	public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm(){
    	driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt(){
    	driver.findElement(By.cssSelector("div.container.center:nth-child(2) div.row div.col-md-12 div.nav.nav-tabs div.tabpane.pullleft ul.nav.nav-tabs.nav-stacked > li:nth-child(3)")).click();
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }
	
	

}
