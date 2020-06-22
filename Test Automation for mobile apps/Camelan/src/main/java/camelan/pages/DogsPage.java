package camelan.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sun.tools.xjc.Driver;

import camelan.base.TestBase;
import io.appium.java_client.android.AndroidDriver;

public class DogsPage extends TestBase {
	public DogsPage(AndroidDriver<WebElement> driver) throws IOException {
		TestBase.driver = driver;
	}

	public void clickOnFirstAd() {
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout[1]/android.widget.ImageView[1]"))
				.click();
	}

}
