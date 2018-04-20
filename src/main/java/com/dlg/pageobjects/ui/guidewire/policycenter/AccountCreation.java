package com.dlg.pageobjects.ui.guidewire.policycenter;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.dlg.pageobjects.ui.BasePageClass;

public class AccountCreation extends BasePageClass {
	//actions button
	@FindBy(xpath="//*[@id='Desktop:DesktopMenuActions-btnInnerEl']")
	public WebElement actions_button;
	
	//new account button
	@FindBy(xpath="//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount-textEl']")
	public WebElement new_Account;
	
	//company_name - text box
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl\']")
	public WebElement company_name;
	
	//company_name - check box
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:CompanyNameExact-inputEl\']")
	public WebElement company_name_checkbox;
	
	//First_name
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl\']")
	public WebElement first_name;
	
	//Last_name
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl\']")
	public WebElement last_name;
		
	//first_name - check box
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:FirstNameExact-inputEl\']")
	public WebElement first_name_checkbox;
		
	//last_name - check box
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:LastNameExact-inputEl\']")
	public WebElement last_name_checkbox;
	
	//country drop down
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl\']")
	public WebElement country;
	
	//town/city text box
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl\']")
	public WebElement city;
		
	//post code text box
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl\']")
	public WebElement postcode;
	
	@FindBy(xpath="//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
	public WebElement address_1;
	
	@FindBy(xpath="//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl']")
	public WebElement address_type;
	
	//search button
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\']")
	public WebElement search;
	
	//reset button
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\']")
	public WebElement reset;
	
	//Create new account
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl\']")
	public WebElement Create_new_account;
	
	//company
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Company-itemEl\']")
	public WebElement click_company;
	
	//person
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-itemEl\']")
	public WebElement click_person;
		
	//address book
	@FindBy(xpath="//*[@id=\'NewAccount:NewAccountScreen:NewAccountButton:NewAccount_FromAB-textEl\']")
	public WebElement click_address_book;
	
	//account search results
	@FindBy(xpath="//*[@id='NewAccount:NewAccountScreen:NewAccountSearchResultsLV']")
	public WebElement searchResults;
	
	@FindBy(xpath="//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer-inputEl']")
	public WebElement organization;

	@FindBy(xpath="//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode-inputEl']")
	public WebElement producerCode;
	
	@FindBy(xpath="//*[@id='CreateAccount:CreateAccountScreen:Update']")
	public WebElement update;
	
	@FindBy(xpath="//*[@id='dvcolumn-1428-table']")
	public WebElement accountDetails;
	
	@FindBy(xpath="//div[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl']")
	public WebElement accountID;
	
	@FindBy(xpath="//*[@id='NewAccount:NewAccountScreen:NewAccountSearchResultsLV:0:AccountNumber']")
	public WebElement accountSearchValue;
	
	@FindBy(xpath="//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization']")
	public WebElement seacrhIcon;
	
	@FindBy(linkText="Return to Create account")
	public WebElement returnLink;
	
	
	public AccountCreation(WebDriver driver){
	    //this.driver = driver;
	    super(driver);
	    this.driver=super.driver;
	}
	public void CreateAccount(Map<String, String> map) throws InterruptedException{
		try{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			SearchAccount(map);
			if(JavaScriptDynamicWait(js,"10000"))	Create_new_account.click();	
			Thread.sleep(500);
			click_person.click();
			//Thread.sleep(10000);
			if(map.get("Address_1")!=null && JavaScriptDynamicWait(js,"10000")) address_1.sendKeys(map.get("Address_1"));
			Thread.sleep(500);
			if(map.get("Address_Type")!=null){
				address_type.click();
				address_type.sendKeys(map.get("Address_Type"));
				address_type.sendKeys(Keys.ENTER);
			}
			Thread.sleep(500);
			if(map.get("Organization")!=null){
				organization.sendKeys(map.get("Organization"));
				if(JavaScriptDynamicWait(js,"3000"))
					seacrhIcon.click();
				if(JavaScriptDynamicWait(js,"10000"))
					returnLink.click();
			}
			//Thread.sleep(4000);
			if(map.get("Producer_Code")!=null && JavaScriptDynamicWait(js,"10000")){
				producerCode.click();
				producerCode.sendKeys(map.get("Producer_Code"));
				producerCode.sendKeys(Keys.ENTER);
			}
			update.click();
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void SearchAccount(Map<String, String> map) {
		try{
				JavascriptExecutor js = (JavascriptExecutor) driver;
			  //Thread.sleep(2000);
			  if(JavaScriptDynamicWait(js,"5000")){
				  if(map.get("Company")!=null) company_name.sendKeys(map.get("Company"));
				  Thread.sleep(500);
				  if(map.get("FirstName")!=null) first_name.sendKeys(map.get("FirstName"));
				  Thread.sleep(500);
				  if(map.get("LastName")!=null) last_name.sendKeys(map.get("LastName"));
				  Thread.sleep(500);
				  if(map.get("Country")!=null){
					  country.click();
					  country.sendKeys(map.get("Country"));
					  country.sendKeys(Keys.ENTER);
				  }
				  
				 
				  
				  if(map.get("City")!=null && JavaScriptDynamicWait(js,"5000"))	  city.sendKeys(map.get("City"));
				  
				  if(map.get("Postcode")!=null && JavaScriptDynamicWait(js,"5000")) postcode.sendKeys(map.get("Postcode"));
				  
				  if(JavaScriptDynamicWait(js,"5000")){
					  search.click();
				  }
			  }
			  
			
		} catch(Exception e) {
			
		}
	}
	

}
