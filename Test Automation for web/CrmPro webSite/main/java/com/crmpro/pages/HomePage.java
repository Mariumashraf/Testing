package com.crmpro.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='main-nav']//a[3]")
	WebElement contacts;
	
	@FindBy(xpath = "//th[text()='Options']")
	WebElement optionLable;
	
	@FindBy(xpath = "//div[@id='main-nav']//a[5]")
	WebElement deals;
	
	@FindBy(xpath = "//th[contains(text(),'Company')]")
	WebElement companyLable;
	
	@FindBy(xpath = "//body//a[6]")
	WebElement tasks;
	
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement userName;
	
	
	public String getTitle() {
		String actualResult = driver.getTitle();
		return actualResult;
	}
	
	
	public ContactPage clickOnContacts() throws IOException {
		contacts.click();
		return new ContactPage();

	}
	
	public boolean isContactOptionsDisplayed() {
		boolean actualResult = optionLable.isDisplayed();
		return actualResult;
		
	}
	public void clickOnDeals() {
		deals.click();
		
	}
	
	public boolean isCompanyLabelDisplayed() {
		boolean actualResult = companyLable.isDisplayed();
		return actualResult;
	
	}
	
	public boolean isUsernameIsDisplayed() {
		boolean actualResult = userName.isDisplayed();
		return actualResult;
		
		
	}
	
	public void clickOnTasks() {
		tasks.click();
		
	}
	
	
	

}
