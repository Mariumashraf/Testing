package com.crmpro.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() throws IOException {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src=\\'https://d3lh3kd7bj2evy.cloudfront.net/img/logo.png']")
	WebElement logo;
	
	@FindBy(linkText = "Sign Up")
	WebElement signUp;
	
	@FindBy(linkText = "Got an account? Log in here")
	WebElement login;
	
	@FindBy(name = "email")
	WebElement userNameField;
	
	@FindBy(name = "password")
	WebElement passwordField;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginButton;
	
	public String getTitle() {
		String actualResult = driver.getTitle();
		return actualResult;
	}
	public String getURL() {
		String actualURL =  driver.getCurrentUrl();
		return actualURL;

	}
	
	public boolean logoIsDisplayed() {
		boolean logoIsDisplayed = logo.isDisplayed();
		return logoIsDisplayed;
	}
	
	public HomePage performLogin() throws IOException {
		signUp.click();
		login.click();


		userNameField.sendKeys(prop.getProperty("userName"));
		passwordField.sendKeys(prop.getProperty("password"));
		loginButton.click();
		
		return new HomePage();

	}
	
	
	

}
