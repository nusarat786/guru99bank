package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountWithdrawalPage {

WebDriver ldriver;
	
	public AccountWithdrawalPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[9]/a")
	@CacheLookup
	public WebElement lnkWidrawal;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[1]/a")
	@CacheLookup
	public WebElement managerLink;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[8]/a")
	@CacheLookup
	public WebElement lnkDeposite;
	
	
	@FindBy(name="accountno")
	public WebElement AccountNo;

	@FindBy(name="cusid")
	public WebElement CustomerId;
	
	@FindBy(name="AccSubmit")
	public WebElement SubmitBtn;
	
	@FindBy(name="res")
	public WebElement ResetBtn;
	
	@FindBy(name="selaccount")
	public WebElement AccountType;

	@FindBy(name="ammount")
	public WebElement amount;
	
	@FindBy(name="desc")
	public WebElement description;
	
	
	
	
	
	
	
	
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
		
		amount.clear();
		description.clear();
		AccountNo.clear();
		
	}
	
	public void clickDeposite() {
		lnkDeposite.click();	
	}
	
	
}
