package org.login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

public class Hotel extends BaseClass {
	
	
	public static void main(String[] args) throws IOException {
		browerlaunch();
		getUrl("http://adactinhotelapp.com/");
		max();
		Pclass a = new Pclass();
		WebElement txtUsername = a.getUsername();
		type(txtUsername, a.getdata(1, 0));
		type(a.getPassword(),getdata( 1, 1));
          click(a.getLogin());
		System.out.println("done..");
		quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement txtuser = driver.findElement(By.xpath("//input[@id='username']"));
//		String s1 = baseClass.getdata(1	, 0);
//		baseClass.type(txtuser, s1);
//		WebElement txtpass = driver.findElement(By.xpath("//input[@id='password']"));
//		String s2 = baseClass.getdata(1	, 1);
//		baseClass.type(txtpass, s2);
//		WebElement btn = driver.findElement(By.xpath("//input[@id='login']"));
//		btn.click();
//		
//		WebElement ddnlocation = driver.findElement(By.xpath("//select[@id='location']"));
//		
//			baseClass.type(ddnlocation, baseClass.getdata(1,2));
//			
//			WebElement ddnHotel = driver.findElement(By.xpath("//select[@id='hotels']"));
//			baseClass.type(ddnHotel, baseClass.getdata(1,3));
//			
//			WebElement ddnttype = driver.findElement(By.xpath("//select[@id='room_type']")); 
//			baseClass.type(ddnttype, baseClass.getdata(1,4));
//			
//			WebElement ddnrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
//			baseClass.type(ddnrooms, baseClass.getdata(1,5));
//			
//			WebElement date1 = driver.findElement(By.xpath("//input[@id='datepick_in']"));
//			baseClass.type(date1, baseClass.getdata(1,6));
//			
//			
//			WebElement date2 = driver.findElement(By.xpath("//input[@id='datepick_out']"));
//			baseClass.type(date2, baseClass.getdata(1,7));
//			
//			WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
//			baseClass.type(adult, baseClass.getdata(1,8));
//			
//			WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
//			baseClass.type(child, baseClass.getdata(1,9));
//			
//			WebElement btn1 = driver.findElement(By.xpath("//input[@id='Submit']"));
//			baseClass.click(btn1);
//			
//			WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
//			baseClass.click(radiobtn);
//			
//			WebElement cntue = driver.findElement(By.id("continue"));
//			baseClass.click(cntue);
//			
//			WebElement frstname = driver.findElement(By.xpath("//input[@id='first_name']"));
//			baseClass.type(frstname, baseClass.getdata(1,10));
//			
//			WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
//			baseClass.type(lastname, baseClass.getdata(1,11));
//			
//			WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
//			baseClass.type(address, baseClass.getdata(1,12));
//			
//			WebElement cardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
//			baseClass.type(cardno, baseClass.getdata(1,13));
//			
//			WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
//			baseClass.type(cardtype, baseClass.getdata(1,14));
//			
//			WebElement expirymnth = driver.findElement(By.id("cc_exp_month"));
//			baseClass.type(expirymnth, baseClass.getdata(1,15));
//			
//			WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
//			baseClass.type(expiryyear, baseClass.getdata(1,16));
//		
//			WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
//			baseClass.type(cvv, baseClass.getdata(1,17));
//			
//			WebElement booknow = driver.findElement(By.id("book_now"));
//			baseClass.click(booknow);
//			Thread.sleep(5000);
//			WebElement order = driver.findElement(By.id("order_no"));
//			String attribute = order.getAttribute("value");
//			System.out.println(attribute);
//			baseClass.Outputstream(1, 18,);
//		
//		
//		
//		
//		
	}
	
	
}