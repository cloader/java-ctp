/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryExchangeSequenceField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryExchangeSequenceField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryExchangeSequenceField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryExchangeSequenceField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcQryExchangeSequenceField_ExchangeID_set(swigCPtr,
				this, value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcQryExchangeSequenceField_ExchangeID_get(
				swigCPtr, this);
	}

	public CThostFtdcQryExchangeSequenceField() {
		this(CtpJNI.new_CThostFtdcQryExchangeSequenceField(), true);
	}

}
