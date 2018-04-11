/**
 * RequiredFieldExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI;

public class RequiredFieldExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1522924667892L;
    private com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.RequiredFieldException faultMessage;

    public RequiredFieldExceptionException() {
        super("RequiredFieldExceptionException");
    }

    public RequiredFieldExceptionException(java.lang.String s) {
        super(s);
    }

    public RequiredFieldExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public RequiredFieldExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.RequiredFieldException msg) {
        faultMessage = msg;
    }

    public com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.RequiredFieldException getFaultMessage() {
        return faultMessage;
    }
}
