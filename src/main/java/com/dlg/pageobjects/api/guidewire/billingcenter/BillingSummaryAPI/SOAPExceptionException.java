/**
 * SOAPExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI;

public class SOAPExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1522924667899L;
    private com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.SOAPException faultMessage;

    public SOAPExceptionException() {
        super("SOAPExceptionException");
    }

    public SOAPExceptionException(java.lang.String s) {
        super(s);
    }

    public SOAPExceptionException(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public SOAPExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.SOAPException msg) {
        faultMessage = msg;
    }

    public com.dlg.pageobjects.api.guidewire.billingcenter.BillingSummaryAPI.BillingSummaryAPIStub.SOAPException getFaultMessage() {
        return faultMessage;
    }
}
