/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.token;


import com.pay.gateway.dto.CrosspayRequest;
import com.pay.gateway.dto.CrosspayResponse;
import com.pay.inf.rule.MessageRule;
import com.pay.util.StringUtil;

/**
 * 验证网关版本
 */
public class CardHolderFirstNameCheckRule extends MessageRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@Override
	protected boolean makeDecision(Object validateBean) throws Exception {

//		CrosspayRequest crosspayApiRequest = (CrosspayRequest) validateBean;
//		CrosspayResponse crosspayApiResponse = crosspayApiRequest.getCrosspayResponse();
//
//		String cardHolderFirstName = crosspayApiRequest
//				.getCardHolderFirstName();
//
//		if (!StringUtil.isEmpty(cardHolderFirstName)) {
//			return true;
//		} else {
//			crosspayApiResponse.setResultCode(getMessageId());
//			crosspayApiResponse.setResultMsg(getMessage());
//			return false;
//		}
		return true;
	}

}
