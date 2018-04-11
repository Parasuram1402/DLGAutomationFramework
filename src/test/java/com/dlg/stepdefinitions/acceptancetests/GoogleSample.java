package com.dlg.stepdefinitions.acceptancetests;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.dlg.common.libraries.DataHandler;
import com.dlg.common.libraries.ReportingUtilities;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class GoogleSample {
	WebDriver driver;
	InitializationClass init;
	Scenario scenario;
	File ReportFolder;
	Map<String,String> envVars;
	public GoogleSample(InitializationClass init) {
		this.init=init;
	}
	
	@Before
	public void SetUp(Scenario sc){
		this.scenario=sc;
		driver=init.getDriver();
		ReportFolder=init.getReportFolder();
		envVars=init.getEnvironmentVariables();
		
	}
	
	@Given("^Google is Open (\\d+)$")
	public void google_is_Open(int arg1) throws Throwable {
		System.out.println(arg1);
		driver.manage().window().maximize();
		
		driver.get(envVars.get("CC_URL"));
		if(envVars.get("SCREENSHOT_LEVEL").equalsIgnoreCase("ALL") || envVars.get("SCREENSHOT_LEVEL").equalsIgnoreCase("pass")){
			ReportingUtilities.takeScreenShot(ReportFolder.getAbsolutePath()+"/Screenshots/", driver, scenario,"google_is_Open");		
		}
		Thread.sleep(3000);			
	}

	@When("^Search for \"([^\"]*)\" (\\d+)$")
	public void search_for(String arg1, int arg2) throws Throwable {
		System.out.println(arg2);
		DataHandler dh=new DataHandler();
		List<String> tags = (List<String>) scenario.getSourceTagNames();				
		List<Map<String , String>> DataRowsList  = dh.getData("GW_PC_GoogleSearch", "Sprint1", tags, arg2);
		for (Map<String, String> map : DataRowsList) {
			driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(map.get("searchBox"));
			System.out.println(map.get("searchBox"));
			driver.findElement(By.xpath("//input[@name='btnK']")).click();
			Thread.sleep(2000);		
		}
		
	}

	@Then("^Validate Search Results (\\d+)$")
	public void validate_Search_Results(int arg1) throws Throwable {
		System.out.println(arg1);
		System.out.println("Then");
		//driver.navigate().back();
		driver.close();
		
		
	}

}
