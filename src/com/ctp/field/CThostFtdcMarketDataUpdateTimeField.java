/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcMarketDataUpdateTimeField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcMarketDataUpdateTimeField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcMarketDataUpdateTimeField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcMarketDataUpdateTimeField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value) {
		CtpJNI.CThostFtdcMarketDataUpdateTimeField_InstrumentID_set(swigCPtr,
				this, value);
	}

	public String getInstrumentID() {
		return CtpJNI.CThostFtdcMarketDataUpdateTimeField_InstrumentID_get(
				swigCPtr, this);
	}

	public void setUpdateTime(String value) {
		CtpJNI.CThostFtdcMarketDataUpdateTimeField_UpdateTime_set(swigCPtr,
				this, value);
	}

	public String getUpdateTime() {
		return CtpJNI.CThostFtdcMarketDataUpdateTimeField_UpdateTime_get(
				swigCPtr, this);
	}

	public void setUpdateMillisec(int value) {
		CtpJNI.CThostFtdcMarketDataUpdateTimeField_UpdateMillisec_set(swigCPtr,
				this, value);
	}

	public int getUpdateMillisec() {
		return CtpJNI.CThostFtdcMarketDataUpdateTimeField_UpdateMillisec_get(
				swigCPtr, this);
	}

	public void setActionDay(String value) {
		CtpJNI.CThostFtdcMarketDataUpdateTimeField_ActionDay_set(swigCPtr,
				this, value);
	}

	public String getActionDay() {
		return CtpJNI.CThostFtdcMarketDataUpdateTimeField_ActionDay_get(
				swigCPtr, this);
	}

	public CThostFtdcMarketDataUpdateTimeField() {
		this(CtpJNI.new_CThostFtdcMarketDataUpdateTimeField(), true);
	}

}
