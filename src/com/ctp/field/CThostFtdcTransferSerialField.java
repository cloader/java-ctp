/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcTransferSerialField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcTransferSerialField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTransferSerialField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcTransferSerialField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcTransferSerialField_PlateSerial_set(swigCPtr, this,
				value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcTransferSerialField_PlateSerial_get(swigCPtr,
				this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcTransferSerialField_TradeDate_set(swigCPtr, this,
				value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcTransferSerialField_TradeDate_get(swigCPtr,
				this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcTransferSerialField_TradingDay_set(swigCPtr, this,
				value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcTransferSerialField_TradingDay_get(swigCPtr,
				this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcTransferSerialField_TradeTime_set(swigCPtr, this,
				value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcTransferSerialField_TradeTime_get(swigCPtr,
				this);
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcTransferSerialField_TradeCode_set(swigCPtr, this,
				value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcTransferSerialField_TradeCode_get(swigCPtr,
				this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcTransferSerialField_SessionID_set(swigCPtr, this,
				value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcTransferSerialField_SessionID_get(swigCPtr,
				this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcTransferSerialField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcTransferSerialField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcTransferSerialField_BankBranchID_set(swigCPtr, this,
				value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcTransferSerialField_BankBranchID_get(swigCPtr,
				this);
	}

	public void setBankAccType(char value) {
		CtpJNI.CThostFtdcTransferSerialField_BankAccType_set(swigCPtr, this,
				value);
	}

	public char getBankAccType() {
		return CtpJNI.CThostFtdcTransferSerialField_BankAccType_get(swigCPtr,
				this);
	}

	public void setBankAccount(String value) {
		CtpJNI.CThostFtdcTransferSerialField_BankAccount_set(swigCPtr, this,
				value);
	}

	public String getBankAccount() {
		return CtpJNI.CThostFtdcTransferSerialField_BankAccount_get(swigCPtr,
				this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcTransferSerialField_BankSerial_set(swigCPtr, this,
				value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcTransferSerialField_BankSerial_get(swigCPtr,
				this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcTransferSerialField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI
				.CThostFtdcTransferSerialField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcTransferSerialField_BrokerBranchID_set(swigCPtr, this,
				value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcTransferSerialField_BrokerBranchID_get(
				swigCPtr, this);
	}

	public void setFutureAccType(char value) {
		CtpJNI.CThostFtdcTransferSerialField_FutureAccType_set(swigCPtr, this,
				value);
	}

	public char getFutureAccType() {
		return CtpJNI.CThostFtdcTransferSerialField_FutureAccType_get(swigCPtr,
				this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcTransferSerialField_AccountID_set(swigCPtr, this,
				value);
	}

	public String getAccountID() {
		return CtpJNI.CThostFtdcTransferSerialField_AccountID_get(swigCPtr,
				this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcTransferSerialField_InvestorID_set(swigCPtr, this,
				value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcTransferSerialField_InvestorID_get(swigCPtr,
				this);
	}

	public void setFutureSerial(int value) {
		CtpJNI.CThostFtdcTransferSerialField_FutureSerial_set(swigCPtr, this,
				value);
	}

	public int getFutureSerial() {
		return CtpJNI.CThostFtdcTransferSerialField_FutureSerial_get(swigCPtr,
				this);
	}

	public void setIdCardType(char value) {
		CtpJNI.CThostFtdcTransferSerialField_IdCardType_set(swigCPtr, this,
				value);
	}

	public char getIdCardType() {
		return CtpJNI.CThostFtdcTransferSerialField_IdCardType_get(swigCPtr,
				this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcTransferSerialField_IdentifiedCardNo_set(swigCPtr,
				this, value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI.CThostFtdcTransferSerialField_IdentifiedCardNo_get(
				swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcTransferSerialField_CurrencyID_set(swigCPtr, this,
				value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcTransferSerialField_CurrencyID_get(swigCPtr,
				this);
	}

	public void setTradeAmount(double value) {
		CtpJNI.CThostFtdcTransferSerialField_TradeAmount_set(swigCPtr, this,
				value);
	}

	public double getTradeAmount() {
		return CtpJNI.CThostFtdcTransferSerialField_TradeAmount_get(swigCPtr,
				this);
	}

	public void setCustFee(double value) {
		CtpJNI.CThostFtdcTransferSerialField_CustFee_set(swigCPtr, this, value);
	}

	public double getCustFee() {
		return CtpJNI.CThostFtdcTransferSerialField_CustFee_get(swigCPtr, this);
	}

	public void setBrokerFee(double value) {
		CtpJNI.CThostFtdcTransferSerialField_BrokerFee_set(swigCPtr, this,
				value);
	}

	public double getBrokerFee() {
		return CtpJNI.CThostFtdcTransferSerialField_BrokerFee_get(swigCPtr,
				this);
	}

	public void setAvailabilityFlag(char value) {
		CtpJNI.CThostFtdcTransferSerialField_AvailabilityFlag_set(swigCPtr,
				this, value);
	}

	public char getAvailabilityFlag() {
		return CtpJNI.CThostFtdcTransferSerialField_AvailabilityFlag_get(
				swigCPtr, this);
	}

	public void setOperatorCode(String value) {
		CtpJNI.CThostFtdcTransferSerialField_OperatorCode_set(swigCPtr, this,
				value);
	}

	public String getOperatorCode() {
		return CtpJNI.CThostFtdcTransferSerialField_OperatorCode_get(swigCPtr,
				this);
	}

	public void setBankNewAccount(String value) {
		CtpJNI.CThostFtdcTransferSerialField_BankNewAccount_set(swigCPtr, this,
				value);
	}

	public String getBankNewAccount() {
		return CtpJNI.CThostFtdcTransferSerialField_BankNewAccount_get(
				swigCPtr, this);
	}

	public void setErrorID(int value) {
		CtpJNI.CThostFtdcTransferSerialField_ErrorID_set(swigCPtr, this, value);
	}

	public int getErrorID() {
		return CtpJNI.CThostFtdcTransferSerialField_ErrorID_get(swigCPtr, this);
	}

	public void setErrorMsg(String value) {
		CtpJNI.CThostFtdcTransferSerialField_ErrorMsg_set(swigCPtr, this, value);
	}

	public String getErrorMsg() {
		return CtpJNI
				.CThostFtdcTransferSerialField_ErrorMsg_get(swigCPtr, this);
	}

	public CThostFtdcTransferSerialField() {
		this(CtpJNI.new_CThostFtdcTransferSerialField(), true);
	}

}
