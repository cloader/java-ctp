/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryParkedOrderActionField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryParkedOrderActionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryParkedOrderActionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryParkedOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcQryParkedOrderActionField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcQryParkedOrderActionField_BrokerID_get(
				swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcQryParkedOrderActionField_InvestorID_set(swigCPtr,
				this, value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcQryParkedOrderActionField_InvestorID_get(
				swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		CtpJNI.CThostFtdcQryParkedOrderActionField_InstrumentID_set(swigCPtr,
				this, value);
	}

	public String getInstrumentID() {
		return CtpJNI.CThostFtdcQryParkedOrderActionField_InstrumentID_get(
				swigCPtr, this);
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcQryParkedOrderActionField_ExchangeID_set(swigCPtr,
				this, value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcQryParkedOrderActionField_ExchangeID_get(
				swigCPtr, this);
	}

	public CThostFtdcQryParkedOrderActionField() {
		this(CtpJNI.new_CThostFtdcQryParkedOrderActionField(), true);
	}

}
