package com.dlg.pageobjects.ui;
import org.openqa.selenium.JavascriptExecutor;
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

	public static boolean JavaScriptDynamicWait(JavascriptExecutor js, String waitTime) throws Exception
    {
        boolean status = false;
         for (int i = 1; i <= Integer.parseInt(waitTime); i++) {
             System.out.println("Document Ajax State = "
                           + js.executeScript(
                                        "return Ext.Ajax.isLoading();")
                                        .toString());
             Boolean isAjaxRunning = Boolean.valueOf(js
                           .executeScript(
                                        "return Ext.Ajax.isLoading();") //returns true if ajax call is currently in progress
                           .toString());
             if (!isAjaxRunning.booleanValue()) {
             status = true;
                    break;
             }
             Thread.sleep(1000);//wait for one secnod then check if ajax is completed
         }
         return status;
    }

}