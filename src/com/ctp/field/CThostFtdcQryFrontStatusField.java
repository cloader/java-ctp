/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcQryFrontStatusField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcQryFrontStatusField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryFrontStatusField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcQryFrontStatusField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setFrontID(int value) {
		CtpJNI.CThostFtdcQryFrontStatusField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return CtpJNI.CThostFtdcQryFrontStatusField_FrontID_get(swigCPtr, this);
	}

	public CThostFtdcQryFrontStatusField() {
		this(CtpJNI.new_CThostFtdcQryFrontStatusField(), true);
	}

}
