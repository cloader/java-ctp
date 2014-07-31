/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcMarketDataBaseField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected CThostFtdcMarketDataBaseField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcMarketDataBaseField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcMarketDataBaseField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcMarketDataBaseField_TradingDay_set(swigCPtr, this,
				value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcMarketDataBaseField_TradingDay_get(swigCPtr,
				this);
	}

	public void setPreSettlementPrice(double value) {
		CtpJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_set(swigCPtr,
				this, value);
	}

	public double getPreSettlementPrice() {
		return CtpJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_get(
				swigCPtr, this);
	}

	public void setPreClosePrice(double value) {
		CtpJNI.CThostFtdcMarketDataBaseField_PreClosePrice_set(swigCPtr, this,
				value);
	}

	public double getPreClosePrice() {
		return CtpJNI.CThostFtdcMarketDataBaseField_PreClosePrice_get(swigCPtr,
				this);
	}

	public void setPreOpenInterest(double value) {
		CtpJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_set(swigCPtr,
				this, value);
	}

	public double getPreOpenInterest() {
		return CtpJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_get(
				swigCPtr, this);
	}

	public void setPreDelta(double value) {
		CtpJNI.CThostFtdcMarketDataBaseField_PreDelta_set(swigCPtr, this, value);
	}

	public double getPreDelta() {
		return CtpJNI
				.CThostFtdcMarketDataBaseField_PreDelta_get(swigCPtr, this);
	}

	public CThostFtdcMarketDataBaseField() {
		this(CtpJNI.new_CThostFtdcMarketDataBaseField(), true);
	}

}