package com.bestchoice.vo.order;

import com.bestchoice.model.activity.CouponInfo;
import com.bestchoice.vo.user.LeaderAddressVo;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * OrderDetailActivity
 * </p>
 *
 * @author qy
 */
public class OrderConfirmVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "预生产订单号")
    private String orderNo;

    @ApiModelProperty(value = "用户对应的团长地址")
    private LeaderAddressVo leaderAddressVo;

    @ApiModelProperty(value = "购物项列表")
    private List<CartInfoVo> carInfoVoList;

    @ApiModelProperty(value = "订单优惠券列表")
    private List<CouponInfo> couponInfoList;

    @ApiModelProperty(value = "促销优惠金额")
    private BigDecimal activityReduceAmount;

    @ApiModelProperty(value = "优惠券优惠金额")
    private BigDecimal couponReduceAmount;

    @ApiModelProperty(value = "购物车原始总金额")
    private BigDecimal originalTotalAmount;

    @ApiModelProperty(value = "最终总金额")
    private BigDecimal totalAmount;

    public OrderConfirmVo() {
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public LeaderAddressVo getLeaderAddressVo() {
        return this.leaderAddressVo;
    }

    public List<CartInfoVo> getCarInfoVoList() {
        return this.carInfoVoList;
    }

    public List<CouponInfo> getCouponInfoList() {
        return this.couponInfoList;
    }

    public BigDecimal getActivityReduceAmount() {
        return this.activityReduceAmount;
    }

    public BigDecimal getCouponReduceAmount() {
        return this.couponReduceAmount;
    }

    public BigDecimal getOriginalTotalAmount() {
        return this.originalTotalAmount;
    }

    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setLeaderAddressVo(LeaderAddressVo leaderAddressVo) {
        this.leaderAddressVo = leaderAddressVo;
    }

    public void setCarInfoVoList(List<CartInfoVo> carInfoVoList) {
        this.carInfoVoList = carInfoVoList;
    }

    public void setCouponInfoList(List<CouponInfo> couponInfoList) {
        this.couponInfoList = couponInfoList;
    }

    public void setActivityReduceAmount(BigDecimal activityReduceAmount) {
        this.activityReduceAmount = activityReduceAmount;
    }

    public void setCouponReduceAmount(BigDecimal couponReduceAmount) {
        this.couponReduceAmount = couponReduceAmount;
    }

    public void setOriginalTotalAmount(BigDecimal originalTotalAmount) {
        this.originalTotalAmount = originalTotalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderConfirmVo)) return false;
        final OrderConfirmVo other = (OrderConfirmVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderNo = this.getOrderNo();
        final Object other$orderNo = other.getOrderNo();
        if (this$orderNo == null ? other$orderNo != null : !this$orderNo.equals(other$orderNo)) return false;
        final Object this$leaderAddressVo = this.getLeaderAddressVo();
        final Object other$leaderAddressVo = other.getLeaderAddressVo();
        if (this$leaderAddressVo == null ? other$leaderAddressVo != null : !this$leaderAddressVo.equals(other$leaderAddressVo))
            return false;
        final Object this$carInfoVoList = this.getCarInfoVoList();
        final Object other$carInfoVoList = other.getCarInfoVoList();
        if (this$carInfoVoList == null ? other$carInfoVoList != null : !this$carInfoVoList.equals(other$carInfoVoList))
            return false;
        final Object this$couponInfoList = this.getCouponInfoList();
        final Object other$couponInfoList = other.getCouponInfoList();
        if (this$couponInfoList == null ? other$couponInfoList != null : !this$couponInfoList.equals(other$couponInfoList))
            return false;
        final Object this$activityReduceAmount = this.getActivityReduceAmount();
        final Object other$activityReduceAmount = other.getActivityReduceAmount();
        if (this$activityReduceAmount == null ? other$activityReduceAmount != null : !this$activityReduceAmount.equals(other$activityReduceAmount))
            return false;
        final Object this$couponReduceAmount = this.getCouponReduceAmount();
        final Object other$couponReduceAmount = other.getCouponReduceAmount();
        if (this$couponReduceAmount == null ? other$couponReduceAmount != null : !this$couponReduceAmount.equals(other$couponReduceAmount))
            return false;
        final Object this$originalTotalAmount = this.getOriginalTotalAmount();
        final Object other$originalTotalAmount = other.getOriginalTotalAmount();
        if (this$originalTotalAmount == null ? other$originalTotalAmount != null : !this$originalTotalAmount.equals(other$originalTotalAmount))
            return false;
        final Object this$totalAmount = this.getTotalAmount();
        final Object other$totalAmount = other.getTotalAmount();
        if (this$totalAmount == null ? other$totalAmount != null : !this$totalAmount.equals(other$totalAmount))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderConfirmVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderNo = this.getOrderNo();
        result = result * PRIME + ($orderNo == null ? 43 : $orderNo.hashCode());
        final Object $leaderAddressVo = this.getLeaderAddressVo();
        result = result * PRIME + ($leaderAddressVo == null ? 43 : $leaderAddressVo.hashCode());
        final Object $carInfoVoList = this.getCarInfoVoList();
        result = result * PRIME + ($carInfoVoList == null ? 43 : $carInfoVoList.hashCode());
        final Object $couponInfoList = this.getCouponInfoList();
        result = result * PRIME + ($couponInfoList == null ? 43 : $couponInfoList.hashCode());
        final Object $activityReduceAmount = this.getActivityReduceAmount();
        result = result * PRIME + ($activityReduceAmount == null ? 43 : $activityReduceAmount.hashCode());
        final Object $couponReduceAmount = this.getCouponReduceAmount();
        result = result * PRIME + ($couponReduceAmount == null ? 43 : $couponReduceAmount.hashCode());
        final Object $originalTotalAmount = this.getOriginalTotalAmount();
        result = result * PRIME + ($originalTotalAmount == null ? 43 : $originalTotalAmount.hashCode());
        final Object $totalAmount = this.getTotalAmount();
        result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
        return result;
    }

    public String toString() {
        return "OrderConfirmVo(orderNo=" + this.getOrderNo() + ", leaderAddressVo=" + this.getLeaderAddressVo() + ", carInfoVoList=" + this.getCarInfoVoList() + ", couponInfoList=" + this.getCouponInfoList() + ", activityReduceAmount=" + this.getActivityReduceAmount() + ", couponReduceAmount=" + this.getCouponReduceAmount() + ", originalTotalAmount=" + this.getOriginalTotalAmount() + ", totalAmount=" + this.getTotalAmount() + ")";
    }
}

