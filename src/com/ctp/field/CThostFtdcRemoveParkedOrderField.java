/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcRemoveParkedOrderField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcRemoveParkedOrderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcRemoveParkedOrderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcRemoveParkedOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcRemoveParkedOrderField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcRemoveParkedOrderField_BrokerID_get(swigCPtr,
				this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcRemoveParkedOrderField_InvestorID_set(swigCPtr, this,
				value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcRemoveParkedOrderField_InvestorID_get(swigCPtr,
				this);
	}

	public void setParkedOrderID(String value) {
		CtpJNI.CThostFtdcRemoveParkedOrderField_ParkedOrderID_set(swigCPtr,
				this, value);
	}

	public String getParkedOrderID() {
		return CtpJNI.CThostFtdcRemoveParkedOrderField_ParkedOrderID_get(
				swigCPtr, this);
	}

	public CThostFtdcRemoveParkedOrderField() {
		this(CtpJNI.new_CThostFtdcRemoveParkedOrderField(), true);
	}

}