package com.dlg.stepdefinitions.acceptancetests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.dlg.common.libraries.DataHandler;
import com.dlg.common.libraries.ReportingUtilities;
import com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub;
import com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.Authentication;
import com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.Locale;
import com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.RetrievePolicyBillingSummary;
import com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.RetrievePolicyBillingSummaryResponse;
import com.dlg.pageobjects.ui.guidewire.common.GWLogin;
import com.dlg.pageobjects.ui.guidewire.policycenter.AccountCreation;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POD1_APITests {
	String endpoint;
	InitializationClass init;
	Scenario scenario;
	File ReportFolder;
	Map<String,String> envVars;
	String screenshotPath;
	DataHandler dh;
	BillingSummaryAPIStub stub;
	RetrievePolicyBillingSummary rpbs;
	Authentication aut;
	RetrievePolicyBillingSummaryResponse rpbsre;
	Locale loc;
	
	public POD1_APITests (InitializationClass init) {
		this.init=init;
	}	

	@Before
	public void SetUp(Scenario sc) {
		this.scenario=sc;
		System.out.println(scenario.getName());
		ReportFolder=init.getReportFolder();
		envVars=init.getEnvironmentVariables();
		screenshotPath=ReportFolder.getAbsolutePath()+"/Screenshots/";
		dh=new DataHandler();
		rpbs=new RetrievePolicyBillingSummary();
		aut=new Authentication();
		loc=new Locale();
	}		
	
	@Given("^Get the required API (\\d+)$")
	public void get_the_required_API(int arg1) throws Throwable {
	    System.out.println("Given");
		try{
			List<String> tags = (List<String>) scenario.getSourceTagNames();				
			List<Map<String , String>> DataRowsList  = dh.getData("GW_BC_BillingSummaryAPI", "Sprint1", tags, arg1);
			for (Map<String, String> map : DataRowsList) {
				endpoint=map.get("EndPoint");
			
			}
	    			
		} catch(Exception e){
			
		}	    
	}

	@When("^request is sent with required policy number and term (\\d+)$")
	public void request_is_sent_with_required_policy_number_and_term(int arg1) throws Throwable {
		System.out.println("When");
		try{
			List<String> tags = (List<String>) scenario.getSourceTagNames();				
			List<Map<String , String>> DataRowsList  = dh.getData("GW_BC_BillingSummaryAPI", "Sprint1", tags, arg1);
			for (Map<String, String> map : DataRowsList) {
				stub=new BillingSummaryAPIStub(endpoint);
				
				rpbs.setPolicyNumber(map.get("PolicyNumber"));
				double trn=Double.parseDouble(map.get("TermNumber"));
				rpbs.setTermNumber((int) trn);
				
				aut.setUsername(envVars.get("PC_UID"));
				aut.setPassword(envVars.get("PC_PWD"));
				
				loc.setString(envVars.get("API_Locale"));
				rpbsre=stub.retrievePolicyBillingSummary(rpbs, aut, loc);					
			}
	    			
		} catch(Exception e){
			
		}		
	}

	@Then("^verify different billing summary response attributes (\\d+)$")
	public void verify_different_billing_summary_response_attributes(int arg1) throws Throwable {
		try{
			List<String> tags = (List<String>) scenario.getSourceTagNames();				
			List<Map<String , String>> DataRowsList  = dh.getData("GW_BC_BillingSummaryAPI", "Sprint1", tags, arg1);
			for (Map<String, String> map : DataRowsList) {
				if (map.get("BillingStatus_BillingMethodCode").equals(rpbsre.get_return().getBillingStatus().getBillingMethodCode()) 
						&& map.get("PaymentPlanName").equals(rpbsre.get_return().getPaymentPlanName())){
					Assert.assertTrue(true);
					System.out.println("Pass");
				}
				else {
					Assert.fail("Not matching");
				}
			
			}
	    			
		} catch(Exception e){
			
		}	 		
	}

}
