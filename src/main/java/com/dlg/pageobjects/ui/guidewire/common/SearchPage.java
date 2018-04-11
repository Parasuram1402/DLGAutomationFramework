package com.dlg.pageobjects.ui.guidewire.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;

	@FindBy(xpath="")
	WebElement searchField;

	@FindBy(xpath="")
	WebElement searchResults;

	@FindBy(xpath="")
	WebElement searchButton;

	public SearchPage(WebDriver driver){
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}	
	
	public void searchData(String srchData){
		//write code to searchData
	}
	
	public void sortData(String criteria){
		//write criteria to sort the data
	}

}
