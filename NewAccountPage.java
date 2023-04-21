package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {

	
WebDriver ldriver;
	
	public NewAccountPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[5]/a")
	@CacheLookup
	WebElement lnkNewAccount;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[1]/a")
	@CacheLookup
	WebElement managerLink;
	

	@FindBy(name="cusid")
	WebElement CustomerId;
	
	@FindBy(name="button2")
	WebElement SubmitBtn;
	
	@FindBy(name="res")
	WebElement ResetBtn;
	
	@FindBy(name="selaccount")
	WebElement AccountType;

	@FindBy(name="inideposit")
	WebElement InitialDeposite;
	
	
	
	
	
	public void clickNewAccount() {
		lnkNewAccount.click();
			
	}


	public void enterCustId(String id) {
		CustomerId.sendKeys(id);
	}
	
	public void enterIntitialDeposite(String idp) {
		InitialDeposite.sendKeys(idp);
	}
	
	public void custsubmit() {
		SubmitBtn.click();
	}
	
	
	public void clickManager() {
		managerLink.click();	
	}
	
	public void selectAccountType(String acctype) {
		Select select = new Select(AccountType);
		select.selectByVisibleText(acctype);
	}
	
	

}
