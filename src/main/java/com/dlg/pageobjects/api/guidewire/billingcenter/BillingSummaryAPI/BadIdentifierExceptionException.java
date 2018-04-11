/**
 * BadIdentifierExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI;

public class BadIdentifierExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1522924667814L;
    private com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.BadIdentifierException faultMessage;

    public BadIdentifierExceptionException() {
        super("BadIdentifierExceptionException");
    }

    public BadIdentifierExceptionException(java.lang.String s) {
        super(s);
    }

    public BadIdentifierExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public BadIdentifierExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.BadIdentifierException msg) {
        faultMessage = msg;
    }

    public com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.BadIdentifierException getFaultMessage() {
        return faultMessage;
    }
}
