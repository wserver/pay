/**
 *  File: 
 *  Description:
 *  Copyright 2006-2011 pay Corporation. All rights reserved.
 *  Date      Author      Changes
 *  2011-9-12   terry     Create
 *
 */
package com.pay.gateway.validate.localpay.china;

import com.pay.gateway.dto.ChinaLocalPayRequest;
import com.pay.gateway.dto.ChinaLocalPayResponse;
import com.pay.inf.rule.MessageRule;
import com.pay.util.StringUtil;

/**
 * 验证网关版本
 */
public class DisplayNameCheckRule extends MessageRule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
	 */
	@Override
	protected boolean makeDecision(Object validateBean) throws Exception {
		ChinaLocalPayRequest crosspayApiRequest = (ChinaLocalPayRequest) validateBean;
		ChinaLocalPayResponse crosspayApiResponse = crosspayApiRequest.getChinaLocalPayResponse();

		String displayName = crosspayApiRequest.getDisplayName();
	
		if (StringUtil.isEmpty(displayName)) {
			return true;
		} else {
			if(displayName.trim().length()>128) {
				crosspayApiResponse.setResultCode(getMessageId());
				crosspayApiResponse.setResultMsg(getMessage());
				return false;
			}
			return true;
		}
	}

}