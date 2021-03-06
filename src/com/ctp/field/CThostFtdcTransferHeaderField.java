/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcTransferHeaderField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcTransferHeaderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTransferHeaderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcTransferHeaderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setVersion(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_Version_set(swigCPtr, this, value);
	}

	public String getVersion() {
		return CtpJNI.CThostFtdcTransferHeaderField_Version_get(swigCPtr, this);
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_TradeCode_set(swigCPtr, this,
				value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcTransferHeaderField_TradeCode_get(swigCPtr,
				this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_TradeDate_set(swigCPtr, this,
				value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcTransferHeaderField_TradeDate_get(swigCPtr,
				this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_TradeTime_set(swigCPtr, this,
				value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcTransferHeaderField_TradeTime_get(swigCPtr,
				this);
	}

	public void setTradeSerial(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_TradeSerial_set(swigCPtr, this,
				value);
	}

	public String getTradeSerial() {
		return CtpJNI.CThostFtdcTransferHeaderField_TradeSerial_get(swigCPtr,
				this);
	}

	public void setFutureID(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_FutureID_set(swigCPtr, this, value);
	}

	public String getFutureID() {
		return CtpJNI
				.CThostFtdcTransferHeaderField_FutureID_get(swigCPtr, this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcTransferHeaderField_BankID_get(swigCPtr, this);
	}

	public void setBankBrchID(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_BankBrchID_set(swigCPtr, this,
				value);
	}

	public String getBankBrchID() {
		return CtpJNI.CThostFtdcTransferHeaderField_BankBrchID_get(swigCPtr,
				this);
	}

	public void setOperNo(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_OperNo_set(swigCPtr, this, value);
	}

	public String getOperNo() {
		return CtpJNI.CThostFtdcTransferHeaderField_OperNo_get(swigCPtr, this);
	}

	public void setDeviceID(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_DeviceID_set(swigCPtr, this, value);
	}

	public String getDeviceID() {
		return CtpJNI
				.CThostFtdcTransferHeaderField_DeviceID_get(swigCPtr, this);
	}

	public void setRecordNum(String value) {
		CtpJNI.CThostFtdcTransferHeaderField_RecordNum_set(swigCPtr, this,
				value);
	}

	public String getRecordNum() {
		return CtpJNI.CThostFtdcTransferHeaderField_RecordNum_get(swigCPtr,
				this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcTransferHeaderField_SessionID_set(swigCPtr, this,
				value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcTransferHeaderField_SessionID_get(swigCPtr,
				this);
	}

	public void setRequestID(int value) {
		CtpJNI.CThostFtdcTransferHeaderField_RequestID_set(swigCPtr, this,
				value);
	}

	public int getRequestID() {
		return CtpJNI.CThostFtdcTransferHeaderField_RequestID_get(swigCPtr,
				this);
	}

	public CThostFtdcTransferHeaderField() {
		this(CtpJNI.new_CThostFtdcTransferHeaderField(), true);
	}

}
