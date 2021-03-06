/**
 *Copyright © 2004-2013 pay.com . All rights reserved. 版权所有
 */
package com.pay.acc.cert.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员证书表
 * 
 * @author fjl
 * @date 2011-11-15
 */
public class MemberCert implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;// 会员证书ID
	private Long memberCode;// 会员号
	private Long operatorId;// 操作员ID
	private String userDn;// 用户DN
	private String refNo;// 证书参考号
	private String authCode;// 证书授权码
	private Integer status;// 0 为注销 1为有效
	private Date createDate;// 开通时间
	private Date updateDate;// 更新时间
	private String certCode;//证书编码
	
	public static enum StatusEnum{
		APPLY(0,"申请"),
		MAKECERT(1,"制证"),
		VALID(2,"有效"),
		DISABLE(3,"注销");		
		
		private int value;
		private String des;
		private StatusEnum(int value,String des){
			this.value = value;
			this.des = des;
		}
		
		public int getValue() {
			return value;
		}
		
		public String getDes() {
			return des;
		}
		
		public static StatusEnum get(int value){
			for(StatusEnum item : values()){
				if(value == item.getValue()){
					return item;
				}
			}
			return null;
		}
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the memberCode
	 */
	public Long getMemberCode() {
		return memberCode;
	}

	/**
	 * @param memberCode
	 *            the memberCode to set
	 */
	public void setMemberCode(Long memberCode) {
		this.memberCode = memberCode;
	}

	/**
	 * @return the operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}

	/**
	 * @param operatorId
	 *            the operatorId to set
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * @return the userDn
	 */
	public String getUserDn() {
		return userDn;
	}

	/**
	 * @param userDn
	 *            the userDn to set
	 */
	public void setUserDn(String userDn) {
		this.userDn = userDn;
	}

	/**
	 * @return the refNo
	 */
	public String getRefNo() {
		return refNo;
	}

	/**
	 * @param refNo
	 *            the refNo to set
	 */
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	/**
	 * @return the authCode
	 */
	public String getAuthCode() {
		return authCode;
	}

	/**
	 * @param authCode
	 *            the authCode to set
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCertCode() {
		return certCode;
	}

	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}
	
	public String getCN(){
		if(userDn != null){
			String[] tmp = userDn.split("[,]");
			if(tmp.length >0){
				return tmp[0];
			}
		}
		return userDn;
	}

	@Override
	public String toString() {
		return "MemberCert [id=" + id + ", memberCode=" + memberCode
				+ ", operatorId=" + operatorId + ", userDn=" + userDn
				+ ", refNo=" + refNo + ", authCode=" + authCode + ", status="
				+ status + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ",certCode=" + certCode + "]";
	}

}
