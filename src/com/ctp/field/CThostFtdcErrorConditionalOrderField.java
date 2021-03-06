/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp.field;

import com.ctp.CtpJNI;

public class CThostFtdcErrorConditionalOrderField {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	public CThostFtdcErrorConditionalOrderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcErrorConditionalOrderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CtpJNI.delete_CThostFtdcErrorConditionalOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_BrokerID_set(swigCPtr,
				this, value);
	}

	public String getBrokerID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_BrokerID_get(
				swigCPtr, this);
	}

	public void setInvestorID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_InvestorID_set(swigCPtr,
				this, value);
	}

	public String getInvestorID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_InvestorID_get(
				swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_InstrumentID_set(swigCPtr,
				this, value);
	}

	public String getInstrumentID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_InstrumentID_get(
				swigCPtr, this);
	}

	public void setOrderRef(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_OrderRef_set(swigCPtr,
				this, value);
	}

	public String getOrderRef() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_OrderRef_get(
				swigCPtr, this);
	}

	public void setUserID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_UserID_set(swigCPtr, this,
				value);
	}

	public String getUserID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_UserID_get(swigCPtr,
				this);
	}

	public void setOrderPriceType(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_OrderPriceType_set(
				swigCPtr, this, value);
	}

	public char getOrderPriceType() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_OrderPriceType_get(
				swigCPtr, this);
	}

	public void setDirection(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_Direction_set(swigCPtr,
				this, value);
	}

	public char getDirection() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_Direction_get(
				swigCPtr, this);
	}

	public void setCombOffsetFlag(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_CombOffsetFlag_set(
				swigCPtr, this, value);
	}

	public String getCombOffsetFlag() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_CombOffsetFlag_get(
				swigCPtr, this);
	}

	public void setCombHedgeFlag(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_CombHedgeFlag_set(swigCPtr,
				this, value);
	}

	public String getCombHedgeFlag() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_CombHedgeFlag_get(
				swigCPtr, this);
	}

	public void setLimitPrice(double value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_LimitPrice_set(swigCPtr,
				this, value);
	}

	public double getLimitPrice() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_LimitPrice_get(
				swigCPtr, this);
	}

	public void setVolumeTotalOriginal(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_VolumeTotalOriginal_set(
				swigCPtr, this, value);
	}

	public int getVolumeTotalOriginal() {
		return CtpJNI
				.CThostFtdcErrorConditionalOrderField_VolumeTotalOriginal_get(
						swigCPtr, this);
	}

	public void setTimeCondition(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_TimeCondition_set(swigCPtr,
				this, value);
	}

	public char getTimeCondition() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_TimeCondition_get(
				swigCPtr, this);
	}

	public void setGTDDate(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_GTDDate_set(swigCPtr, this,
				value);
	}

	public String getGTDDate() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_GTDDate_get(
				swigCPtr, this);
	}

	public void setVolumeCondition(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_VolumeCondition_set(
				swigCPtr, this, value);
	}

	public char getVolumeCondition() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_VolumeCondition_get(
				swigCPtr, this);
	}

	public void setMinVolume(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_MinVolume_set(swigCPtr,
				this, value);
	}

	public int getMinVolume() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_MinVolume_get(
				swigCPtr, this);
	}

	public void setContingentCondition(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ContingentCondition_set(
				swigCPtr, this, value);
	}

	public char getContingentCondition() {
		return CtpJNI
				.CThostFtdcErrorConditionalOrderField_ContingentCondition_get(
						swigCPtr, this);
	}

	public void setStopPrice(double value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_StopPrice_set(swigCPtr,
				this, value);
	}

	public double getStopPrice() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_StopPrice_get(
				swigCPtr, this);
	}

	public void setForceCloseReason(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ForceCloseReason_set(
				swigCPtr, this, value);
	}

	public char getForceCloseReason() {
		return CtpJNI
				.CThostFtdcErrorConditionalOrderField_ForceCloseReason_get(
						swigCPtr, this);
	}

	public void setIsAutoSuspend(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_IsAutoSuspend_set(swigCPtr,
				this, value);
	}

	public int getIsAutoSuspend() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_IsAutoSuspend_get(
				swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_BusinessUnit_set(swigCPtr,
				this, value);
	}

	public String getBusinessUnit() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_BusinessUnit_get(
				swigCPtr, this);
	}

	public void setRequestID(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_RequestID_set(swigCPtr,
				this, value);
	}

	public int getRequestID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_RequestID_get(
				swigCPtr, this);
	}

	public void setOrderLocalID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_OrderLocalID_set(swigCPtr,
				this, value);
	}

	public String getOrderLocalID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_OrderLocalID_get(
				swigCPtr, this);
	}

	public void setExchangeID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ExchangeID_set(swigCPtr,
				this, value);
	}

	public String getExchangeID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ExchangeID_get(
				swigCPtr, this);
	}

	public void setParticipantID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ParticipantID_set(swigCPtr,
				this, value);
	}

	public String getParticipantID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ParticipantID_get(
				swigCPtr, this);
	}

	public void setClientID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ClientID_set(swigCPtr,
				this, value);
	}

	public String getClientID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ClientID_get(
				swigCPtr, this);
	}

	public void setExchangeInstID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ExchangeInstID_set(
				swigCPtr, this, value);
	}

	public String getExchangeInstID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ExchangeInstID_get(
				swigCPtr, this);
	}

	public void setTraderID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_TraderID_set(swigCPtr,
				this, value);
	}

	public String getTraderID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_TraderID_get(
				swigCPtr, this);
	}

	public void setInstallID(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_InstallID_set(swigCPtr,
				this, value);
	}

	public int getInstallID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_InstallID_get(
				swigCPtr, this);
	}

	public void setOrderSubmitStatus(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_OrderSubmitStatus_set(
				swigCPtr, this, value);
	}

	public char getOrderSubmitStatus() {
		return CtpJNI
				.CThostFtdcErrorConditionalOrderField_OrderSubmitStatus_get(
						swigCPtr, this);
	}

	public void setNotifySequence(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_NotifySequence_set(
				swigCPtr, this, value);
	}

	public int getNotifySequence() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_NotifySequence_get(
				swigCPtr, this);
	}

	public void setTradingDay(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_TradingDay_set(swigCPtr,
				this, value);
	}

	public String getTradingDay() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_TradingDay_get(
				swigCPtr, this);
	}

	public void setSettlementID(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_SettlementID_set(swigCPtr,
				this, value);
	}

	public int getSettlementID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_SettlementID_get(
				swigCPtr, this);
	}

	public void setOrderSysID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_OrderSysID_set(swigCPtr,
				this, value);
	}

	public String getOrderSysID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_OrderSysID_get(
				swigCPtr, this);
	}

	public void setOrderSource(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_OrderSource_set(swigCPtr,
				this, value);
	}

	public char getOrderSource() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_OrderSource_get(
				swigCPtr, this);
	}

	public void setOrderStatus(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_OrderStatus_set(swigCPtr,
				this, value);
	}

	public char getOrderStatus() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_OrderStatus_get(
				swigCPtr, this);
	}

	public void setOrderType(char value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_OrderType_set(swigCPtr,
				this, value);
	}

	public char getOrderType() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_OrderType_get(
				swigCPtr, this);
	}

	public void setVolumeTraded(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_VolumeTraded_set(swigCPtr,
				this, value);
	}

	public int getVolumeTraded() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_VolumeTraded_get(
				swigCPtr, this);
	}

	public void setVolumeTotal(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_VolumeTotal_set(swigCPtr,
				this, value);
	}

	public int getVolumeTotal() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_VolumeTotal_get(
				swigCPtr, this);
	}

	public void setInsertDate(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_InsertDate_set(swigCPtr,
				this, value);
	}

	public String getInsertDate() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_InsertDate_get(
				swigCPtr, this);
	}

	public void setInsertTime(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_InsertTime_set(swigCPtr,
				this, value);
	}

	public String getInsertTime() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_InsertTime_get(
				swigCPtr, this);
	}

	public void setActiveTime(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ActiveTime_set(swigCPtr,
				this, value);
	}

	public String getActiveTime() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ActiveTime_get(
				swigCPtr, this);
	}

	public void setSuspendTime(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_SuspendTime_set(swigCPtr,
				this, value);
	}

	public String getSuspendTime() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_SuspendTime_get(
				swigCPtr, this);
	}

	public void setUpdateTime(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_UpdateTime_set(swigCPtr,
				this, value);
	}

	public String getUpdateTime() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_UpdateTime_get(
				swigCPtr, this);
	}

	public void setCancelTime(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_CancelTime_set(swigCPtr,
				this, value);
	}

	public String getCancelTime() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_CancelTime_get(
				swigCPtr, this);
	}

	public void setActiveTraderID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ActiveTraderID_set(
				swigCPtr, this, value);
	}

	public String getActiveTraderID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ActiveTraderID_get(
				swigCPtr, this);
	}

	public void setClearingPartID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ClearingPartID_set(
				swigCPtr, this, value);
	}

	public String getClearingPartID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ClearingPartID_get(
				swigCPtr, this);
	}

	public void setSequenceNo(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_SequenceNo_set(swigCPtr,
				this, value);
	}

	public int getSequenceNo() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_SequenceNo_get(
				swigCPtr, this);
	}

	public void setFrontID(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_FrontID_set(swigCPtr, this,
				value);
	}

	public int getFrontID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_FrontID_get(
				swigCPtr, this);
	}

	public void setSessionID(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_SessionID_set(swigCPtr,
				this, value);
	}

	public int getSessionID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_SessionID_get(
				swigCPtr, this);
	}

	public void setUserProductInfo(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_UserProductInfo_set(
				swigCPtr, this, value);
	}

	public String getUserProductInfo() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_UserProductInfo_get(
				swigCPtr, this);
	}

	public void setStatusMsg(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_StatusMsg_set(swigCPtr,
				this, value);
	}

	public String getStatusMsg() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_StatusMsg_get(
				swigCPtr, this);
	}

	public void setUserForceClose(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_UserForceClose_set(
				swigCPtr, this, value);
	}

	public int getUserForceClose() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_UserForceClose_get(
				swigCPtr, this);
	}

	public void setActiveUserID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ActiveUserID_set(swigCPtr,
				this, value);
	}

	public String getActiveUserID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ActiveUserID_get(
				swigCPtr, this);
	}

	public void setBrokerOrderSeq(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_BrokerOrderSeq_set(
				swigCPtr, this, value);
	}

	public int getBrokerOrderSeq() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_BrokerOrderSeq_get(
				swigCPtr, this);
	}

	public void setRelativeOrderSysID(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_RelativeOrderSysID_set(
				swigCPtr, this, value);
	}

	public String getRelativeOrderSysID() {
		return CtpJNI
				.CThostFtdcErrorConditionalOrderField_RelativeOrderSysID_get(
						swigCPtr, this);
	}

	public void setZCETotalTradedVolume(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ZCETotalTradedVolume_set(
				swigCPtr, this, value);
	}

	public int getZCETotalTradedVolume() {
		return CtpJNI
				.CThostFtdcErrorConditionalOrderField_ZCETotalTradedVolume_get(
						swigCPtr, this);
	}

	public void setErrorID(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ErrorID_set(swigCPtr, this,
				value);
	}

	public int getErrorID() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ErrorID_get(
				swigCPtr, this);
	}

	public void setErrorMsg(String value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_ErrorMsg_set(swigCPtr,
				this, value);
	}

	public String getErrorMsg() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_ErrorMsg_get(
				swigCPtr, this);
	}

	public void setIsSwapOrder(int value) {
		CtpJNI.CThostFtdcErrorConditionalOrderField_IsSwapOrder_set(swigCPtr,
				this, value);
	}

	public int getIsSwapOrder() {
		return CtpJNI.CThostFtdcErrorConditionalOrderField_IsSwapOrder_get(
				swigCPtr, this);
	}

	public CThostFtdcErrorConditionalOrderField() {
		this(CtpJNI.new_CThostFtdcErrorConditionalOrderField(), true);
	}

}
