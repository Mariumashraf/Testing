package automationDemo.Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import automationDemo.pages.AlertsPage;
import automationDemo.pages.FileUploadPage;
import automationDemo.pages.RegisterPage;

public class testFileUpload extends BaseTests{
	protected FileUploadPage fileUploadPage;
	protected  RegisterPage registerPage;
	
	  @Test
	    public void testFileupload(){
		  registerPage= new RegisterPage(driver);
		  fileUploadPage = registerPage.clickUpload();
		   fileUploadPage= new FileUploadPage(driver);
		   fileUploadPage.uploadFile("F:\\Testing\\README.md");
	       // assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
	    }
	  
	  @Test
	  public void removeFile() {
		  registerPage= new RegisterPage(driver);
		  fileUploadPage = registerPage.clickUpload();
		  fileUploadPage= new FileUploadPage(driver);
		   fileUploadPage.uploadFile("F:\\Testing\\README.md");
		  fileUploadPage.deleteFile();
		   
		  
	  }

}
