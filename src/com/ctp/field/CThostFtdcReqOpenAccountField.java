/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcReqOpenAccountField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcReqOpenAccountField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcReqOpenAccountField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcReqOpenAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_TradeCode_set(swigCPtr, this,
				value);
	}

	public String getTradeCode() {
		return CtpJNI.CThostFtdcReqOpenAccountField_TradeCode_get(swigCPtr,
				this);
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BankBranchID_set(swigCPtr, this,
				value);
	}

	public String getBankBranchID() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BankBranchID_get(swigCPtr,
				this);
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return CtpJNI
				.CThostFtdcReqOpenAccountField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BrokerBranchID_set(swigCPtr, this,
				value);
	}

	public String getBrokerBranchID() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BrokerBranchID_get(
				swigCPtr, this);
	}

	public void setTradeDate(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_TradeDate_set(swigCPtr, this,
				value);
	}

	public String getTradeDate() {
		return CtpJNI.CThostFtdcReqOpenAccountField_TradeDate_get(swigCPtr,
				this);
	}

	public void setTradeTime(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_TradeTime_set(swigCPtr, this,
				value);
	}

	public String getTradeTime() {
		return CtpJNI.CThostFtdcReqOpenAccountField_TradeTime_get(swigCPtr,
				this);
	}

	public void setBankSerial(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BankSerial_set(swigCPtr, this,
				value);
	}

	public String getBankSerial() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BankSerial_get(swigCPtr,
				this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_TradingDay_set(swigCPtr, this,
				value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcReqOpenAccountField_TradingDay_get(swigCPtr,
				this);
	}

	public void setPlateSerial(int value) {
		CtpJNI.CThostFtdcReqOpenAccountField_PlateSerial_set(swigCPtr, this,
				value);
	}

	public int getPlateSerial() {
		return CtpJNI.CThostFtdcReqOpenAccountField_PlateSerial_get(swigCPtr,
				this);
	}

	public void setLastFragment(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_LastFragment_set(swigCPtr, this,
				value);
	}

	public char getLastFragment() {
		return CtpJNI.CThostFtdcReqOpenAccountField_LastFragment_get(swigCPtr,
				this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcReqOpenAccountField_SessionID_set(swigCPtr, this,
				value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcReqOpenAccountField_SessionID_get(swigCPtr,
				this);
	}

	public void setCustomerName(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_CustomerName_set(swigCPtr, this,
				value);
	}

	public String getCustomerName() {
		return CtpJNI.CThostFtdcReqOpenAccountField_CustomerName_get(swigCPtr,
				this);
	}

	public void setIdCardType(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_IdCardType_set(swigCPtr, this,
				value);
	}

	public char getIdCardType() {
		return CtpJNI.CThostFtdcReqOpenAccountField_IdCardType_get(swigCPtr,
				this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_IdentifiedCardNo_set(swigCPtr,
				this, value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI.CThostFtdcReqOpenAccountField_IdentifiedCardNo_get(
				swigCPtr, this);
	}

	public void setGender(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_Gender_set(swigCPtr, this, value);
	}

	public char getGender() {
		return CtpJNI.CThostFtdcReqOpenAccountField_Gender_get(swigCPtr, this);
	}

	public void setCountryCode(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_CountryCode_set(swigCPtr, this,
				value);
	}

	public String getCountryCode() {
		return CtpJNI.CThostFtdcReqOpenAccountField_CountryCode_get(swigCPtr,
				this);
	}

	public void setCustType(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_CustType_set(swigCPtr, this, value);
	}

	public char getCustType() {
		return CtpJNI
				.CThostFtdcReqOpenAccountField_CustType_get(swigCPtr, this);
	}

	public void setAddress(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_Address_set(swigCPtr, this, value);
	}

	public String getAddress() {
		return CtpJNI.CThostFtdcReqOpenAccountField_Address_get(swigCPtr, this);
	}

	public void setZipCode(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_ZipCode_set(swigCPtr, this, value);
	}

	public String getZipCode() {
		return CtpJNI.CThostFtdcReqOpenAccountField_ZipCode_get(swigCPtr, this);
	}

	public void setTelephone(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_Telephone_set(swigCPtr, this,
				value);
	}

	public String getTelephone() {
		return CtpJNI.CThostFtdcReqOpenAccountField_Telephone_get(swigCPtr,
				this);
	}

	public void setMobilePhone(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_MobilePhone_set(swigCPtr, this,
				value);
	}

	public String getMobilePhone() {
		return CtpJNI.CThostFtdcReqOpenAccountField_MobilePhone_get(swigCPtr,
				this);
	}

	public void setFax(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_Fax_set(swigCPtr, this, value);
	}

	public String getFax() {
		return CtpJNI.CThostFtdcReqOpenAccountField_Fax_get(swigCPtr, this);
	}

	public void setEMail(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_EMail_set(swigCPtr, this, value);
	}

	public String getEMail() {
		return CtpJNI.CThostFtdcReqOpenAccountField_EMail_get(swigCPtr, this);
	}

	public void setMoneyAccountStatus(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_MoneyAccountStatus_set(swigCPtr,
				this, value);
	}

	public char getMoneyAccountStatus() {
		return CtpJNI.CThostFtdcReqOpenAccountField_MoneyAccountStatus_get(
				swigCPtr, this);
	}

	public void setBankAccount(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BankAccount_set(swigCPtr, this,
				value);
	}

	public String getBankAccount() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BankAccount_get(swigCPtr,
				this);
	}

	public void setBankPassWord(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BankPassWord_set(swigCPtr, this,
				value);
	}

	public String getBankPassWord() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BankPassWord_get(swigCPtr,
				this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_AccountID_set(swigCPtr, this,
				value);
	}

	public String getAccountID() {
		return CtpJNI.CThostFtdcReqOpenAccountField_AccountID_get(swigCPtr,
				this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return CtpJNI
				.CThostFtdcReqOpenAccountField_Password_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcReqOpenAccountField_InstallID_set(swigCPtr, this,
				value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcReqOpenAccountField_InstallID_get(swigCPtr,
				this);
	}

	public void setVerifyCertNoFlag(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_VerifyCertNoFlag_set(swigCPtr,
				this, value);
	}

	public char getVerifyCertNoFlag() {
		return CtpJNI.CThostFtdcReqOpenAccountField_VerifyCertNoFlag_get(
				swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_CurrencyID_set(swigCPtr, this,
				value);
	}

	public String getCurrencyID() {
		return CtpJNI.CThostFtdcReqOpenAccountField_CurrencyID_get(swigCPtr,
				this);
	}

	public void setCashExchangeCode(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_CashExchangeCode_set(swigCPtr,
				this, value);
	}

	public char getCashExchangeCode() {
		return CtpJNI.CThostFtdcReqOpenAccountField_CashExchangeCode_get(
				swigCPtr, this);
	}

	public void setDigest(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return CtpJNI.CThostFtdcReqOpenAccountField_Digest_get(swigCPtr, this);
	}

	public void setBankAccType(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BankAccType_set(swigCPtr, this,
				value);
	}

	public char getBankAccType() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BankAccType_get(swigCPtr,
				this);
	}

	public void setDeviceID(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_DeviceID_set(swigCPtr, this, value);
	}

	public String getDeviceID() {
		return CtpJNI
				.CThostFtdcReqOpenAccountField_DeviceID_get(swigCPtr, this);
	}

	public void setBankSecuAccType(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BankSecuAccType_set(swigCPtr,
				this, value);
	}

	public char getBankSecuAccType() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BankSecuAccType_get(
				swigCPtr, this);
	}

	public void setBrokerIDByBank(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BrokerIDByBank_set(swigCPtr, this,
				value);
	}

	public String getBrokerIDByBank() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BrokerIDByBank_get(
				swigCPtr, this);
	}

	public void setBankSecuAcc(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BankSecuAcc_set(swigCPtr, this,
				value);
	}

	public String getBankSecuAcc() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BankSecuAcc_get(swigCPtr,
				this);
	}

	public void setBankPwdFlag(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_BankPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getBankPwdFlag() {
		return CtpJNI.CThostFtdcReqOpenAccountField_BankPwdFlag_get(swigCPtr,
				this);
	}

	public void setSecuPwdFlag(char value) {
		CtpJNI.CThostFtdcReqOpenAccountField_SecuPwdFlag_set(swigCPtr, this,
				value);
	}

	public char getSecuPwdFlag() {
		return CtpJNI.CThostFtdcReqOpenAccountField_SecuPwdFlag_get(swigCPtr,
				this);
	}

	public void setOperNo(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_OperNo_set(swigCPtr, this, value);
	}

	public String getOperNo() {
		return CtpJNI.CThostFtdcReqOpenAccountField_OperNo_get(swigCPtr, this);
	}

	public void setTID(int value) {
		CtpJNI.CThostFtdcReqOpenAccountField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return CtpJNI.CThostFtdcReqOpenAccountField_TID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcReqOpenAccountField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcReqOpenAccountField_UserID_get(swigCPtr, this);
	}

	public CThostFtdcReqOpenAccountField() {
		this(CtpJNI.new_CThostFtdcReqOpenAccountField(), true);
	}

}
