package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travel2 extends BaseClass {
	
	public Travel2() {
		PageFactory.initElements(driver, this);

	
	}
	@FindBy(xpath="(//input[@class='btn btn-small'])[3]")
	private WebElement choose;
	
	public WebElement getChoose() {
		return choose;
	}
	
	
	
	
	
	

}
