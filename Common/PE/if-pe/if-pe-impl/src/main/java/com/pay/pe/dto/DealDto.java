package com.pay.pe.dto;

import java.util.Date;

import com.pay.inf.dto.MutableDto;

public class DealDto implements MutableDto {

	private static final long serialVersionUID = -1013754775625693388L;
	private PaymentOrderDto paymentOrderDto;
	private String payerFullMemberAccCode;
	private String payeeFullMemberAccCode;
	private Long orderSeqId;
	private String payer;
	private String payerMemberAcctCode;
	private String payeeMemberAcctCode;
	private String payee;
	private Integer orderCode;
	private Long amount = 0L;
	private Long orderAmount;
	private Long dealAmount;
	private Date dealBeginDate;
	private Integer dealCode;
	private Date dealEndDate;
	private String dealId;
	private Integer dealStatus;
	private Date orderTime;
	private String orgOrderId;
	private String payeeAcctCode;
	private String payeeOrgCode;
	private String payerAcctCode;
	private String payerOrgCode;
	private Integer paymentServicePkgCode;
	private String submitAcctCode;
	private Integer payeeAcctType;
	private Integer payeeOrgType;
	private Integer payerAcctType;
	private Integer payerOrgType;
	private Integer dealType;
	private Integer payMethod;
	private Long payerFee;
	private Long payeeFee;
	private Long syncToken;
	private Integer payerServiceLevel = -1;
	private Integer payeeServiceLevel = -1;
	private String payerCurrencyCode;
	private String payeeCurrencyCode;
	private Long exchangeRate;
	private Boolean hasCaculatedPrice = Boolean.FALSE;
	private boolean hasCaculatedPayeePrice = Boolean.FALSE;
	private boolean hasCaculatedPayerPrice = Boolean.FALSE;
	private Boolean asynAccounting = null;
	private Long priceStrategyCode;
	private Long voucherCode;
	private Long payerPriceStrategy;
	private Long payeePriceStrategy;
	private Date transactionDate;
	
	/**
	 * Default constructor.
	 */
	public DealDto() {
		super();
		this.paymentOrderDto = new PaymentOrderDto();
	}

	public PaymentOrderDto getOrder() {
		return paymentOrderDto;
	}

	public void setOrder(PaymentOrderDto paymentOrderDto) {
		this.paymentOrderDto = paymentOrderDto;
	}

	public boolean isHasCaculatedPayeePrice() {
		return hasCaculatedPayeePrice;
	}

	public void setHasCaculatedPayeePrice(boolean hasCaculatedPayeePrice) {
		this.hasCaculatedPayeePrice = hasCaculatedPayeePrice;
	}

	public boolean isHasCaculatedPayerPrice() {
		return hasCaculatedPayerPrice;
	}

	public void setHasCaculatedPayerPrice(boolean hasCaculatedPayerPrice) {
		this.hasCaculatedPayerPrice = hasCaculatedPayerPrice;
	}

	public Long getPayerPriceStrategy() {
		return payerPriceStrategy;
	}

	public void setPayerPriceStrategy(Long payerPriceStrategy) {
		this.payerPriceStrategy = payerPriceStrategy;
	}

	public Long getPayeePriceStrategy() {
		return payeePriceStrategy;
	}

	public void setPayeePriceStrategy(Long payeePriceStrategy) {
		this.payeePriceStrategy = payeePriceStrategy;
	}

	public Long getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(Long voucherCode) {
		this.voucherCode = voucherCode;
	}

	public Long getPriceStrategyCode() {
		return priceStrategyCode;
	}

	public void setPriceStrategyCode(Long priceStrategyCode) {
		this.priceStrategyCode = priceStrategyCode;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactiondate) {
		this.transactionDate = transactiondate;
	}

	public String getPayerCurrencyCode() {
		return payerCurrencyCode;
	}

	public void setPayerCurrencyCode(String payerCurrencyCode) {
		this.payerCurrencyCode = payerCurrencyCode;
	}

	public String getPayeeCurrencyCode() {
		return payeeCurrencyCode;
	}

	public void setPayeeCurrencyCode(String payeeCurrencyCode) {
		this.payeeCurrencyCode = payeeCurrencyCode;
	}

	public Long getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Long exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Long getDealAmount() {
		return this.dealAmount;
	}

	public Date getDealBeginDate() {
		return this.dealBeginDate;
	}

	public Integer getDealCode() {
		return this.dealCode;
	}

	public Date getDealEndDate() {
		return this.dealEndDate;
	}

	public String getDealId() {
		return this.dealId;
	}

	public Integer getDealStatus() {
		return this.dealStatus;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public String getOrgOrderId() {
		return this.orgOrderId;
	}

	public String getPayeeAcctCode() {
		return this.payeeAcctCode;
	}

	public Integer getPayeeAcctType() {
		return this.payeeAcctType;
	}

	public String getPayeeOrgCode() {
		return this.payeeOrgCode;
	}

	public Integer getPayeeOrgType() {
		return this.payeeOrgType;
	}

	public String getPayerAcctCode() {
		return this.payerAcctCode;
	}

	public Integer getPayerAcctType() {
		return this.payerAcctType;
	}

	public String getPayerOrgCode() {
		return this.payerOrgCode;
	}

	public Integer getPayerOrgType() {
		return this.payerOrgType;
	}

	public Integer getPaymentServicePkgCode() {
		return this.paymentServicePkgCode;
	}

	public String getSubmitAcctCode() {
		return this.submitAcctCode;
	}

	public void setDealAmount(Long dealAmount) {
		this.dealAmount = dealAmount;
	}

	public void setDealBeginDate(Date dealBeginDate) {
		this.dealBeginDate = dealBeginDate;
	}

	public void setDealCode(Integer dealCode) {
		this.dealCode = dealCode;
	}

	public void setDealEndDate(Date dealEndDate) {
		this.dealEndDate = dealEndDate;
	}

	public void setDealId(String dealId) {
		this.dealId = dealId;
	}

	public void setDealStatus(Integer dealStatus) {
		this.dealStatus = dealStatus;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public void setOrgOrderId(String orgOrderId) {
		this.orgOrderId = orgOrderId;
	}

	public void setPayeeAcctCode(String payeeAcctCode) {
		this.payeeAcctCode = payeeAcctCode;
	}

	public void setPayeeAcctType(Integer payeeAcctType) {
		this.payeeAcctType = payeeAcctType;
	}

	public void setPayeeOrgCode(String payeeOrgCode) {
		this.payeeOrgCode = payeeOrgCode;
	}

	public void setPayeeOrgType(Integer payeeOrgType) {
		this.payeeOrgType = payeeOrgType;
	}

	public void setPayerAcctCode(String payerAcctCode) {
		this.payerAcctCode = payerAcctCode;
	}

	public void setPayerAcctType(Integer payerAcctType) {
		this.payerAcctType = payerAcctType;
	}

	public void setPayerOrgCode(String payerOrgCode) {
		this.payerOrgCode = payerOrgCode;
	}

	public void setPayerOrgType(Integer payerOrgType) {
		this.payerOrgType = payerOrgType;
	}

	public void setPaymentServicePkgCode(Integer paymentServicePkgCode) {
		this.paymentServicePkgCode = paymentServicePkgCode;
	}

	public void setSubmitAcctCode(String submitAcctCode) {
		this.submitAcctCode = submitAcctCode;
	}

	/**
	 * @return Returns the dealType.
	 */
	public Integer getDealType() {
		return dealType;
	}

	/**
	 * @return Returns the payeeFee.
	 */
	public Long getPayeeFee() {
		return payeeFee;
	}

	/**
	 * @param payeeFee
	 *            The payeeFee to set.
	 */
	public void setPayeeFee(Long payeeFee) {
		this.payeeFee = payeeFee;
	}

	/**
	 * @return Returns the payerFee.
	 */
	public Long getPayerFee() {
		return payerFee;
	}

	/**
	 * @param payerFee
	 *            The payerFee to set.
	 */
	public void setPayerFee(Long payerFee) {
		this.payerFee = payerFee;
	}

	/**
	 * @param dealType
	 *            The dealType to set.
	 */
	public void setDealType(Integer dealType) {
		this.dealType = dealType;
	}

	/**
	 * @return Returns the syncToken.
	 */
	public Long getSyncToken() {
		return syncToken;
	}

	/**
	 * @param syncToken
	 *            The syncToken to set.
	 */
	public void setSyncToken(Long syncToken) {
		this.syncToken = syncToken;
	}

	/**
	 * @return Returns the payeeServiceLevel.
	 */
	public Integer getPayeeServiceLevel() {
		return payeeServiceLevel;
	}

	/**
	 * @param payeeServiceLevel
	 *            The payeeServiceLevel to set.
	 */
	public void setPayeeServiceLevel(Integer payeeServiceLevel) {
		this.payeeServiceLevel = payeeServiceLevel;
	}

	/**
	 * @return Returns the payerServiceLevel.
	 */
	public Integer getPayerServiceLevel() {
		return payerServiceLevel;
	}

	/**
	 * @param payerServiceLevel
	 *            The payerServiceLevel to set.
	 */
	public void setPayerServiceLevel(Integer payerServiceLevel) {
		this.payerServiceLevel = payerServiceLevel;
	}

	public Boolean getAsynAccounting() {
		return asynAccounting;
	}

	public void setAsynAccounting(Boolean asynAccounting) {
		this.asynAccounting = asynAccounting;
	}

	public Long getOrderSeqId() {
		return orderSeqId;
	}

	public void setOrderSeqId(Long orderSeqId) {
		this.orderSeqId = orderSeqId;
	}

	public String getPayerFullMemberAccCode() {
		return payerFullMemberAccCode;
	}

	public void setPayerFullMemberAccCode(String payerFullMemberAccCode) {
		this.payerFullMemberAccCode = payerFullMemberAccCode;
	}

	public String getPayeeFullMemberAccCode() {
		return payeeFullMemberAccCode;
	}

	public void setPayeeFullMemberAccCode(String payeeFullMemberAccCode) {
		this.payeeFullMemberAccCode = payeeFullMemberAccCode;
	}

	public Boolean getHasCaculatedPrice() {
		return hasCaculatedPrice;
	}

	public void setHasCaculatedPrice(Boolean hasCaculatedPrice) {
		this.hasCaculatedPrice = hasCaculatedPrice;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPayerMemberAcctCode() {
		return payerMemberAcctCode;
	}

	public void setPayerMemberAcctCode(String payerMemberAcctCode) {
		this.payerMemberAcctCode = payerMemberAcctCode;
	}

	public String getPayeeMemberAcctCode() {
		return payeeMemberAcctCode;
	}

	public void setPayeeMemberAcctCode(String payeeMemberAcctCode) {
		this.payeeMemberAcctCode = payeeMemberAcctCode;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public Integer getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(Integer orderCode) {
		this.orderCode = orderCode;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

}