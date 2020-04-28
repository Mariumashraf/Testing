package automationDemo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver driver;

	public RegisterPage(WebDriver driver) {
        this.driver = driver;
	}
	public void setFirstName(String firstName) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);
		
	}
	
	public void setLastName(String lastName) {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
		
	}
	public void setAddress(String address) {
		driver.findElement(By.tagName("textarea")).sendKeys(address);
		
	}
	public void setEmail(String email) {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		
	}
	public void setPhone(String phone) {
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phone);
		
	}
	public void setGenderFemale() {
		driver.findElement(By.xpath("//label[2]//input[1]")).click();
		
	}
	public void setGenderMale() {
		driver.findElement(By.xpath("//label[1]//input[1]")).click();
		
	}
	public void setHobby() {
		driver.findElement(By.id("checkbox2")).click();
		
	}
	
   /* private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }
    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
        
    }*/
	
	public void selectLanguage() {
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'French')]")).click();
		driver.findElement(By.id("imagetrgt")).click();
		
	}
	public void selectSkills(String option) {
		WebElement skill = driver.findElement(By.id("Skills"));
		Select skillvalue = new Select(skill);
	    skillvalue.selectByVisibleText(option);
		//skillvalue.selectByValue("Java");
		//skillvalue.selectByIndex(9);

	}
	
	public void selectCountry(String option) {
		WebElement country = driver.findElement(By.id("countries"));
		Select countryvalue = new Select(country);
		countryvalue.selectByValue(option);
		//skillvalue.selectByValue("Egypt");

	}
	public void selectCountry2() {
		WebElement country2 = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		country2.click();
		WebElement counElement = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		counElement.sendKeys("Hong Kong"+Keys.ENTER);
		
		
		//List<WebElement> options = country2.findElements(By.className("select2-country-container"));
		//options.get(0).click();
		

	}
	
	public void chooseBirthDay(String option1, String option2, String option3) {
		WebElement day = driver.findElement(By.id("daybox"));
		Select dayvalue = new Select(day);
		dayvalue.selectByVisibleText(option1);
		//dayvalue.deselectByVisibleText("3");


		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select monthvalue = new Select(month);
		monthvalue.selectByVisibleText(option2);
		//monthvalue.deselectByVisibleText("December");


		WebElement year = driver.findElement(By.id("yearbox"));
		Select yearvalue = new Select(year);
		yearvalue.selectByVisibleText(option3);
//		yearvalue.deselectByVisibleText("1995");


	}
	
	public void setPasswords(String pass) {
		driver.findElement(By.id("firstpassword")).sendKeys(pass);
		driver.findElement(By.id("secondpassword")).sendKeys(pass);

	}
	public void clickOnSubmit() {
		driver.findElement(By.id("submitbtn")).click();
		
	}
	   public AlertsPage clickAlerts() {
	    	driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
	    	driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
	    	return new AlertsPage(driver);
	    	
		}
	   
	   public FileUploadPage clickUpload() {
		   driver.findElement(By.xpath("//a[contains(text(),'More')]")).click();
		   driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
	    	return new FileUploadPage(driver);

	   }
	   
	   public DownloadFilePage clickDownload() {
		   driver.findElement(By.xpath("//a[contains(text(),'More')]")).click();
		   driver.findElement(By.xpath("//a[contains(text(),'File Download')]")).click();
	    	return new DownloadFilePage(driver);

	   }
	
	
	
	

}
