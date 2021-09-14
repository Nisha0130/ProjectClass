package org.login;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Junit extends BaseClass {
	@BeforeClass
	public static void Class() {
		BaseClass a = new BaseClass();
		browerlaunch();
		getUrl("https://en-gb.facebook.com/");
	}

	@BeforeMethod
	private void sample4() {
		WebElement txtusername = driver.findElement(By.id("email"));
		type(txtusername, "Welcome");
	}
	
	@Test()
	public void Sample() {
	WebElement password = driver.findElement(By.id("pass"));
	type(password, "new@123");
	}

  @AfterMethod
private void aftermethod() {
	  WebElement lgn = driver.findElement(By.id("login"));
	  click(lgn);

}
	
	

	
	
	
}
