/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcTraderField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcTraderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTraderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcTraderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcTraderField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcTraderField_ExchangeID_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		CtpJNI.CThostFtdcTraderField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return CtpJNI.CThostFtdcTraderField_TraderID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		CtpJNI.CThostFtdcTraderField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return CtpJNI.CThostFtdcTraderField_ParticipantID_get(swigCPtr, this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcTraderField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return CtpJNI.CThostFtdcTraderField_Password_get(swigCPtr, this);
	}

	public void setInstallCount(int value) {
		CtpJNI.CThostFtdcTraderField_InstallCount_set(swigCPtr, this, value);
	}

	public int getInstallCount() {
		return CtpJNI.CThostFtdcTraderField_InstallCount_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcTraderField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcTraderField_BrokerID_get(swigCPtr, this);
	}

	public CThostFtdcTraderField() {
		this(CtpJNI.new_CThostFtdcTraderField(), true);
	}

}
