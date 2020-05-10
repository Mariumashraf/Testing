package Lodge.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import Lodge.base.TestBase;
import io.appium.java_client.MobileElement;

public class ExplorePage extends TestBase {

	public ExplorePage() throws IOException {
		PageFactory.initElements(driver, this);
		// super();
	}

	public void searchProperty() {
		// driver.findElement(By.id("com.innovitics.lodge:id/RadioButtonSaleID")).click();
		driver.findElement(By.id("com.innovitics.lodge:id/RadioButtonRentID")).click();

		driver.findElement(By.id("com.innovitics.lodge:id/SelectUnitSpinnerLayout")).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.CheckBox"))
				.click();
	driver.findElement(By.id("com.innovitics.lodge:id/SelectUnitDoneTVID")).click();

		driver.findElement(By.id("com.innovitics.lodge:id/SelectGovernorateSpinnerLayout")).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.CheckBox"))
				.click();
		driver.findElement(By.id("com.innovitics.lodge:id/SelectGovernorateDoneTVID")).click();

		driver.findElement(By.id("com.innovitics.lodge:id/SelectAreaSpinnerLayout")).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.CheckBox"))
				.click();
		driver.findElement(By.id("com.innovitics.lodge:id/SelectAreaDoneTVID")).click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"VIEW LODGES"+"\").instance(0))").click();


		// driver.findElement(By.id("com.innovitics.lodge:id/SelectCompoundSpinnerLayout")).click();



	/*MobileElement searchElement =	(MobileElement) driver.findElement(By.id("com.innovitics.lodge:id/ViewLodgeButtonID"));
	TouchActions action = new TouchActions(driver);
	action.scroll(searchElement, 10, 100);
	action.perform();*/


   // action.moveToElement(searchElement).build().perform();
  //  searchElement.click();

		//driver.scrollTo

	}

}
