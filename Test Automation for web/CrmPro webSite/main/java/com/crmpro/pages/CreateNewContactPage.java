package com.crmpro.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.TestBase;

public class CreateNewContactPage extends TestBase {
	public CreateNewContactPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	WebElement firstName;
	
	@FindBy(name = "last_name")
	WebElement lastName;
	
	@FindBy(name = "company")
	WebElement company;
	
	@FindBy(name = "department")
	WebElement department;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement saveButton;
	
	public void addNewContact(String fName, String lName, String companyName, String departmentName) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(companyName);
		department.sendKeys(departmentName);
		saveButton.click();	
	}

}
