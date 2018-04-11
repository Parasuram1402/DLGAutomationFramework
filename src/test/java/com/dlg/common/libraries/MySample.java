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
        	//System.setProperty("webdriver.chrome.driver", "./Resources/BrowserDrivers/win/chromedriver");
        	System.setProperty("webdriver.gecko.driver",  "./Resources/BrowserDrivers/win/geckodriver");
    		
    		driver = new FirefoxDriver();         	
 /*       	driver = new ChromeDriver();*/
    		driver.manage().window().maximize();
    		
    		driver.get("http://in-hyd-insudem2:5050/pc");
    		GWLogin gw= new GWLogin(driver);
    		AccountCreation ac=new AccountCreation(driver);
    		Thread.sleep(5000);
    		gw.userName.sendKeys("su");
    		gw.password.sendKeys("gw");
    		gw.logIn.click();
    		Thread.sleep(5000);
    		
    		driver.findElement(By.xpath("//*[@id='Desktop:DesktopMenuActions-btnInnerEl']")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount-textEl']")).click();
    		Thread.sleep(2000);
    		//ac.company_name.sendKeys("Capgemini");
    		ac.first_name.sendKeys("Automation");
    		ac.last_name.sendKeys("Demo");
    		ac.search.click();
    		Thread.sleep(5000);
    		
    		Assert.assertTrue(ac.searchResults.isDisplayed());
    		driver.findElement(By.xpath("//*[@id='NewAccount:NewAccountScreen:NewAccountSearchResultsLV:0:AccountNumber']")).click();
    		
    		Thread.sleep(5000);
    		System.out.println(driver.findElement(By.xpath("//label[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-labelEl']")).getText());
    		System.out.println(driver.findElement(By.xpath("//div[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl']")).getText());
 

    	} catch(Exception e){
    		System.out.println("Error");
    	}
    	finally{
    		driver.findElement(By.xpath("//*[@id=':TabLinkMenuButton-btnIconEl']")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//*[@id='TabBar:LogoutTabBarLink-itemEl']")).click();
    		Thread.sleep(2000);
    		try{
        		if(driver.findElement(By.xpath("//*[@id='button-1005-btnInnerEl']")).isDisplayed())
        			driver.findElement(By.xpath("//*[@id='button-1005-btnInnerEl']")).click();    			
    		} catch(Exception e){
    			
    		}
    		driver.close();
    		driver.quit();
    	}
    }
}
