package com.bestchoice.enums.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bestchoice.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "LeaderWithdraw")
@TableName("leader_withdraw")
public class LeaderWithdraw extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "团长ID")
    @TableField("leader_id")
    private String leaderId;

    @ApiModelProperty(value = "提现金额")
    @TableField("merchant_amount")
    private String merchantAmount;

    @ApiModelProperty(value = "提现状态")
    @TableField("merchant_status")
    private String merchantStatus;

    @ApiModelProperty(value = "提现失败原因")
    @TableField("fail_reason")
    private String failReason;

    @ApiModelProperty(value = "提现支付方式")
    @TableField("payment_method")
    private String paymentMethod;

    @ApiModelProperty(value = "银行名称")
    @TableField("bank_name")
    private String bankName;

    @ApiModelProperty(value = "银行账号")
    @TableField("bank_account_no")
    private String bankAccountNo;

    @ApiModelProperty(value = "银行账户名")
    @TableField("bank_account_name")
    private String bankAccountName;

    @ApiModelProperty(value = "微信ID")
    @TableField("wechat_id")
    private String wechatId;

    @ApiModelProperty(value = "提现时间")
    @TableField("withdraw_time")
    private Date withdrawTime;

    @ApiModelProperty(value = "审核时间")
    @TableField("verify_time")
    private Date verifyTime;

    @ApiModelProperty(value = "打款时间")
    @TableField("transfer_time")
    private Date transferTime;

    @ApiModelProperty(value = "提现交易编号")
    @TableField("withdraw_no")
    private String withdrawNo;

    @ApiModelProperty(value = "审核拒绝理由")
    @TableField("reject_reason")
    private String rejectReason;

    @ApiModelProperty(value = "提现成功时间")
    @TableField("complete_time")
    private Date completeTime;

    @ApiModelProperty(value = "提现金额")
    @TableField("payment_amount")
    private String paymentAmount;

    @ApiModelProperty(value = "手续费")
    @TableField("tax_amount")
    private String taxAmount;

    @ApiModelProperty(value = "备注")
    @TableField("memo")
    private String memo;

    public LeaderWithdraw() {
    }

    public String getLeaderId() {
        return this.leaderId;
    }

    public String getMerchantAmount() {
        return this.merchantAmount;
    }

    public String getMerchantStatus() {
        return this.merchantStatus;
    }

    public String getFailReason() {
        return this.failReason;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getBankAccountNo() {
        return this.bankAccountNo;
    }

    public String getBankAccountName() {
        return this.bankAccountName;
    }

    public String getWechatId() {
        return this.wechatId;
    }

    public Date getWithdrawTime() {
        return this.withdrawTime;
    }

    public Date getVerifyTime() {
        return this.verifyTime;
    }

    public Date getTransferTime() {
        return this.transferTime;
    }

    public String getWithdrawNo() {
        return this.withdrawNo;
    }

    public String getRejectReason() {
        return this.rejectReason;
    }

    public Date getCompleteTime() {
        return this.completeTime;
    }

    public String getPaymentAmount() {
        return this.paymentAmount;
    }

    public String getTaxAmount() {
        return this.taxAmount;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public void setMerchantAmount(String merchantAmount) {
        this.merchantAmount = merchantAmount;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public void setWithdrawTime(Date withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    public void setWithdrawNo(String withdrawNo) {
        this.withdrawNo = withdrawNo;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LeaderWithdraw)) return false;
        final LeaderWithdraw other = (LeaderWithdraw) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$merchantAmount = this.getMerchantAmount();
        final Object other$merchantAmount = other.getMerchantAmount();
        if (this$merchantAmount == null ? other$merchantAmount != null : !this$merchantAmount.equals(other$merchantAmount))
            return false;
        final Object this$merchantStatus = this.getMerchantStatus();
        final Object other$merchantStatus = other.getMerchantStatus();
        if (this$merchantStatus == null ? other$merchantStatus != null : !this$merchantStatus.equals(other$merchantStatus))
            return false;
        final Object this$failReason = this.getFailReason();
        final Object other$failReason = other.getFailReason();
        if (this$failReason == null ? other$failReason != null : !this$failReason.equals(other$failReason))
            return false;
        final Object this$paymentMethod = this.getPaymentMethod();
        final Object other$paymentMethod = other.getPaymentMethod();
        if (this$paymentMethod == null ? other$paymentMethod != null : !this$paymentMethod.equals(other$paymentMethod))
            return false;
        final Object this$bankName = this.getBankName();
        final Object other$bankName = other.getBankName();
        if (this$bankName == null ? other$bankName != null : !this$bankName.equals(other$bankName)) return false;
        final Object this$bankAccountNo = this.getBankAccountNo();
        final Object other$bankAccountNo = other.getBankAccountNo();
        if (this$bankAccountNo == null ? other$bankAccountNo != null : !this$bankAccountNo.equals(other$bankAccountNo))
            return false;
        final Object this$bankAccountName = this.getBankAccountName();
        final Object other$bankAccountName = other.getBankAccountName();
        if (this$bankAccountName == null ? other$bankAccountName != null : !this$bankAccountName.equals(other$bankAccountName))
            return false;
        final Object this$wechatId = this.getWechatId();
        final Object other$wechatId = other.getWechatId();
        if (this$wechatId == null ? other$wechatId != null : !this$wechatId.equals(other$wechatId)) return false;
        final Object this$withdrawTime = this.getWithdrawTime();
        final Object other$withdrawTime = other.getWithdrawTime();
        if (this$withdrawTime == null ? other$withdrawTime != null : !this$withdrawTime.equals(other$withdrawTime))
            return false;
        final Object this$verifyTime = this.getVerifyTime();
        final Object other$verifyTime = other.getVerifyTime();
        if (this$verifyTime == null ? other$verifyTime != null : !this$verifyTime.equals(other$verifyTime))
            return false;
        final Object this$transferTime = this.getTransferTime();
        final Object other$transferTime = other.getTransferTime();
        if (this$transferTime == null ? other$transferTime != null : !this$transferTime.equals(other$transferTime))
            return false;
        final Object this$withdrawNo = this.getWithdrawNo();
        final Object other$withdrawNo = other.getWithdrawNo();
        if (this$withdrawNo == null ? other$withdrawNo != null : !this$withdrawNo.equals(other$withdrawNo))
            return false;
        final Object this$rejectReason = this.getRejectReason();
        final Object other$rejectReason = other.getRejectReason();
        if (this$rejectReason == null ? other$rejectReason != null : !this$rejectReason.equals(other$rejectReason))
            return false;
        final Object this$completeTime = this.getCompleteTime();
        final Object other$completeTime = other.getCompleteTime();
        if (this$completeTime == null ? other$completeTime != null : !this$completeTime.equals(other$completeTime))
            return false;
        final Object this$paymentAmount = this.getPaymentAmount();
        final Object other$paymentAmount = other.getPaymentAmount();
        if (this$paymentAmount == null ? other$paymentAmount != null : !this$paymentAmount.equals(other$paymentAmount))
            return false;
        final Object this$taxAmount = this.getTaxAmount();
        final Object other$taxAmount = other.getTaxAmount();
        if (this$taxAmount == null ? other$taxAmount != null : !this$taxAmount.equals(other$taxAmount)) return false;
        final Object this$memo = this.getMemo();
        final Object other$memo = other.getMemo();
        if (this$memo == null ? other$memo != null : !this$memo.equals(other$memo)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LeaderWithdraw;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $merchantAmount = this.getMerchantAmount();
        result = result * PRIME + ($merchantAmount == null ? 43 : $merchantAmount.hashCode());
        final Object $merchantStatus = this.getMerchantStatus();
        result = result * PRIME + ($merchantStatus == null ? 43 : $merchantStatus.hashCode());
        final Object $failReason = this.getFailReason();
        result = result * PRIME + ($failReason == null ? 43 : $failReason.hashCode());
        final Object $paymentMethod = this.getPaymentMethod();
        result = result * PRIME + ($paymentMethod == null ? 43 : $paymentMethod.hashCode());
        final Object $bankName = this.getBankName();
        result = result * PRIME + ($bankName == null ? 43 : $bankName.hashCode());
        final Object $bankAccountNo = this.getBankAccountNo();
        result = result * PRIME + ($bankAccountNo == null ? 43 : $bankAccountNo.hashCode());
        final Object $bankAccountName = this.getBankAccountName();
        result = result * PRIME + ($bankAccountName == null ? 43 : $bankAccountName.hashCode());
        final Object $wechatId = this.getWechatId();
        result = result * PRIME + ($wechatId == null ? 43 : $wechatId.hashCode());
        final Object $withdrawTime = this.getWithdrawTime();
        result = result * PRIME + ($withdrawTime == null ? 43 : $withdrawTime.hashCode());
        final Object $verifyTime = this.getVerifyTime();
        result = result * PRIME + ($verifyTime == null ? 43 : $verifyTime.hashCode());
        final Object $transferTime = this.getTransferTime();
        result = result * PRIME + ($transferTime == null ? 43 : $transferTime.hashCode());
        final Object $withdrawNo = this.getWithdrawNo();
        result = result * PRIME + ($withdrawNo == null ? 43 : $withdrawNo.hashCode());
        final Object $rejectReason = this.getRejectReason();
        result = result * PRIME + ($rejectReason == null ? 43 : $rejectReason.hashCode());
        final Object $completeTime = this.getCompleteTime();
        result = result * PRIME + ($completeTime == null ? 43 : $completeTime.hashCode());
        final Object $paymentAmount = this.getPaymentAmount();
        result = result * PRIME + ($paymentAmount == null ? 43 : $paymentAmount.hashCode());
        final Object $taxAmount = this.getTaxAmount();
        result = result * PRIME + ($taxAmount == null ? 43 : $taxAmount.hashCode());
        final Object $memo = this.getMemo();
        result = result * PRIME + ($memo == null ? 43 : $memo.hashCode());
        return result;
    }

    public String toString() {
        return "LeaderWithdraw(leaderId=" + this.getLeaderId() + ", merchantAmount=" + this.getMerchantAmount() + ", merchantStatus=" + this.getMerchantStatus() + ", failReason=" + this.getFailReason() + ", paymentMethod=" + this.getPaymentMethod() + ", bankName=" + this.getBankName() + ", bankAccountNo=" + this.getBankAccountNo() + ", bankAccountName=" + this.getBankAccountName() + ", wechatId=" + this.getWechatId() + ", withdrawTime=" + this.getWithdrawTime() + ", verifyTime=" + this.getVerifyTime() + ", transferTime=" + this.getTransferTime() + ", withdrawNo=" + this.getWithdrawNo() + ", rejectReason=" + this.getRejectReason() + ", completeTime=" + this.getCompleteTime() + ", paymentAmount=" + this.getPaymentAmount() + ", taxAmount=" + this.getTaxAmount() + ", memo=" + this.getMemo() + ")";
    }
}