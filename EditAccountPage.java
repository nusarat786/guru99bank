package com.inetbanking.pageObjects;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {

WebDriver ldriver;
	
	public EditAccountPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="/html/body/div[3]/div/ul/li[6]/a")
	WebElement linkEditAccount;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[7]/a")
	WebElement linkDeleteAccount;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[1]/a")
	@CacheLookup
	WebElement managerLink;
	
	@FindBy(name="accountno")
	public WebElement AccountNo;
	
	@FindBy(name="AccSubmit")
	WebElement SubmitBtn;
	
	@FindBy(name="res")
	WebElement ResetBtn;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[12]/a")
	WebElement linkBalanceEnquiry;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[13]/a")
	WebElement linkMiniStatement;
	
	
	
	
	
	
//	public EditCustomerPage()
//	{
//		PageFactory.initElements(driver, this);
//	}
	
	public void clickEditAccount() {
		linkEditAccount.click();	
	}
	
	public void clickDeleteAccount() {
		linkDeleteAccount.click();	
	}
	
	public void clickBalanceEnquiry() {
		linkBalanceEnquiry.click();	
	}
	
	public void clickMiniStatement() {
		linkMiniStatement.click();	
	}
	
	public void clickManager() {
		managerLink.click();	
	}
	
	public void enterAccNo(String customerid) {
		AccountNo.sendKeys(customerid);
	}
	
	public void submitAccNo() {
		SubmitBtn.click();
	}
	
	public void resetCustId() {
		ResetBtn.click();
	}
	
	public WebElement getLink() {
		return SubmitBtn;
	}
	
		
}
