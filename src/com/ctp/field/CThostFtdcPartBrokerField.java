/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcPartBrokerField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcPartBrokerField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcPartBrokerField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcPartBrokerField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcPartBrokerField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcPartBrokerField_BrokerID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcPartBrokerField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcPartBrokerField_ExchangeID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		CtpJNI.CThostFtdcPartBrokerField_ParticipantID_set(swigCPtr, this,
				value);
	}

	public String getParticipantID() {
		return CtpJNI.CThostFtdcPartBrokerField_ParticipantID_get(swigCPtr,
				this);
	}

	public void setIsActive(int value) {
		CtpJNI.CThostFtdcPartBrokerField_IsActive_set(swigCPtr, this, value);
	}

	public int getIsActive() {
		return CtpJNI.CThostFtdcPartBrokerField_IsActive_get(swigCPtr, this);
	}

	public CThostFtdcPartBrokerField() {
		this(CtpJNI.new_CThostFtdcPartBrokerField(), true);
	}

}
