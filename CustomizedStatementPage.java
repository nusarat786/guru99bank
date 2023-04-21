package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomizedStatementPage {

	
WebDriver ldriver;
	
	public CustomizedStatementPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[14]/a")
	WebElement linkCustmizedStatement;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[6]/a")
	WebElement linkEditAccount;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[7]/a")
	WebElement linkDeleteAccount;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[1]/a")
	@CacheLookup
	WebElement managerLink;
	
	@FindBy(name="accountno")
	WebElement AccountNo;
	
	@FindBy(name="amountlowerlimit")
	WebElement MinimumAmount;
	
	
	@FindBy(name="numtransaction")
	WebElement NumberOfTransaction;
	
	
	@FindBy(name="AccSubmit")
	WebElement SubmitBtn;
	
	@FindBy(name="res")
	WebElement ResetBtn;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[12]/a")
	WebElement linkBalanceEnquiry;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[13]/a")
	WebElement linkMiniStatement;
	
	
	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "fdate")
	WebElement fdate;
	
	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "tdate")
	WebElement tdate;
	
	
	
	
	
//	public EditCustomerPage()
//	{
//		PageFactory.initElements(driver, this);
//	}
	
	
	public void clickCustomizedStatement() {
		linkCustmizedStatement.click();	
	}
	
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
	
	public void enterMinimumAmount(String customerid) {
		MinimumAmount.sendKeys(customerid);
	}
	
	public void enterNumberOfTransaction(String customerid) {
		NumberOfTransaction.sendKeys(customerid);
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
	
	public void enterFromDate(String mm,String dd,String yy) {
		fdate.sendKeys(mm);
		fdate.sendKeys(dd);
		fdate.sendKeys(yy);
	}
	
	public void enterToDate(String mm,String dd,String yy) {
		tdate.sendKeys(mm);
		tdate.sendKeys(dd);
		tdate.sendKeys(yy);
	}
	
}
