package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travel extends BaseClass {
	public Travel () {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="fromPort")
   private WebElement depcity;
	@FindBy(name="toPort")
	private WebElement descity;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement flights;
	
	public WebElement getDepcity() {
		return depcity;
	}
	public WebElement getDescity() {
		return descity;
	}
	public WebElement getFlights() {
		return flights;
	}
	
	
	
	
	
	
	
	
}
