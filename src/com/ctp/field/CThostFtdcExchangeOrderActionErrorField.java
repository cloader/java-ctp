/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcExchangeOrderActionErrorField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcExchangeOrderActionErrorField(long cPtr,
			boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcExchangeOrderActionErrorField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcExchangeOrderActionErrorField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionErrorField_ExchangeID_set(swigCPtr,
				this, value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcExchangeOrderActionErrorField_ExchangeID_get(
				swigCPtr, this);
	}

	public void setOrderSysID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionErrorField_OrderSysID_set(swigCPtr,
				this, value);
	}

	public String getOrderSysID() {
		return CtpJNI.CThostFtdcExchangeOrderActionErrorField_OrderSysID_get(
				swigCPtr, this);
	}

	public void setTraderID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionErrorField_TraderID_set(swigCPtr,
				this, value);
	}

	public String getTraderID() {
		return CtpJNI.CThostFtdcExchangeOrderActionErrorField_TraderID_get(
				swigCPtr, this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcExchangeOrderActionErrorField_InstallID_set(swigCPtr,
				this, value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcExchangeOrderActionErrorField_InstallID_get(
				swigCPtr, this);
	}

	public void setOrderLocalID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionErrorField_OrderLocalID_set(
				swigCPtr, this, value);
	}

	public String getOrderLocalID() {
		return CtpJNI.CThostFtdcExchangeOrderActionErrorField_OrderLocalID_get(
				swigCPtr, this);
	}

	public void setActionLocalID(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionErrorField_ActionLocalID_set(
				swigCPtr, this, value);
	}

	public String getActionLocalID() {
		return CtpJNI
				.CThostFtdcExchangeOrderActionErrorField_ActionLocalID_get(
						swigCPtr, this);
	}

	public void setErrorID(int value) {
		CtpJNI.CThostFtdcExchangeOrderActionErrorField_ErrorID_set(swigCPtr,
				this, value);
	}

	public int getErrorID() {
		return CtpJNI.CThostFtdcExchangeOrderActionErrorField_ErrorID_get(
				swigCPtr, this);
	}

	public void setErrorMsg(String value) {
		CtpJNI.CThostFtdcExchangeOrderActionErrorField_ErrorMsg_set(swigCPtr,
				this, value);
	}

	public String getErrorMsg() {
		return CtpJNI.CThostFtdcExchangeOrderActionErrorField_ErrorMsg_get(
				swigCPtr, this);
	}

	public CThostFtdcExchangeOrderActionErrorField() {
		this(CtpJNI.new_CThostFtdcExchangeOrderActionErrorField(), true);
	}

}