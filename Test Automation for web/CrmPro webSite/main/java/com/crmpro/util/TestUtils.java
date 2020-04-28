package com.crmpro.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.crmpro.base.TestBase;

public class TestUtils extends TestBase {

	public TestUtils() throws IOException {
		super();
	}
	
	
	
	public static String takeSnapShot( WebDriver driver, String name) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\lenovo\\eclipse-workspace\\CRMMaven\\TestReport\\"+name+".png"));
		return name;
		
	}
	
	public static Object[][] getDataFromExcel(String sheetName) throws IOException {
			File file = new File ("D:\\Testing\\seleniumarabic\\crmproTC.xlsx");
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			//Sheet sheet = workbook.getSheetAt(0);
			Sheet sheet = workbook.getSheet(sheetName);
			//String familyName = sheet.getRow(2).getCell(1).toString();
			//System.out.println(familyName);
			//workbook.close();
			int rows = sheet.getLastRowNum();
			int columns = sheet.getRow(0).getLastCellNum();
			Object data [][] = new Object[rows][columns];
			
			for(int i=0 ; i<rows ; i++) {
				for(int k=0 ; k<columns ; k++) {
					data [i][k] = sheet.getRow(i).getCell(k).toString();
					
				}
			}
			return data;
			
		}



	
	}
	
