/**
 *
 * auto generated by ibatis tools 
 *
 **/
package com.pay.poss.report.dto;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * T_MEMBER_FLOW_PACKAGE_CFG
 */

@SuppressWarnings("unused")
public class MemberFlowPackageCfgDTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String shutDownLinkmanMobile;
	private java.util.Date createTime;
	private Long prePayAmount;
	private String prePayAmountStr;
	private Long warnFlow;
	private String warnFlowStr;
	private String remark;
	private Integer status;
	private String statusStr;
	private java.util.Date prePayDate;
	private String prePayDateStr;
	private String warnLinkman;
	private Long shutDownFlow;
	private String shutDownFlowStr;
	private java.util.Date beginDate;
	private String beginDateStr;
	private Long prePayFlow;
	private String prePayFlowStr;
	private String warnLinkmanMobile;
	private String shutDownLinkman;
	private String creator;
	private java.util.Date lastOperateTime;
	private Long averageRate;
	private String shutDownLinkmanEmail;
	private String memberName;
	private Long sequenceId;
	private String warnLinkmanEmail;
	private Long memberCode;
	private String lastOperator;

	public String getShutDownLinkmanMobile() {
		return shutDownLinkmanMobile;
	}

	public void setShutDownLinkmanMobile(String shutDownLinkmanMobile) {
		this.shutDownLinkmanMobile = shutDownLinkmanMobile;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public Long getPrePayAmount() {
		return prePayAmount;
	}

	public void setPrePayAmount(Long prePayAmount) {
		this.prePayAmount = prePayAmount;
	}

	public Long getWarnFlow() {
		return warnFlow;
	}

	public void setWarnFlow(Long warnFlow) {
		this.warnFlow = warnFlow;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	// 状态 0-未启用、1-正常、2-已停用、9-作废
	public String getStatusStr() {
		if (status == 0) {
			statusStr = "未启用";
		} else if (status == 1) {
			statusStr = "正常";
		} else if (status == 2) {
			statusStr = "已停用";
		} else if (status == 9) {
			statusStr = "作废";
		} else {
			statusStr = "";
		}
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

	public java.util.Date getPrePayDate() {
		return prePayDate;
	}

	public void setPrePayDate(java.util.Date prePayDate) {
		this.prePayDate = prePayDate;
	}

	public String getWarnLinkman() {
		return warnLinkman;
	}

	public void setWarnLinkman(String warnLinkman) {
		this.warnLinkman = warnLinkman;
	}

	public Long getShutDownFlow() {
		return shutDownFlow;
	}

	public void setShutDownFlow(Long shutDownFlow) {
		this.shutDownFlow = shutDownFlow;
	}

	public java.util.Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(java.util.Date beginDate) {
		this.beginDate = beginDate;
	}

	public Long getPrePayFlow() {
		return prePayFlow;
	}

	public void setPrePayFlow(Long prePayFlow) {
		this.prePayFlow = prePayFlow;
	}

	public String getWarnLinkmanMobile() {
		return warnLinkmanMobile;
	}

	public void setWarnLinkmanMobile(String warnLinkmanMobile) {
		this.warnLinkmanMobile = warnLinkmanMobile;
	}

	public String getShutDownLinkman() {
		return shutDownLinkman;
	}

	public void setShutDownLinkman(String shutDownLinkman) {
		this.shutDownLinkman = shutDownLinkman;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public java.util.Date getLastOperateTime() {
		return lastOperateTime;
	}

	public void setLastOperateTime(java.util.Date lastOperateTime) {
		this.lastOperateTime = lastOperateTime;
	}

	public Long getAverageRate() {
		return averageRate;
	}

	public void setAverageRate(Long averageRate) {
		this.averageRate = averageRate;
	}

	public String getShutDownLinkmanEmail() {
		return shutDownLinkmanEmail;
	}

	public void setShutDownLinkmanEmail(String shutDownLinkmanEmail) {
		this.shutDownLinkmanEmail = shutDownLinkmanEmail;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Long getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Long sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getWarnLinkmanEmail() {
		return warnLinkmanEmail;
	}

	public void setWarnLinkmanEmail(String warnLinkmanEmail) {
		this.warnLinkmanEmail = warnLinkmanEmail;
	}

	public Long getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(Long memberCode) {
		this.memberCode = memberCode;
	}

	public String getLastOperator() {
		return lastOperator;
	}

	public void setLastOperator(String lastOperator) {
		this.lastOperator = lastOperator;
	}

	public String getPrePayDateStr() {
		return prePayDateStr;
	}

	public void setPrePayDateStr(String prePayDateStr) {
		this.prePayDateStr = prePayDateStr;
	}

	public String getBeginDateStr() {
		return beginDateStr;
	}

	public void setBeginDateStr(String beginDateStr) {
		this.beginDateStr = beginDateStr;
	}

	public String getPrePayAmountStr() {
		return numberFormatDecimal(prePayAmount);
	}

	public void setPrePayAmountStr(String prePayAmountStr) {
		this.prePayAmountStr = prePayAmountStr;
	}

	public String getWarnFlowStr() {
		return numberFormatDecimal(warnFlow);
	}

	public void setWarnFlowStr(String warnFlowStr) {
		this.warnFlowStr = warnFlowStr;
	}

	public String getShutDownFlowStr() {
		return numberFormatDecimal(shutDownFlow);
	}

	public void setShutDownFlowStr(String shutDownFlowStr) {
		this.shutDownFlowStr = shutDownFlowStr;
	}

	public String getPrePayFlowStr() {
		return numberFormatDecimal(prePayFlow);
	}

	public void setPrePayFlowStr(String prePayFlowStr) {
		this.prePayFlowStr = prePayFlowStr;
	}

	/**
	 * 格式化显示Long型金额不带逗号,带两位小数
	 * 
	 * @param amount
	 * @return
	 */
	public static String numberFormatDecimal(Long amount) {
		NumberFormat formatter = new DecimalFormat("##0.00");
		if (amount == null) {
			return "";
		}
		BigDecimal tmp = toBigDecimalAmount(amount);
		return formatter.format(tmp.doubleValue());
	}

	/**
	 * 金额转BigDecimal
	 * 
	 * @param amount
	 * @return
	 */
	public static BigDecimal toBigDecimalAmount(Long amount) {
		Long tmpAmount = amount;
		if (tmpAmount == null) {
			tmpAmount = 0L;
		}
		return new BigDecimal(tmpAmount).divide(new BigDecimal(1000), 2,
				BigDecimal.ROUND_HALF_UP);

	}

}