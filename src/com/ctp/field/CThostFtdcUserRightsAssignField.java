/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcUserRightsAssignField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcUserRightsAssignField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcUserRightsAssignField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcUserRightsAssignField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcUserRightsAssignField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcUserRightsAssignField_BrokerID_get(swigCPtr,
				this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcUserRightsAssignField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return CtpJNI
				.CThostFtdcUserRightsAssignField_UserID_get(swigCPtr, this);
	}

	public void setDRIdentityID(int value) {
		CtpJNI.CThostFtdcUserRightsAssignField_DRIdentityID_set(swigCPtr, this,
				value);
	}

	public int getDRIdentityID() {
		return CtpJNI.CThostFtdcUserRightsAssignField_DRIdentityID_get(
				swigCPtr, this);
	}

	public CThostFtdcUserRightsAssignField() {
		this(CtpJNI.new_CThostFtdcUserRightsAssignField(), true);
	}

}
