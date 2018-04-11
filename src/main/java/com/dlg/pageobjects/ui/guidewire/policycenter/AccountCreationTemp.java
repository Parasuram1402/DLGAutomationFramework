package com.dlg.pageobjects.ui.guidewire.policycenter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.dlg.pageobjects.ui.BasePageClass;

public class AccountCreationTemp extends BasePageClass {
WebDriver driver;

@FindBy(xpath="//a[@id='TabBar:AccountTab']/span")
WebElement accountDropDown;

@FindBy(xpath="//span[@id='TabBar:AccountTab-btnInnerEl']")
WebElement account;

@FindBy(xpath="//a[@id='TabBar:AccountTab:AccountTab_NewAccount-itemEl']/span")
WebElement newAccount;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl']")
WebElement companyName;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:CompanyNameExact-inputEl']")
WebElement companyNameExactMatch;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl']")
WebElement firstName;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl']")
WebElement lastName;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:FirstNameExact-inputEl']")
WebElement firstNameExactMatch;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:LastNameExact-inputEl']")
WebElement lastNameExactMatch;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
WebElement country;

@FindBy(xpath ="//div[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-trigger-picker']")
WebElement countryDropDown;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl']")
WebElement city;

@FindBy(xpath ="//a[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City:AutoFillIcon']")
WebElement cityAutoFill;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:County-inputEl']")
WebElement county;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
WebElement state;

@FindBy(xpath ="//div[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-trigger-picker']")
WebElement stateDropDown;

@FindBy(xpath ="//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']")
WebElement zipCode;

@FindBy(xpath ="//a[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode:AutoFillIcon']")
WebElement zipCodeAutoFill;

@FindBy(xpath ="//a[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
WebElement search;

@FindBy(xpath ="//a[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset']")
WebElement reset;





	public AccountCreationTemp(WebDriver driver){
	    //this.driver = driver;
	    super(driver);
	    this.driver=super.driver;
	}

	public void seacrh(String companyName, boolean compexactMatch, String fName, String lName, boolean fNameExact, boolean lNameExact){

	}

	public void reset(){

	}	
}