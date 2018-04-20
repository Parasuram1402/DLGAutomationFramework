package com.dlg.pageobjects.ui.guidewire.common;

import org.openqa.selenium.By;
import com.dlg.pageobjects.ui.BaseObjectClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.dlg.pageobjects.ui.BasePageClass;

public class GWLogin extends BasePageClass {
WebDriver driver;


@FindBy(xpath="//input[@id='Login:LoginScreen:LoginDV:username-inputEl']")
public BaseObjectClass userName;

@FindBy(xpath="//input[@id='Login:LoginScreen:LoginDV:password-inputEl']")
public BaseObjectClass password;

@FindBy(linkText ="Log In")
public BaseObjectClass logIn;

@FindBy(xpath="//*[@id=':TabLinkMenuButton-btnIconEl']")
BaseObjectClass menuButton;

@FindBy(xpath="//*[@id='TabBar:LogoutTabBarLink-itemEl']")
BaseObjectClass logOut;

@FindBy(xpath="//*[@id='button-1005-btnInnerEl']")
BaseObjectClass logOutOk;

	public GWLogin(WebDriver driver){
	    //this.driver = driver;
	    super(driver);
	    this.driver=super.driver;
	}

	public void logIn(String uid, String pwd) throws InterruptedException{
		userName.sendKeys(uid);
		password.sendKeys(pwd);
		logIn.click();
		Thread.sleep(5000);
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