package com.bestchoice.vo.user;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class LeaderBillQueryVo {

    @ApiModelProperty(value = "团长ID")
    private String leaderId;

    @ApiModelProperty(value = "账单类型")
    private String billType;

    @ApiModelProperty(value = "业务编号")
    private String businessNo;

    @ApiModelProperty(value = "交易时间")
    private Date billTime;

    @ApiModelProperty(value = "账单金额")
    private String billAmount;

    @ApiModelProperty(value = "账单编号")
    private String billNo;

    @ApiModelProperty(value = "账单描述")
    private String billDesc;

    @ApiModelProperty(value = "交易前资金余额")
    private String balanceBefore;

    @ApiModelProperty(value = "交易后资金余额")
    private String balanceAfter;

    @ApiModelProperty(value = "账单状态")
    private Integer billStatus;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    public LeaderBillQueryVo() {
    }

    public String getLeaderId() {
        return this.leaderId;
    }

    public String getBillType() {
        return this.billType;
    }

    public String getBusinessNo() {
        return this.businessNo;
    }

    public Date getBillTime() {
        return this.billTime;
    }

    public String getBillAmount() {
        return this.billAmount;
    }

    public String getBillNo() {
        return this.billNo;
    }

    public String getBillDesc() {
        return this.billDesc;
    }

    public String getBalanceBefore() {
        return this.balanceBefore;
    }

    public String getBalanceAfter() {
        return this.balanceAfter;
    }

    public Integer getBillStatus() {
        return this.billStatus;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
    }

    public void setBalanceBefore(String balanceBefore) {
        this.balanceBefore = balanceBefore;
    }

    public void setBalanceAfter(String balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LeaderBillQueryVo)) return false;
        final LeaderBillQueryVo other = (LeaderBillQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$billType = this.getBillType();
        final Object other$billType = other.getBillType();
        if (this$billType == null ? other$billType != null : !this$billType.equals(other$billType)) return false;
        final Object this$businessNo = this.getBusinessNo();
        final Object other$businessNo = other.getBusinessNo();
        if (this$businessNo == null ? other$businessNo != null : !this$businessNo.equals(other$businessNo))
            return false;
        final Object this$billTime = this.getBillTime();
        final Object other$billTime = other.getBillTime();
        if (this$billTime == null ? other$billTime != null : !this$billTime.equals(other$billTime)) return false;
        final Object this$billAmount = this.getBillAmount();
        final Object other$billAmount = other.getBillAmount();
        if (this$billAmount == null ? other$billAmount != null : !this$billAmount.equals(other$billAmount))
            return false;
        final Object this$billNo = this.getBillNo();
        final Object other$billNo = other.getBillNo();
        if (this$billNo == null ? other$billNo != null : !this$billNo.equals(other$billNo)) return false;
        final Object this$billDesc = this.getBillDesc();
        final Object other$billDesc = other.getBillDesc();
        if (this$billDesc == null ? other$billDesc != null : !this$billDesc.equals(other$billDesc)) return false;
        final Object this$balanceBefore = this.getBalanceBefore();
        final Object other$balanceBefore = other.getBalanceBefore();
        if (this$balanceBefore == null ? other$balanceBefore != null : !this$balanceBefore.equals(other$balanceBefore))
            return false;
        final Object this$balanceAfter = this.getBalanceAfter();
        final Object other$balanceAfter = other.getBalanceAfter();
        if (this$balanceAfter == null ? other$balanceAfter != null : !this$balanceAfter.equals(other$balanceAfter))
            return false;
        final Object this$billStatus = this.getBillStatus();
        final Object other$billStatus = other.getBillStatus();
        if (this$billStatus == null ? other$billStatus != null : !this$billStatus.equals(other$billStatus))
            return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LeaderBillQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $billType = this.getBillType();
        result = result * PRIME + ($billType == null ? 43 : $billType.hashCode());
        final Object $businessNo = this.getBusinessNo();
        result = result * PRIME + ($businessNo == null ? 43 : $businessNo.hashCode());
        final Object $billTime = this.getBillTime();
        result = result * PRIME + ($billTime == null ? 43 : $billTime.hashCode());
        final Object $billAmount = this.getBillAmount();
        result = result * PRIME + ($billAmount == null ? 43 : $billAmount.hashCode());
        final Object $billNo = this.getBillNo();
        result = result * PRIME + ($billNo == null ? 43 : $billNo.hashCode());
        final Object $billDesc = this.getBillDesc();
        result = result * PRIME + ($billDesc == null ? 43 : $billDesc.hashCode());
        final Object $balanceBefore = this.getBalanceBefore();
        result = result * PRIME + ($balanceBefore == null ? 43 : $balanceBefore.hashCode());
        final Object $balanceAfter = this.getBalanceAfter();
        result = result * PRIME + ($balanceAfter == null ? 43 : $balanceAfter.hashCode());
        final Object $billStatus = this.getBillStatus();
        result = result * PRIME + ($billStatus == null ? 43 : $billStatus.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "LeaderBillQueryVo(leaderId=" + this.getLeaderId() + ", billType=" + this.getBillType() + ", businessNo=" + this.getBusinessNo() + ", billTime=" + this.getBillTime() + ", billAmount=" + this.getBillAmount() + ", billNo=" + this.getBillNo() + ", billDesc=" + this.getBillDesc() + ", balanceBefore=" + this.getBalanceBefore() + ", balanceAfter=" + this.getBalanceAfter() + ", billStatus=" + this.getBillStatus() + ", createTime=" + this.getCreateTime() + ")";
    }
}

