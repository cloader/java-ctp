/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcTransferBankField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcTransferBankField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTransferBankField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcTransferBankField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBankID(String value) {
		CtpJNI.CThostFtdcTransferBankField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return CtpJNI.CThostFtdcTransferBankField_BankID_get(swigCPtr, this);
	}

	public void setBankBrchID(String value) {
		CtpJNI.CThostFtdcTransferBankField_BankBrchID_set(swigCPtr, this, value);
	}

	public String getBankBrchID() {
		return CtpJNI
				.CThostFtdcTransferBankField_BankBrchID_get(swigCPtr, this);
	}

	public void setBankName(String value) {
		CtpJNI.CThostFtdcTransferBankField_BankName_set(swigCPtr, this, value);
	}

	public String getBankName() {
		return CtpJNI.CThostFtdcTransferBankField_BankName_get(swigCPtr, this);
	}

	public void setIsActive(int value) {
		CtpJNI.CThostFtdcTransferBankField_IsActive_set(swigCPtr, this, value);
	}

	public int getIsActive() {
		return CtpJNI.CThostFtdcTransferBankField_IsActive_get(swigCPtr, this);
	}

	public CThostFtdcTransferBankField() {
		this(CtpJNI.new_CThostFtdcTransferBankField(), true);
	}

}
