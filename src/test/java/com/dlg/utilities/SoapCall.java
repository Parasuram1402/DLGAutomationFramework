package com.dlg.utilities;
import com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.*;
import com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.*;

public class SoapCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				BillingSummaryAPIStub stub=new BillingSummaryAPIStub("http://10.109.11.67:8580/bc/ws/gw/webservice/policycenter/bc900/BillingSummaryAPI");
				RetrievePolicyBillingSummary rpbs=new RetrievePolicyBillingSummary();
				rpbs.setPolicyNumber("2459765753");
				rpbs.setTermNumber(1);
				Authentication aut=new Authentication();
				aut.setUsername("su");
				aut.setPassword("gw");
				Locale loc=new Locale();
				loc.setString("en_US");
				RetrievePolicyBillingSummaryResponse rpbsre=stub.retrievePolicyBillingSummary(rpbs, aut, loc);
				System.out.println(rpbsre.get_return().getPaymentPlanName());
				
		       } catch (Exception e) {
		       e.printStackTrace();
		      }
		    }
}


