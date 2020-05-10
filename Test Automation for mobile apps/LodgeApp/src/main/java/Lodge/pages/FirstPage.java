package Lodge.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lodge.base.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidKeyCode;

public class FirstPage extends TestBase {
	public FirstPage() throws IOException {
		PageFactory.initElements(driver, this);

		// super();
	}

	//@FindBy(id = "com.innovitics.lodge:id/SignUpButtonID")
	//MobileElement signUp;
	/*@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")
	WebElement fullName;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText")
	WebElement emailAddress;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	WebElement password;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Button")
	WebElement signUpp;*/

	public SignUpPage clickOnSignUp() throws IOException {
		driver.findElement(By.id("com.innovitics.lodge:id/SignUpButtonID")).click();
		return new SignUpPage();

	}
	
	public SignInPage clickOnSignIn() throws IOException {
		driver.findElement(By.id("com.innovitics.lodge:id/SignInButtonID")).click();
		return new SignInPage();
		
	}
	
	public HomePage clickOnGuest() throws IOException {
		driver.findElement(By.id("com.innovitics.lodge:id/AsAGuestButtonID")).click();
		return new HomePage();
		
	}
	

}
