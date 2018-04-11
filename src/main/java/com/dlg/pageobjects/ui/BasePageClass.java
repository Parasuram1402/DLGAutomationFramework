package com.dlg.pageobjects.ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class BasePageClass {
public WebDriver driver;

	public BasePageClass(WebDriver driver){
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	public void sendKeys(WebElement we, String data){
		we.sendKeys(data);
	}

}