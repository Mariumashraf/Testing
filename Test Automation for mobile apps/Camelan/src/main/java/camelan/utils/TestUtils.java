package camelan.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import camelan.base.TestBase;

public class TestUtils extends TestBase {
	public TestUtils() throws IOException {
		super();
	}

	public static String takeSnapShot(WebDriver driver, String name) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,
				new File("C:\\Users\\lenovo\\eclipse-workspace\\Camelan\\TestReport\\" + name + ".png"));
		return name;
	}

}
