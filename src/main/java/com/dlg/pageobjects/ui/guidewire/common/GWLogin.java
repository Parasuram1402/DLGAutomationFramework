package com.dlg.pageobjects.ui.guidewire.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.dlg.pageobjects.ui.BasePageClass;

public class GWLogin extends BasePageClass {
WebDriver driver;


@FindBy(xpath="//input[@id='Login:LoginScreen:LoginDV:username-inputEl']")
public WebElement userName;

@FindBy(xpath="//input[@id='Login:LoginScreen:LoginDV:password-inputEl']")
public WebElement password;

@FindBy(linkText ="Log In")
public WebElement logIn;

@FindBy(xpath="//*[@id=':TabLinkMenuButton-btnIconEl']")
WebElement menuButton;

@FindBy(xpath="//*[@id='TabBar:LogoutTabBarLink-itemEl']")
WebElement logOut;

@FindBy(xpath="//*[@id='button-1005-btnInnerEl']")
WebElement logOutOk;

	public GWLogin(WebDriver driver){
	    //this.driver = driver;
	    super(driver);
	    this.driver=super.driver;
	}

	public void logIn(String uid, String pwd){
		userName.sendKeys(uid);
		password.sendKeys(pwd);
		logIn.click();
	}
	
	public void logOut() throws InterruptedException{
		menuButton.click();
		Thread.sleep(2000);
		logOut.click();
		Thread.sleep(5000);
		
		try{
    		if(logOutOk.isDisplayed())
    			logOutOk.click();    			
		} catch(Exception e){
			
		}
	
	}

}