package camelan.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import camelan.base.TestBase;
import io.appium.java_client.android.AndroidDriver;

public class SearchPage extends TestBase {
	public SearchPage(AndroidDriver<WebElement> driver) throws IOException {
		this.driver = driver;
	}

	public void searchAd() {
		driver.findElement(By.id("android:id/search_src_text")).sendKeys("cat");

	}

}
