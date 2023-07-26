package com.bestchoice.enums.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bestchoice.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel(description = "LeaderAccount")
@TableName("leader_account")
public class LeaderAccount extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "团长ID")
    @TableField("leader_id")
    private Long leaderId;

    @ApiModelProperty(value = "总收益, 可能有部分余额因为订单未结束而不能提现")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "可提现余额")
    @TableField("available_amount")
    private BigDecimal availableAmount;

    @ApiModelProperty(value = "冻结余额")
    @TableField("frozen_amount")
    private BigDecimal frozenAmount;

    public LeaderAccount() {
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public BigDecimal getFrozenAmount() {
        return this.frozenAmount;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LeaderAccount)) return false;
        final LeaderAccount other = (LeaderAccount) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$totalAmount = this.getTotalAmount();
        final Object other$totalAmount = other.getTotalAmount();
        if (this$totalAmount == null ? other$totalAmount != null : !this$totalAmount.equals(other$totalAmount))
            return false;
        final Object this$availableAmount = this.getAvailableAmount();
        final Object other$availableAmount = other.getAvailableAmount();
        if (this$availableAmount == null ? other$availableAmount != null : !this$availableAmount.equals(other$availableAmount))
            return false;
        final Object this$frozenAmount = this.getFrozenAmount();
        final Object other$frozenAmount = other.getFrozenAmount();
        if (this$frozenAmount == null ? other$frozenAmount != null : !this$frozenAmount.equals(other$frozenAmount))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LeaderAccount;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $totalAmount = this.getTotalAmount();
        result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
        final Object $availableAmount = this.getAvailableAmount();
        result = result * PRIME + ($availableAmount == null ? 43 : $availableAmount.hashCode());
        final Object $frozenAmount = this.getFrozenAmount();
        result = result * PRIME + ($frozenAmount == null ? 43 : $frozenAmount.hashCode());
        return result;
    }

    public String toString() {
        return "LeaderAccount(leaderId=" + this.getLeaderId() + ", totalAmount=" + this.getTotalAmount() + ", availableAmount=" + this.getAvailableAmount() + ", frozenAmount=" + this.getFrozenAmount() + ")";
    }
}