/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcReqQueryAccountField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcReqQueryAccountField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcReqQueryAccountField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcReqQueryAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_TradeCode_set(swigCPtr, this,
				value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcReqQueryAccountField_TradeCode_get(swigCPtr,
				this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BankBranchID_set(swigCPtr, this,
				value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BankBranchID_get(swigCPtr,
				this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BrokerID_set(swigCPtr, this,
				value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BrokerID_get(swigCPtr,
				this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BrokerBranchID_set(swigCPtr,
				this, value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BrokerBranchID_get(
				swigCPtr, this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_TradeDate_set(swigCPtr, this,
				value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcReqQueryAccountField_TradeDate_get(swigCPtr,
				this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_TradeTime_set(swigCPtr, this,
				value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcReqQueryAccountField_TradeTime_get(swigCPtr,
				this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BankSerial_set(swigCPtr, this,
				value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BankSerial_get(swigCPtr,
				this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_TradingDay_set(swigCPtr, this,
				value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcReqQueryAccountField_TradingDay_get(swigCPtr,
				this);
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcReqQueryAccountField_PlateSerial_set(swigCPtr, this,
				value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcReqQueryAccountField_PlateSerial_get(swigCPtr,
				this);
	}

	public void setLastFragment(char value) {
		CtpJNI.CThostFtdcReqQueryAccountField_LastFragment_set(swigCPtr, this,
				value);
	}

	public char getLastFragment() {
		return CtpJNI.CThostFtdcReqQueryAccountField_LastFragment_get(swigCPtr,
				this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcReqQueryAccountField_SessionID_set(swigCPtr, this,
				value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_SessionID_get(swigCPtr,
				this);
	}

	public void setCustomerName(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_CustomerName_set(swigCPtr, this,
				value);
	}

	public String getCustomerName() {
		return CtpJNI.CThostFtdcReqQueryAccountField_CustomerName_get(swigCPtr,
				this);
	}

	public void setIdCardType(char value) {
		CtpJNI.CThostFtdcReqQueryAccountField_IdCardType_set(swigCPtr, this,
				value);
	}

	public char getIdCardType() {
		return CtpJNI.CThostFtdcReqQueryAccountField_IdCardType_get(swigCPtr,
				this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_IdentifiedCardNo_set(swigCPtr,
				this, value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI.CThostFtdcReqQueryAccountField_IdentifiedCardNo_get(
				swigCPtr, this);
	}

	public void setCustType(char value) {
		CtpJNI.CThostFtdcReqQueryAccountField_CustType_set(swigCPtr, this,
				value);
	}

	public char getCustType() {
		return CtpJNI.CThostFtdcReqQueryAccountField_CustType_get(swigCPtr,
				this);
	}

	public void setBankAccount(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BankAccount_set(swigCPtr, this,
				value);
	}

	public String getBankAccount() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BankAccount_get(swigCPtr,
				this);
	}

	public void setBankPassWord(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BankPassWord_set(swigCPtr, this,
				value);
	}

	public String getBankPassWord() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BankPassWord_get(swigCPtr,
				this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_AccountID_set(swigCPtr, this,
				value);
	}

	public String getAccountID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_AccountID_get(swigCPtr,
				this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_Password_set(swigCPtr, this,
				value);
	}

	public String getPassword() {
		return CtpJNI.CThostFtdcReqQueryAccountField_Password_get(swigCPtr,
				this);
	}

	public void setFutureSerial(int value) {
		CtpJNI.CThostFtdcReqQueryAccountField_FutureSerial_set(swigCPtr, this,
				value);
	}

	public int getFutureSerial() {
		return CtpJNI.CThostFtdcReqQueryAccountField_FutureSerial_get(swigCPtr,
				this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcReqQueryAccountField_InstallID_set(swigCPtr, this,
				value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_InstallID_get(swigCPtr,
				this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_UserID_get(swigCPtr, this);
	}

	public void setVerifyCertNoFlag(char value) {
		CtpJNI.CThostFtdcReqQueryAccountField_VerifyCertNoFlag_set(swigCPtr,
				this, value);
	}

	public char getVerifyCertNoFlag() {
		return CtpJNI.CThostFtdcReqQueryAccountField_VerifyCertNoFlag_get(
				swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_CurrencyID_set(swigCPtr, this,
				value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_CurrencyID_get(swigCPtr,
				this);
	}

	public void setDigest(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return CtpJNI.CThostFtdcReqQueryAccountField_Digest_get(swigCPtr, this);
	}

	public void setBankAccType(char value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BankAccType_set(swigCPtr, this,
				value);
	}

	public char getBankAccType() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BankAccType_get(swigCPtr,
				this);
	}

	public void setDeviceID(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_DeviceID_set(swigCPtr, this,
				value);
	}

	public String getDeviceID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_DeviceID_get(swigCPtr,
				this);
	}

	public void setBankSecuAccType(char value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BankSecuAccType_set(swigCPtr,
				this, value);
	}

	public char getBankSecuAccType() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BankSecuAccType_get(
				swigCPtr, this);
	}

	public void setBrokerIDByBank(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BrokerIDByBank_set(swigCPtr,
				this, value);
	}

	public String getBrokerIDByBank() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BrokerIDByBank_get(
				swigCPtr, this);
	}

	public void setBankSecuAcc(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BankSecuAcc_set(swigCPtr, this,
				value);
	}

	public String getBankSecuAcc() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BankSecuAcc_get(swigCPtr,
				this);
	}

	public void setBankPwdFlag(char value) {
		CtpJNI.CThostFtdcReqQueryAccountField_BankPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getBankPwdFlag() {
		return CtpJNI.CThostFtdcReqQueryAccountField_BankPwdFlag_get(swigCPtr,
				this);
	}

	public void setSecuPwdFlag(char value) {
		CtpJNI.CThostFtdcReqQueryAccountField_SecuPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getSecuPwdFlag() {
		return CtpJNI.CThostFtdcReqQueryAccountField_SecuPwdFlag_get(swigCPtr,
				this);
	}

	public void setOperNo(String value) {
		CtpJNI.CThostFtdcReqQueryAccountField_OperNo_set(swigCPtr, this, value);
	}

	public String getOperNo() {
		return CtpJNI.CThostFtdcReqQueryAccountField_OperNo_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		CtpJNI.CThostFtdcReqQueryAccountField_RequestID_set(swigCPtr, this,
				value);
	}

	public int getRequestID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_RequestID_get(swigCPtr,
				this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcReqQueryAccountField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcReqQueryAccountField_TID_get(swigCPtr, this);
	}

	public CThostFtdcReqQueryAccountField() {
		this(CtpJNI.new_CThostFtdcReqQueryAccountField(), true);
	}

}