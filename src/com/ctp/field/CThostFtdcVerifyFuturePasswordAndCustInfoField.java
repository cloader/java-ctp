/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcVerifyFuturePasswordAndCustInfoField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcVerifyFuturePasswordAndCustInfoField(long cPtr,
			boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(
			CThostFtdcVerifyFuturePasswordAndCustInfoField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcVerifyFuturePasswordAndCustInfoField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setCustomerName(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustomerName_set(
				swigCPtr, this, value);
	}

	public String getCustomerName() {
		return CtpJNI
				.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustomerName_get(
						swigCPtr, this);
	}

	public void setIdCardType(char value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdCardType_set(
				swigCPtr, this, value);
	}

	public char getIdCardType() {
		return CtpJNI
				.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdCardType_get(
						swigCPtr, this);
	}

	public void setIdentifiedCardNo(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdentifiedCardNo_set(
				swigCPtr, this, value);
	}

	public String getIdentifiedCardNo() {
		return CtpJNI
				.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdentifiedCardNo_get(
						swigCPtr, this);
	}

	public void setCustType(char value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustType_set(
				swigCPtr, this, value);
	}

	public char getCustType() {
		return CtpJNI
				.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustType_get(
						swigCPtr, this);
	}

	public void setAccountID(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_AccountID_set(
				swigCPtr, this, value);
	}

	public String getAccountID() {
		return CtpJNI
				.CThostFtdcVerifyFuturePasswordAndCustInfoField_AccountID_get(
						swigCPtr, this);
	}

	public void setPassword(String value) {
		CtpJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_Password_set(
				swigCPtr, this, value);
	}

	public String getPassword() {
		return CtpJNI
				.CThostFtdcVerifyFuturePasswordAndCustInfoField_Password_get(
						swigCPtr, this);
	}

	public CThostFtdcVerifyFuturePasswordAndCustInfoField() {
		this(CtpJNI.new_CThostFtdcVerifyFuturePasswordAndCustInfoField(), true);
	}

}
