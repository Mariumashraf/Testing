package camelan.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import camelan.base.TestBase;
import io.appium.java_client.android.AndroidDriver;

public class ListAdsPage extends TestBase {

	public ListAdsPage(AndroidDriver<WebElement> driver) throws IOException {
		TestBase.driver = driver;
	}

	public SearchPage clickOnSearch() throws IOException {
		driver.findElement(By.id("com.camelan:id/mainSearchTextView")).click();
		return new SearchPage(driver);
	}

	public DogsPage clickOnDogsCategory() throws IOException {
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView"))
				.click();
		return new DogsPage(driver);

	}

}
