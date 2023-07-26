package com.bestchoice.enums.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bestchoice.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "LeaderBank")
@TableName("leader_bank")
public class LeaderBank extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "团长ID")
    @TableField("leader_id")
    private String leaderId;

    @ApiModelProperty(value = "账户类型(微信,银行)")
    @TableField("account_type")
    private String accountType;

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

    public LeaderBank() {
    }

    public String getLeaderId() {
        return this.leaderId;
    }

    public String getAccountType() {
        return this.accountType;
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

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LeaderBank)) return false;
        final LeaderBank other = (LeaderBank) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$accountType = this.getAccountType();
        final Object other$accountType = other.getAccountType();
        if (this$accountType == null ? other$accountType != null : !this$accountType.equals(other$accountType))
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
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LeaderBank;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $accountType = this.getAccountType();
        result = result * PRIME + ($accountType == null ? 43 : $accountType.hashCode());
        final Object $bankName = this.getBankName();
        result = result * PRIME + ($bankName == null ? 43 : $bankName.hashCode());
        final Object $bankAccountNo = this.getBankAccountNo();
        result = result * PRIME + ($bankAccountNo == null ? 43 : $bankAccountNo.hashCode());
        final Object $bankAccountName = this.getBankAccountName();
        result = result * PRIME + ($bankAccountName == null ? 43 : $bankAccountName.hashCode());
        final Object $wechatId = this.getWechatId();
        result = result * PRIME + ($wechatId == null ? 43 : $wechatId.hashCode());
        return result;
    }

    public String toString() {
        return "LeaderBank(leaderId=" + this.getLeaderId() + ", accountType=" + this.getAccountType() + ", bankName=" + this.getBankName() + ", bankAccountNo=" + this.getBankAccountNo() + ", bankAccountName=" + this.getBankAccountName() + ", wechatId=" + this.getWechatId() + ")";
    }
}