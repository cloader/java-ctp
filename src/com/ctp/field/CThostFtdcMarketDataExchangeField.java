/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcMarketDataExchangeField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcMarketDataExchangeField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcMarketDataExchangeField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcMarketDataExchangeField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcMarketDataExchangeField_ExchangeID_set(swigCPtr, this,
				value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcMarketDataExchangeField_ExchangeID_get(
				swigCPtr, this);
	}

	public CThostFtdcMarketDataExchangeField() {
		this(CtpJNI.new_CThostFtdcMarketDataExchangeField(), true);
	}

}
