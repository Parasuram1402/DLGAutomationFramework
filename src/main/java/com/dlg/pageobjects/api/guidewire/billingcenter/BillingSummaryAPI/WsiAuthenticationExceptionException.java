/**
 * WsiAuthenticationExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI;

public class WsiAuthenticationExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1522924667908L;
    private com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.WsiAuthenticationException faultMessage;

    public WsiAuthenticationExceptionException() {
        super("WsiAuthenticationExceptionException");
    }

    public WsiAuthenticationExceptionException(java.lang.String s) {
        super(s);
    }

    public WsiAuthenticationExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public WsiAuthenticationExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.WsiAuthenticationException msg) {
        faultMessage = msg;
    }

    public com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.WsiAuthenticationException getFaultMessage() {
        return faultMessage;
    }
}
