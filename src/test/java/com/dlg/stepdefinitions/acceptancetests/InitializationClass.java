package com.dlg.stepdefinitions.acceptancetests;

import java.io.File;

import java.util.Map;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dlg.common.libraries.EnvironmentVariablesHandler;
import com.dlg.common.libraries.ReportingUtilities;
import cucumber.api.java.After;
import cucumber.runtime.RuntimeOptions;


public class InitializationClass {
    private static boolean executionFlag = false;
    private WebDriver driver;
    public EnvironmentVariablesHandler env;
    public ReportingUtilities Rep;
    public RuntimeOptions rto;
    public String os = System.getProperty("os.name").toLowerCase();

    public InitializationClass() throws Exception {
    	if (!executionFlag) {
    		
        	Rep=new ReportingUtilities(); 
        	env=new EnvironmentVariablesHandler();
        	executionFlag = true;
        }
    	
    	String driverPath="./Resources/BrowserDrivers/";
		if (os.indexOf("win")>=0) {
			driverPath=driverPath+"win/";
		} else if (os.indexOf("mac")>=0) {
			driverPath=driverPath+"mac/";
		} else if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0 ) {
			driverPath=driverPath+"linux/";
		} else if (os.indexOf("sunos") >= 0) {
			driverPath=driverPath+"mac/";
		}    	
		String browserType=env.getEnvironmentVariables().get("BROWSER");
    	if(browserType.equalsIgnoreCase("chrome")){
    		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
    		driver = new ChromeDriver();
    	} else if(browserType.equalsIgnoreCase("firefox")){
    		System.setProperty("webdriver.gecko.driver",  driverPath+"geckodriver");
    		driver = new FirefoxDriver();   		
    	}
    }

    public WebDriver getDriver() {
        return driver;
    }
    
    public Map<String,String> getEnvironmentVariables(){
    	return env.getEnvironmentVariables();
    }
    
    public File getReportFolder(){
    	return Rep.getReportFolder(); 
    }

    @After
    public void cleanUp() {
        driver.quit();

    }
    


}
