package Lodge.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lodge.base.TestBase;
import io.appium.java_client.MobileElement;

public class SignUpPage extends TestBase {

	public SignUpPage() throws IOException {
		PageFactory.initElements(driver, this);
		//super();
	}
	
	/*@FindBy(id = "com.innovitics.lodge:id/NameETID")
	MobileElement fullName;
	@FindBy(id = "com.innovitics.lodge:id/EmailETID")
	MobileElement emailAddress;
	@FindBy(id = "com.innovitics.lodge:id/PasswordETID")
	MobileElement password;
	@FindBy(xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Button")
	MobileElement signUp;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")
	MobileElement imageView;
	@FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]")
	MobileElement errorTextViewElement;*/
	
	public void performSignUp(String fullName, String email, String password) {
	//	fullName.setValue(value);
		driver.findElement(By.id("com.innovitics.lodge:id/NameETID")).sendKeys(fullName);
		driver.findElement(By.id("com.innovitics.lodge:id/EmailETID")).sendKeys(email);
		driver.findElement(By.id("com.innovitics.lodge:id/PasswordETID")).sendKeys(password);
		driver.navigate().back();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Button")).click();
	}

}
