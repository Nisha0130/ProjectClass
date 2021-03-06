package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travel3 extends BaseClass {
	public Travel3() {
		PageFactory.initElements(driver, this);

		
	}
	
	public WebElement getName() {
		return name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCardnum() {
		return cardnum;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getNamecard() {
		return namecard;
	}
	public WebElement getPurchase() {
		return purchase;
	}

	@FindBy(xpath="//input[@id='inputName']")
	private WebElement name;
	@FindBy(xpath="//input[@id='address']")
	private WebElement address;
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	@FindBy(xpath="//input[@id='state']")
	private WebElement state;
	@FindBy(xpath="//input[@id='zipCode']")
	private WebElement zipcode;
	@FindBy(xpath="//select[@id='cardType']")
	private WebElement cardtype;
	@FindBy(xpath="//input[@id='creditCardNumber']")
	private WebElement cardnum;
	@FindBy(xpath="//input[@id='creditCardMonth']")
	private WebElement month;
	@FindBy(xpath="//input[@id='creditCardYear']")
   private WebElement year;
	@FindBy(xpath="//input[@id='nameOnCard']")
	private WebElement namecard;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement purchase;
	
	

}
