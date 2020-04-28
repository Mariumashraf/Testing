package com.crmpro.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.TestBase;


public class ContactPage extends TestBase {
	
	public ContactPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='item']//a")
	WebElement newContact;
	
	public CreateNewContactPage clickOnCreateNC() throws IOException {
		newContact.click();
		return new CreateNewContactPage();
	}
	


}
