package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import zid.base.BaseClass;

public class TestUtils extends BaseClass {
	public TestUtils() throws IOException {
		super();
	}

	public static String takeSnapShot(String name) throws IOException {
		// int counter = 1;
		// String timeStamp = new
		// SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,
				new File("C:\\Users\\lenovo\\eclipse-workspace\\TaskZid\\TestReport\\" + name + ".png"));
		// counter++;
		return name;
	}

	public static Object[][] getDataFromExcel(String filePath, String sheetName) throws IOException {
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		Object data[][] = new Object[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < columns; k++) {

				data[i][k] = sheet.getRow(i).getCell(k);
				data[i][k] = String.valueOf(data[i][k]);

			}
		}
		return data;

	}

}
