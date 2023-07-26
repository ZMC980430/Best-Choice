package com.bestchoice.vo.activity;

import com.bestchoice.enums.CouponRangeType;
import com.bestchoice.model.activity.CouponRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@ApiModel(description = "优惠券规则")
public class CouponRuleVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "优惠券id")
    private Long couponId;

    @ApiModelProperty(value = "范围类型")
    private CouponRangeType rangeType;

    @ApiModelProperty(value = "金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "使用门槛 0->没门槛")
    private BigDecimal conditionAmount;

    @ApiModelProperty(value = "优惠券参与的商品list")
    private List<CouponRange> couponRangeList;

    @ApiModelProperty(value = "优惠券范围描述")
    private String rangeDesc;

    public CouponRuleVo() {
    }

    public Long getCouponId() {
        return this.couponId;
    }

    public CouponRangeType getRangeType() {
        return this.rangeType;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getConditionAmount() {
        return this.conditionAmount;
    }

    public List<CouponRange> getCouponRangeList() {
        return this.couponRangeList;
    }

    public String getRangeDesc() {
        return this.rangeDesc;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public void setRangeType(CouponRangeType rangeType) {
        this.rangeType = rangeType;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setConditionAmount(BigDecimal conditionAmount) {
        this.conditionAmount = conditionAmount;
    }

    public void setCouponRangeList(List<CouponRange> couponRangeList) {
        this.couponRangeList = couponRangeList;
    }

    public void setRangeDesc(String rangeDesc) {
        this.rangeDesc = rangeDesc;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CouponRuleVo)) return false;
        final CouponRuleVo other = (CouponRuleVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$couponId = this.getCouponId();
        final Object other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !this$couponId.equals(other$couponId)) return false;
        final Object this$rangeType = this.getRangeType();
        final Object other$rangeType = other.getRangeType();
        if (this$rangeType == null ? other$rangeType != null : !this$rangeType.equals(other$rangeType)) return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        final Object this$conditionAmount = this.getConditionAmount();
        final Object other$conditionAmount = other.getConditionAmount();
        if (this$conditionAmount == null ? other$conditionAmount != null : !this$conditionAmount.equals(other$conditionAmount))
            return false;
        final Object this$couponRangeList = this.getCouponRangeList();
        final Object other$couponRangeList = other.getCouponRangeList();
        if (this$couponRangeList == null ? other$couponRangeList != null : !this$couponRangeList.equals(other$couponRangeList))
            return false;
        final Object this$rangeDesc = this.getRangeDesc();
        final Object other$rangeDesc = other.getRangeDesc();
        if (this$rangeDesc == null ? other$rangeDesc != null : !this$rangeDesc.equals(other$rangeDesc)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CouponRuleVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $couponId = this.getCouponId();
        result = result * PRIME + ($couponId == null ? 43 : $couponId.hashCode());
        final Object $rangeType = this.getRangeType();
        result = result * PRIME + ($rangeType == null ? 43 : $rangeType.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $conditionAmount = this.getConditionAmount();
        result = result * PRIME + ($conditionAmount == null ? 43 : $conditionAmount.hashCode());
        final Object $couponRangeList = this.getCouponRangeList();
        result = result * PRIME + ($couponRangeList == null ? 43 : $couponRangeList.hashCode());
        final Object $rangeDesc = this.getRangeDesc();
        result = result * PRIME + ($rangeDesc == null ? 43 : $rangeDesc.hashCode());
        return result;
    }

    public String toString() {
        return "CouponRuleVo(couponId=" + this.getCouponId() + ", rangeType=" + this.getRangeType() + ", amount=" + this.getAmount() + ", conditionAmount=" + this.getConditionAmount() + ", couponRangeList=" + this.getCouponRangeList() + ", rangeDesc=" + this.getRangeDesc() + ")";
    }
}