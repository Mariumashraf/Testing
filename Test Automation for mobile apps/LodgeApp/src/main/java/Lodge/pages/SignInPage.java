package Lodge.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Lodge.base.TestBase;

public class SignInPage extends TestBase {
	public SignInPage() throws IOException {
			PageFactory.initElements(driver, this);
			//super();
		}
	
	public void performSignIn() {
		driver.findElement(By.id("com.innovitics.lodge:id/EmailETID")).sendKeys("mariamaaf910@gmail.com");
		driver.findElement(By.id("com.innovitics.lodge:id/PasswordETID")).sendKeys("merotester");
		driver.navigate().back();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Button")).click();
	
	}
	

}

