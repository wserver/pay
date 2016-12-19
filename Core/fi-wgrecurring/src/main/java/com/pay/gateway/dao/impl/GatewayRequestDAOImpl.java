/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.gateway.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.pay.gateway.dao.GatewayRequestDAO;
import com.pay.gateway.model.GatewayRequest;
import com.pay.inf.dao.impl.BaseDAOImpl;

public class GatewayRequestDAOImpl extends BaseDAOImpl<GatewayRequest>
		implements GatewayRequestDAO {

	@Override
	public GatewayRequest queryGatewayRequest(Long memberCode, String orderId) {
		Map queryParams = new HashMap();
		queryParams.put("orderId", orderId);
		queryParams.put("memberCode", memberCode);
		return (GatewayRequest) super.findObjectByCriteria(
				"queryByMemberCodeAndOrderId", queryParams);
	}
}