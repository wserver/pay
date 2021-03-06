/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.crosspay.cardbind;

import com.pay.gateway.dto.CardBindRequest;
import com.pay.gateway.dto.CardBindResponse;
import com.pay.inf.rule.MessageRule;
import com.pay.util.IPUtil;
import com.pay.util.StringUtil;

/**
 * 验证订单号
 */
public class CustomerIPCheckRule extends MessageRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@Override
	protected boolean makeDecision(Object validateBean) throws Exception {
		CardBindRequest cardBindRequest = (CardBindRequest) validateBean;
		CardBindResponse cardBindResponse = cardBindRequest.getCardBindResponse();

		String customerIP = cardBindRequest.getCustomerIP();

		if (StringUtil.isEmpty(customerIP)||customerIP.trim().length()>128
				||!IPUtil.validateIp(customerIP)) {
			cardBindResponse.setResultCode(getMessageId());
			cardBindResponse.setResultMsg(getMessage());
			return false;
		}	
		return true;
	}

}
