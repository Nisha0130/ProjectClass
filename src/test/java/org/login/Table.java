package org.login;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table extends BaseClass {
	public static void main(String[] args) {
		browerlaunch();
		getUrl("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		max();
		WebElement path = driver.findElement(By.xpath("(//div[@class='row'])[3]"));
		String text = path.getText();
		System.out.println(path);
//		WebElement table = driver.findElement(By.tagName("table"));
//		WebElement thead = table.findElement(By.tagName("thead"));
//		WebElement tr = thead.findElement(By.tagName("tr"));
//		List<WebElement> findElements = tr.findElements(By.tagName("th"));
//		for (int i = 0; i < findElements.size(); i++) {
//			WebElement head = findElements.get(i);
//			String data = head.getText();
//			System.out.print(data + "\t");
//			
//		}
//		
//		WebElement tbody = table.findElement(By.tagName("tbody"));
//		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
//		for (int j = 0; j <rows.size(); j++) {
//			WebElement row = rows.get(j);
//		
//			String d = row.getText();
//			System.out.print("\t"+"\n"+d);
//		}
//		
		driver.quit();
	}

	

	

}
