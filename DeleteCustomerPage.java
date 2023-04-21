package com.inetbanking.pageObjects;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
	WebDriver ldriver;
	
	public DeleteCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[4]/a")
	WebElement deleteCustomer;
	
	@FindBy(name="cusid")
	WebElement CustomerId;
	
	@FindBy(name="AccSubmit")
	WebElement SubmitBtn;
	
	
	@FindBy(name="res")
	WebElement ResetBtn;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[1]/a")
	@CacheLookup
	WebElement managerLink;
	
	public void clickManager() {
		managerLink.click();	
	}

	public void clickDeleteCustomer() {
		deleteCustomer.click();	
	}
	
	public void enterCustId(String customerid) {
		CustomerId.sendKeys(customerid);
	}
	
	public void submitCustId() {
		SubmitBtn.click();
	}
	
	public void resetCustId() {
		ResetBtn.click();
	}
	
	
}
