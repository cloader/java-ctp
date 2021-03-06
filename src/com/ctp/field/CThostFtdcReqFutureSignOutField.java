/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcReqFutureSignOutField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcReqFutureSignOutField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcReqFutureSignOutField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcReqFutureSignOutField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_TradeCode_set(swigCPtr, this,
				value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_TradeCode_get(swigCPtr,
				this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI
				.CThostFtdcReqFutureSignOutField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_BankBranchID_set(swigCPtr, this,
				value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_BankBranchID_get(
				swigCPtr, this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_BrokerID_get(swigCPtr,
				this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_BrokerBranchID_set(swigCPtr,
				this, value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_BrokerBranchID_get(
				swigCPtr, this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_TradeDate_set(swigCPtr, this,
				value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_TradeDate_get(swigCPtr,
				this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_TradeTime_set(swigCPtr, this,
				value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_TradeTime_get(swigCPtr,
				this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_BankSerial_set(swigCPtr, this,
				value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_BankSerial_get(swigCPtr,
				this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_TradingDay_set(swigCPtr, this,
				value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_TradingDay_get(swigCPtr,
				this);
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_PlateSerial_set(swigCPtr, this,
				value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_PlateSerial_get(swigCPtr,
				this);
	}

	public void setLastFragment(char value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_LastFragment_set(swigCPtr, this,
				value);
	}

	public char getLastFragment() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_LastFragment_get(
				swigCPtr, this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_SessionID_set(swigCPtr, this,
				value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_SessionID_get(swigCPtr,
				this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_InstallID_set(swigCPtr, this,
				value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_InstallID_get(swigCPtr,
				this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return CtpJNI
				.CThostFtdcReqFutureSignOutField_UserID_get(swigCPtr, this);
	}

	public void setDigest(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return CtpJNI
				.CThostFtdcReqFutureSignOutField_Digest_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_CurrencyID_set(swigCPtr, this,
				value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_CurrencyID_get(swigCPtr,
				this);
	}

	public void setDeviceID(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_DeviceID_set(swigCPtr, this,
				value);
	}

	public String getDeviceID() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_DeviceID_get(swigCPtr,
				this);
	}

	public void setBrokerIDByBank(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_BrokerIDByBank_set(swigCPtr,
				this, value);
	}

	public String getBrokerIDByBank() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_BrokerIDByBank_get(
				swigCPtr, this);
	}

	public void setOperNo(String value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_OperNo_set(swigCPtr, this, value);
	}

	public String getOperNo() {
		return CtpJNI
				.CThostFtdcReqFutureSignOutField_OperNo_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_RequestID_set(swigCPtr, this,
				value);
	}

	public int getRequestID() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_RequestID_get(swigCPtr,
				this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcReqFutureSignOutField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcReqFutureSignOutField_TID_get(swigCPtr, this);
	}

	public CThostFtdcReqFutureSignOutField() {
		this(CtpJNI.new_CThostFtdcReqFutureSignOutField(), true);
	}

}
