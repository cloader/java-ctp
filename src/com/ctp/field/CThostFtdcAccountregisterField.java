/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcAccountregisterField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcAccountregisterField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcAccountregisterField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcAccountregisterField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeDay(String value) {
		CtpJNI.CThostFtdcAccountregisterField_TradeDay_set(swigCPtr, this,
				value);
	}

	public String getTradeDay() {
		return CtpJNI.CThostFtdcAccountregisterField_TradeDay_get(swigCPtr,
				this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcAccountregisterField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcAccountregisterField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcAccountregisterField_BankBranchID_set(swigCPtr, this,
				value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcAccountregisterField_BankBranchID_get(swigCPtr,
				this);
	}

	public void setBankAccount(String value) {
		CtpJNI.CThostFtdcAccountregisterField_BankAccount_set(swigCPtr, this,
				value);
	}

	public String getBankAccount() {
		return CtpJNI.CThostFtdcAccountregisterField_BankAccount_get(swigCPtr,
				this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcAccountregisterField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcAccountregisterField_BrokerID_get(swigCPtr,
				this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcAccountregisterField_BrokerBranchID_set(swigCPtr,
				this, value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcAccountregisterField_BrokerBranchID_get(
				swigCPtr, this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcAccountregisterField_AccountID_set(swigCPtr, this,
				value);
	}

	public String getAccountID() {
		return CtpJNI.CThostFtdcAccountregisterField_AccountID_get(swigCPtr,
				this);
	}

	public void setIdCardType(char value) {
		CtpJNI.CThostFtdcAccountregisterField_IdCardType_set(swigCPtr, this,
				value);
	}

	public char getIdCardType() {
		return CtpJNI.CThostFtdcAccountregisterField_IdCardType_get(swigCPtr,
				this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcAccountregisterField_IdentifiedCardNo_set(swigCPtr,
				this, value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI.CThostFtdcAccountregisterField_IdentifiedCardNo_get(
				swigCPtr, this);
	}

	public void setCustomerName(String value) {
		CtpJNI.CThostFtdcAccountregisterField_CustomerName_set(swigCPtr, this,
				value);
	}

	public String getCustomerName() {
		return CtpJNI.CThostFtdcAccountregisterField_CustomerName_get(swigCPtr,
				this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcAccountregisterField_CurrencyID_set(swigCPtr, this,
				value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcAccountregisterField_CurrencyID_get(swigCPtr,
				this);
	}

	public void setOpenOrDestroy(char value) {
		CtpJNI.CThostFtdcAccountregisterField_OpenOrDestroy_set(swigCPtr, this,
				value);
	}

	public char getOpenOrDestroy() {
		return CtpJNI.CThostFtdcAccountregisterField_OpenOrDestroy_get(
				swigCPtr, this);
	}

	public void setRegDate(String value) {
		CtpJNI.CThostFtdcAccountregisterField_RegDate_set(swigCPtr, this, value);
	}

	public String getRegDate() {
		return CtpJNI
				.CThostFtdcAccountregisterField_RegDate_get(swigCPtr, this);
	}

	public void setOutDate(String value) {
		CtpJNI.CThostFtdcAccountregisterField_OutDate_set(swigCPtr, this, value);
	}

	public String getOutDate() {
		return CtpJNI
				.CThostFtdcAccountregisterField_OutDate_get(swigCPtr, this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcAccountregisterField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcAccountregisterField_TID_get(swigCPtr, this);
	}

	public void setCustType(char value) {
		CtpJNI.CThostFtdcAccountregisterField_CustType_set(swigCPtr, this,
				value);
	}

	public char getCustType() {
		return CtpJNI.CThostFtdcAccountregisterField_CustType_get(swigCPtr,
				this);
	}

	public void setBankAccType(char value) {
		CtpJNI.CThostFtdcAccountregisterField_BankAccType_set(swigCPtr, this,
				value);
	}

	public char getBankAccType() {
		return CtpJNI.CThostFtdcAccountregisterField_BankAccType_get(swigCPtr,
				this);
	}

	public CThostFtdcAccountregisterField() {
		this(CtpJNI.new_CThostFtdcAccountregisterField(), true);
	}

}
