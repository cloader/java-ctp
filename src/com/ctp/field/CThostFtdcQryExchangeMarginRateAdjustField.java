/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryExchangeMarginRateAdjustField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryExchangeMarginRateAdjustField(long cPtr,
			boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryExchangeMarginRateAdjustField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryExchangeMarginRateAdjustField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcQryExchangeMarginRateAdjustField_BrokerID_set(
				swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcQryExchangeMarginRateAdjustField_BrokerID_get(
				swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		CtpJNI.CThostFtdcQryExchangeMarginRateAdjustField_InstrumentID_set(
				swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return CtpJNI
				.CThostFtdcQryExchangeMarginRateAdjustField_InstrumentID_get(
						swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		CtpJNI.CThostFtdcQryExchangeMarginRateAdjustField_HedgeFlag_set(
				swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return CtpJNI.CThostFtdcQryExchangeMarginRateAdjustField_HedgeFlag_get(
				swigCPtr, this);
	}

	public CThostFtdcQryExchangeMarginRateAdjustField() {
		this(CtpJNI.new_CThostFtdcQryExchangeMarginRateAdjustField(), true);
	}

}
