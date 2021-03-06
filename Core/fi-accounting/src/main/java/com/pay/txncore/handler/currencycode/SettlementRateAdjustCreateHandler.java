/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.txncore.handler.currencycode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pay.inf.enums.ResponseCodeEnum;
import com.pay.inf.excepiton.HessianInvokeException;
import com.pay.inf.handler.EventHandler;
import com.pay.txncore.crosspay.service.SettlementRateAdjustService;
import com.pay.txncore.model.SettlementRateAdjust;
import com.pay.util.JSonUtil;
import com.pay.util.StringUtil;

/**
 * 清算汇率微调创建
 * @author peiyu.yang
 * @since 2015年6月29日
 */
public class SettlementRateAdjustCreateHandler implements EventHandler {

	public final static String DEFAULT_DATE_FROMAT = "yyyy-MM-dd HH:mm:ss";
	public final Log logger = LogFactory
			.getLog(SettlementRateAdjustCreateHandler.class);
	private SettlementRateAdjustService settlementRateAdjustService;

	@Override
	public String handle(String dataMsg) throws HessianInvokeException {

		Map paraMap = null;
		Map resultMap = new HashMap();

		try {
			paraMap = JSonUtil.toObject(dataMsg, new HashMap().getClass());

			String operator = (String) paraMap.get("operator");
			List<Map> listMap = (List<Map>) paraMap.get("list");

			List<SettlementRateAdjust> rateAdjusts = null;
			if (null != listMap && !listMap.isEmpty()) {
				rateAdjusts = new ArrayList<SettlementRateAdjust>();
				for (Map map : listMap) {
					String currency = (String) map.get("currency");
					String targetCurrency = (String) map.get("targetCurrency");
					String reverseAdjustRate = (String) map.get("reverseAdjustRate");
					String reverseAdjustTag = (String) map.get("reverseAdjustTag");
					String effectDate = (String) map.get("effectDate");
					String expireDate = (String) map.get("expireDate");
					String adjustRate = (String) map.get("adjustRate");
					String adjustTag = (String) map.get("adjustTag");
					String memberCode = (String)map.get("memberCode");
					String cardOrg = (String) map.get("cardOrg");
					String startPoint = (String) map.get("startPoint");
					String endPoint = (String) map.get("endPoint");
					String leastTransAmountStr = (String) map.get("leastTransAmount");
					String ltaCurrencyCode = (String) map.get("ltaCurrencyCode");
					
					SettlementRateAdjust rateAdjust = new SettlementRateAdjust();

					rateAdjust.setCreateDate(new Date());
					rateAdjust.setCurrency(currency);

					SimpleDateFormat formatter = new SimpleDateFormat(
							DEFAULT_DATE_FROMAT);
					if(!StringUtil.isEmpty(effectDate)){
						rateAdjust.setEffectDate(formatter.parse(effectDate));
					}
					
					if(!StringUtil.isEmpty(expireDate)){
						rateAdjust.setExpireDate(formatter.parse(expireDate));
					}
					
					if(!StringUtil.isEmpty(leastTransAmountStr)){
						rateAdjust.setLeastTransAmount(Double.valueOf(leastTransAmountStr));
					}
					
					if(!StringUtil.isEmpty(startPoint)){
						rateAdjust.setStartPoint(Integer.valueOf(startPoint));
					}
					
					if(!StringUtil.isEmpty(endPoint)){
						rateAdjust.setEndPoint(Integer.valueOf(endPoint));
					}
					
					rateAdjust.setAdjustRate(adjustRate);
					rateAdjust.setAdjustTag(adjustTag);
					rateAdjust.setReverseAdjustRate(reverseAdjustRate);
					rateAdjust.setReverseAdjustTag(reverseAdjustTag);
					
					rateAdjust.setOperator(operator);
					rateAdjust.setStatus("1");
					
					rateAdjust.setTargetCurrency(targetCurrency);
					rateAdjust.setUpdateDate(new Date());
					rateAdjust.setCreateDate(new Date());
					rateAdjust.setMemberCode(memberCode);
					rateAdjust.setCardOrg(cardOrg);
					rateAdjust.setLtaCurrencyCode(ltaCurrencyCode);
					
					rateAdjusts.add(rateAdjust);
				}
			}

			settlementRateAdjustService.batchCreate(rateAdjusts);

			resultMap.put("responseCode", ResponseCodeEnum.SUCCESS.getCode());
			resultMap.put("responseDesc", ResponseCodeEnum.SUCCESS.getDesc());
		} catch (Exception e) {
			logger.error("query partner error:", e);
			resultMap.put("responseCode",
					ResponseCodeEnum.UNDEFINED_ERROR.getCode());
			resultMap.put("responseDesc",
					ResponseCodeEnum.UNDEFINED_ERROR.getDesc());
		}

		return JSonUtil.toJSonString(resultMap);
	}

	public void setSettlementRateAdjustService(
			SettlementRateAdjustService settlementRateAdjustService) {
		this.settlementRateAdjustService = settlementRateAdjustService;
	}
     
	
}
