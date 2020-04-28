package automationDemo.Tests;

import org.testng.annotations.Test;

import automationDemo.pages.DownloadFilePage;
import automationDemo.pages.RegisterPage;

public class testDownloadFile extends BaseTests{
	protected DownloadFilePage downloadFilePage;
	protected  RegisterPage registerPage;
	
	@Test
	public void testDownloadText() {
		registerPage = new RegisterPage(driver);
		downloadFilePage = registerPage.clickDownload();
		downloadFilePage = new DownloadFilePage(driver);
		downloadFilePage.downloadTextFile("mariummmmmmmashrafhassanalyyyymuhammed");
	}
	
	@Test
	public void testDownloadPdf() {
		registerPage = new RegisterPage(driver);
		downloadFilePage = registerPage.clickDownload();
		downloadFilePage = new DownloadFilePage(driver);
		downloadFilePage.downloadPdfFile("selenium webdriver api mobile testing webtesting appium");
	}

}
