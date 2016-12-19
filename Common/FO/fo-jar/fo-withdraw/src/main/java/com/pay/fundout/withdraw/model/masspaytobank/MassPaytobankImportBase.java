/**
*
* auto generated by ibatis tools 
*
**/
package com.pay.fundout.withdraw.model.masspaytobank;
/**
 * 
 * @author Sean_yi
 * @createtime 2010-12-20
 * @filename MassPaytobankImportBase.java
 * @version 1.0
 */
public class MassPaytobankImportBase  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long uploadSeq;
    private Integer totalNum;
    private Integer validNum;
    private Integer payerAcctType;
    private String businessNo;
    private Long totalAmount;
    private Long validAmount;
    private String operatorid;
    private java.util.Date uploadDate;
    private String uploadFileName;
    private Long payerMomberCode;
    private Long realPayAmount;
    private Long realOutAmount;
    private Long totalFee;
    private Integer isPayerPayFee;
    private Integer status;
    private Integer oldStatus;
    private java.util.Date updateDate; 
    private String auditOperator;
    private String auditRemark;

    public Long getUploadSeq (){
        return uploadSeq;
    }
    
    public void setUploadSeq (Long uploadSeq){
        this.uploadSeq = uploadSeq;
    }
    public Integer getTotalNum (){
        return totalNum;
    }
    
    public void setTotalNum (Integer totalNum){
        this.totalNum = totalNum;
    }
    public Integer getValidNum (){
        return validNum;
    }
    
    public void setValidNum (Integer validNum){
        this.validNum = validNum;
    }
    public Integer getPayerAcctType (){
        return payerAcctType;
    }
    
    public void setPayerAcctType (Integer payerAcctType){
        this.payerAcctType = payerAcctType;
    }
    public String getBusinessNo (){
        return businessNo;
    }
    
    public void setBusinessNo (String businessNo){
        this.businessNo = businessNo;
    }
    public Long getTotalAmount (){
        return totalAmount;
    }
    
    public void setTotalAmount (Long totalAmount){
        this.totalAmount = totalAmount;
    }
    public Long getValidAmount (){
        return validAmount;
    }
    
    public void setValidAmount (Long validAmount){
        this.validAmount = validAmount;
    }
    public String getOperatorid (){
        return operatorid;
    }
    
    public void setOperatorid (String operatorid){
        this.operatorid = operatorid;
    }
    public java.util.Date getUploadDate (){
        return uploadDate;
    }
    
    public void setUploadDate (java.util.Date uploadDate){
        this.uploadDate = uploadDate;
    }
    public String getUploadFileName (){
        return uploadFileName;
    }
    
    public void setUploadFileName (String uploadFileName){
        this.uploadFileName = uploadFileName;
    }
    public Long getPayerMomberCode (){
        return payerMomberCode;
    }
    
    public void setPayerMomberCode (Long payerMomberCode){
        this.payerMomberCode = payerMomberCode;
    }

	public Long getRealPayAmount() {
		return realPayAmount;
	}

	public void setRealPayAmount(Long realPayAmount) {
		this.realPayAmount = realPayAmount;
	}

	public Long getRealOutAmount() {
		return realOutAmount;
	}

	public void setRealOutAmount(Long realOutAmount) {
		this.realOutAmount = realOutAmount;
	}

	public Long getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Long totalFee) {
		this.totalFee = totalFee;
	}

	public Integer getIsPayerPayFee() {
		return isPayerPayFee;
	}

	public void setIsPayerPayFee(Integer isPayerPayFee) {
		this.isPayerPayFee = isPayerPayFee;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.util.Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getAuditOperator() {
		return auditOperator;
	}

	public void setAuditOperator(String auditOperator) {
		this.auditOperator = auditOperator;
	}

	public String getAuditRemark() {
		return auditRemark;
	}

	public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}

	public Integer getOldStatus() {
		return oldStatus;
	}

	public void setOldStatus(Integer oldStatus) {
		this.oldStatus = oldStatus;
	}
	

}