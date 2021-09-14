package org.login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testing extends BaseClass {
	public static void main(String[] args) throws IOException {
		browerlaunch();
		getUrl("https://blazedemo.com/");
		max();
		Travel a = new Travel();
		WebElement depcity = a.getDepcity();
		String s1 = getdata(1, 0);
		type(depcity, s1);
		
		WebElement descity = a.getDescity();
		String s2 = getdata(1, 1);
		type(descity, s2);
		
		WebElement flights = a.getFlights();
		click(flights);
		
		Travel2 b = new Travel2();
		WebElement choose = b.getChoose();
		click(choose);
		
		Travel3 c = new Travel3();
		type(c.getName(), getdata(1, 2));
		type(c.getAddress(), getdata(1, 3));
		type(c.getCity(), getdata(1, 4));
		type(c.getState(), getdata(1, 5));
		type(c.getZipcode(), getdata(1, 6));
		type(c.getCardtype(), getdata(1, 7));
		type(c.getCardnum(), getdata(1, 8));
		type(c.getMonth(), getdata(1, 9));
		type(c.getYear(), getdata(1, 10));
		type(c.getNamecard(), getdata(1, 11));

		WebElement purchase = c.getPurchase();
		click(purchase);
		
		WebElement result = driver.findElement(By.xpath("//table//tr[1]//td[2]"));
		String attribute = result.getText();
		System.out.println(attribute);
		BaseClass.output(1, 12, attribute);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
