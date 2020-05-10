package Lodge.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Lodge.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		//super();
		PageFactory.initElements(driver, this);

	}
	
	public ExplorePage clickOnExplore() throws IOException {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")).click();
		return new ExplorePage();
	}
	

}
