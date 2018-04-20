package com.dlg.common.libraries;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dlg.pageobjects.ui.guidewire.common.GWLogin;
import com.dlg.pageobjects.ui.guidewire.policycenter.AccountCreation;

public class MySample {

    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver = null;
    	try{
        	System.setProperty("webdriver.chrome.driver", "./Resources/BrowserDrivers/win/chromedriver");
        	//System.setProperty("webdriver.gecko.driver",  "./Resources/BrowserDrivers/win/geckodriver");
    		
    	//	driver = new FirefoxDriver();         	
        	driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		
    		driver.get("http://in-hyd-insudem2:5050/pc");
    		GWLogin gw= new GWLogin(driver);
    		AccountCreation ac=new AccountCreation(driver);
    		Thread.sleep(5000);
    		gw.userName.sendKeys("su");
    		gw.password.sendKeys("gw");
    		gw.logIn.click();
    		Thread.sleep(5000);
    		gw.logOut();
    		driver.quit();
   

    	} catch(Exception e){
    		System.out.println("Error");
    		e.printStackTrace();
    	}
  
    }
}
