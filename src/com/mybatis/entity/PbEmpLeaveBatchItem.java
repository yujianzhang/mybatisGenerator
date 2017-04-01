package com.mybatis.entity;

import java.util.Date;

public class PbEmpLeaveBatchItem {
    private String id;

    private String batchId;

    private String empName;

    private String empCode;

    private String companyCode;

    private Date applyOffPostDate;

    private Date endDate;

    private String accumFundAccount;

    private String offPostReason;

    private String offPostDesc;

    private String transferType;

    private String isValid;

    private String isDel;

    private String createUserId;

    private String createUserName;

    private Date createDate;

    private String lastUpdateUserId;

    private String lastUpdateUserName;

    private Date lastUpdateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode == null ? null : empCode.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public Date getApplyOffPostDate() {
        return applyOffPostDate;
    }

    public void setApplyOffPostDate(Date applyOffPostDate) {
        this.applyOffPostDate = applyOffPostDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getAccumFundAccount() {
        return accumFundAccount;
    }

    public void setAccumFundAccount(String accumFundAccount) {
        this.accumFundAccount = accumFundAccount == null ? null : accumFundAccount.trim();
    }

    public String getOffPostReason() {
        return offPostReason;
    }

    public void setOffPostReason(String offPostReason) {
        this.offPostReason = offPostReason == null ? null : offPostReason.trim();
    }

    public String getOffPostDesc() {
        return offPostDesc;
    }

    public void setOffPostDesc(String offPostDesc) {
        this.offPostDesc = offPostDesc == null ? null : offPostDesc.trim();
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType == null ? null : transferType.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }

    public String getLastUpdateUserName() {
        return lastUpdateUserName;
    }

    public void setLastUpdateUserName(String lastUpdateUserName) {
        this.lastUpdateUserName = lastUpdateUserName == null ? null : lastUpdateUserName.trim();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}