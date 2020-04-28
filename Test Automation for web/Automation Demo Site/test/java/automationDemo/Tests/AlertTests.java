package automationDemo.Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationDemo.pages.AlertsPage;
import automationDemo.pages.HomePage;
import automationDemo.pages.RegisterPage;

public class AlertTests extends BaseTests {
	protected AlertsPage alertsPage;
	protected RegisterPage registerPage;
	

	  @Test
	    public void testAcceptAlert(){
		   registerPage= new RegisterPage(driver);
		   alertsPage = registerPage.clickAlerts();
		   alertsPage= new AlertsPage(driver);
	       alertsPage.triggerAlert();
	       alertsPage.alert_clickToAccept();
	    }

	   @Test
	    public void testGetTextFromAlert(){
	    	registerPage= new RegisterPage(driver);
	        alertsPage = registerPage.clickAlerts();
	    	alertsPage= new AlertsPage(driver);
	        alertsPage.triggerConfirm();
	        String text = alertsPage.alert_getText();
	        alertsPage.alert_clickToDismiss();
	        assertEquals(text, "Press a Button !", "Alert text incorrect");
	    }

	    @Test
	    public void testSetInputInAlert(){
	    	registerPage= new RegisterPage(driver);
	        alertsPage = registerPage.clickAlerts();
	    	alertsPage= new AlertsPage(driver);
	        alertsPage.triggerPrompt();

	        String text = "Marium:Software QC Engineer";
	        alertsPage.alert_setInput(text);
	        alertsPage.alert_clickToAccept();
	        assertEquals(alertsPage.getResult(), "Hello " + text + "How are you today", "Results text incorrect");
	    }

	

}
