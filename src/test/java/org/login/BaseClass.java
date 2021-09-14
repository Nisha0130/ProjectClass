package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class BaseClass {
	static WebDriver driver;

	public static void browerlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void max() {
		driver.manage().window().maximize();

	}

	public static String getdata( int row, int cell) throws IOException {
		String data = null;
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\FrameWork\\Datas\\Flight.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet1");
		Row r = sheet.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();

		if (type == 1) {
			data = c.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				data = dateFormat.format(date);
			} else {
				double d = c.getNumericCellValue();
				Long l = (long) d;
				data = String.valueOf(l);
			}
		}
		return data;

	}
	
	
	public static String output(int row, int cell, String data) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\FrameWork\\Datas\\Flight.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet1");
		Row r = sheet.getRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(data);
		FileOutputStream x = new FileOutputStream(file);
		workbook.write(x);
		return data;
	}
	
	
	public static WebElement Locators(String locators, String value) {
		if (locators.equals("id")) {
			WebElement element = driver.findElement(By.id(value));
			return element;
		}else if (locators.equals("name")) {
			WebElement element = driver.findElement(By.name(value));
			return element;
			
		}else {
			WebElement element = driver.findElement(By.xpath(value));
			return element;
		}
		}

	
public static void type(WebElement element, String text) {
		element.sendKeys(text);

	}
public static void click(WebElement element){
	element.click();
		
}

public void getAttribute() {

}



public static void quit() {
driver.quit();
}
}