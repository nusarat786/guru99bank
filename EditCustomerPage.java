package com.inetbanking.pageObjects;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.testCases.BaseClass;


public class EditCustomerPage{
	
	WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//p[contains(text(),'Edit Customer Form')]")
	WebElement EditcustomerFormText;
	
	@FindBy(name="cusid")
	WebElement CustomerId;
	
	@FindBy(name="AccSubmit")
	WebElement SubmitBtn;
	
	@FindBy(name="res")
	WebElement ResetBtn;
	
	@FindBy(xpath="//p[contains(text(),'Edit Customer')]")
	WebElement EditcustomerText;
	
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[3]/a")
	@CacheLookup
	WebElement lnkEditCustomer;
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[1]/a")
	@CacheLookup
	WebElement managerLink;
	
	
	
	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rdGender;

	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement txtdob;

	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtaddress;

	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement txtcity;

	@CacheLookup
	@FindBy(how = How.NAME, using = "state")
	WebElement txtstate;

	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtpinno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txttelephoneno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtemailid;

	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtpassword;

	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
//	public EditCustomerPage()
//	{
//		PageFactory.initElements(driver, this);
//	}
	
	
	
	public void clickEditCustomer() {
		lnkEditCustomer.click();	
	}
	
	public void clickManager() {
		managerLink.click();	
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
	
	
	public boolean editCustomerFormText()
	{
		boolean result= EditcustomerFormText.isDisplayed();
		return result;
	}
	
	public boolean enterCustomeridAndSubmit(String Id)
	{
		boolean result = false;
		try {
		CustomerId.sendKeys(Id);
		SubmitBtn.click();
		}catch(UnhandledAlertException f)
		{
			try {
				
				System.out.println("No Customer Found");
				
			//elements.alert(true, "UnhandledAlertException", driver);
			}catch(NoAlertPresentException e)
			{
				e.printStackTrace();
			}
		}
		result= EditcustomerText.isDisplayed();
		return result;
	}
	
	
	public void custaddress(String caddress) {
		txtaddress.clear();
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.clear();
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.clear();
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.clear();
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.clear();
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.clear();
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.clear();
		txtpassword.sendKeys(cpassword);
	}

	public void editsubmit() {
		btnSubmit.click();
	}
		
}
