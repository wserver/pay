/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.rule;

import com.pay.fi.commons.TradeTypeEnum;
import com.pay.gateway.dto.CrosspayRequest;
import com.pay.gateway.dto.CrosspayResponse;
import com.pay.inf.rule.MessageRule;
import com.pay.util.StringUtil;

/**
 * 验证网关版本
 */
public class LanguageCheckRule extends MessageRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@Override
	protected boolean makeDecision(Object validateBean) throws Exception {

		CrosspayRequest crosspayApiRequest = (CrosspayRequest) validateBean;
		CrosspayResponse crosspayApiResponse = crosspayApiRequest.getCrosspayResponse();

		String language = crosspayApiRequest.getLanguage();
		String tradeType = crosspayApiRequest.getTradeType();
		if(TradeTypeEnum.REALTIME_CASH.getCode().equals(tradeType)) {
			if(!StringUtil.isEmpty(language) && !isValidLanguage(language.trim())) {
				crosspayApiResponse.setResultCode(getMessageId());
				crosspayApiResponse.setResultMsg(getMessage());
				crosspayApiRequest.setLanguage("en");
				return false;
			}
		}
		
		return true;
	}
	
	private boolean isValidLanguage(String language) {
		if("cn".equals(language) || "en".equals(language)) {
			return true;
		}
		
		return false;
	}
}
