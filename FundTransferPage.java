package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FundTransferPage {

	
WebDriver ldriver;
	
	public FundTransferPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[9]/a")
	@CacheLookup
	WebElement lnkWidrawal;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[1]/a")
	@CacheLookup
	WebElement managerLink;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[8]/a")
	@CacheLookup
	WebElement lnkDeposite;
	
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[10]/a")
	@CacheLookup
	WebElement lnkFundTransfer;
	
	
	@FindBy(name="accountno")
	WebElement AccountNo;

	@FindBy(name="cusid")
	WebElement CustomerId;
	
	@FindBy(name="AccSubmit")
	WebElement SubmitBtn;
	
	@FindBy(name="res")
	WebElement ResetBtn;
	
	@FindBy(name="selaccount")
	public WebElement AccountType;

	@FindBy(name="ammount")
	public WebElement amount;
	
	@FindBy(name="desc")
	public WebElement description;
	
	
	@FindBy(name="payersaccount")
	public WebElement PayerAccount;
	
	@FindBy(name="payeeaccount")
	public WebElement PayeeAccount;
	
	
	
	
	
	public void clickWidrawal() {
		lnkWidrawal.click();	
	}

	public void enterAmmount(String idp) {
		amount.sendKeys(idp);
	}
	
	public void enterAccNo(String customerid) {
		AccountNo.sendKeys(customerid);
	}
	
	public void enterDescription(String customerid) {
		description.sendKeys(customerid);
	}
	
	
	public void enterPayerAccountNo(String customerid) {
		PayerAccount.sendKeys(customerid);
	}
	
	public void enterPayeeAccountNo(String customerid) {
		PayeeAccount.sendKeys(customerid);
	}
	
	public void accsubmit() {
		SubmitBtn.click();
	}
	
	
	public void clickManager() {
		managerLink.click();	
	}
	
	public void selectAccountType(String acctype) {
		Select select = new Select(AccountType);
		select.selectByVisibleText(acctype);
	}
	
	public void clear() {
		
		PayerAccount.clear();
		description.clear();
		amount.clear();
		PayeeAccount.clear();
		
	}
	
	public void clickDeposite() {
		lnkDeposite.click();	
	}
	
	public void clickFundTransfer() {
		lnkFundTransfer.click();	
	}
	
	
	
	
	
}
