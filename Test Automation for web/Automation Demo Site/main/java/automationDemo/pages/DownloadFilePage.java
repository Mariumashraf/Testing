package automationDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DownloadFilePage {
	private WebDriver driver;
	private By textBox = By.xpath("//textarea[@id='textbox']");
	private By generateText = By.xpath("//button[@id='createTxt']");
	private By downloadText = By.xpath("//a[@id='link-to-download']");
	private By pdfBox = By.xpath("//textarea[@id='pdfbox']");
	private By createPdf = By.xpath("//button[@id='createPdf']");
	private By downloadPdf = By.xpath("//a[@id='pdf-link-to-download']");

	public DownloadFilePage(WebDriver driver) {
	}

	public void downloadTextFile(String Data) {
		WebElement textElement = driver.findElement(textBox);
		// driver.switchTo().activeElement();
		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='google_esf']")));
		// driver.switchTo().getClass();
		// Actions action = new Actions(driver);
		// action.moveToElement(textElement).perform();
		textElement.click();
		textElement.sendKeys(Data);
		driver.findElement(generateText).click();
		driver.findElement(downloadText).click();

	}

	
	 public void downloadPdfFile(String Data) { WebElement pdElement =
	  driver.findElement(pdfBox); pdElement.click(); pdElement.sendKeys(Data);
	  driver.findElement(createPdf).click();
	  driver.findElement(downloadPdf).click(); }
	 

}
