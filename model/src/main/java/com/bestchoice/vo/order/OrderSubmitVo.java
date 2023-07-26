package com.bestchoice.vo.order;

import io.swagger.annotations.ApiModelProperty;

public class OrderSubmitVo {

    @ApiModelProperty(value = "使用预生产订单号防重")
    private String orderNo;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "团长id")
    private Long leaderId;

    @ApiModelProperty(value = "收货人姓名")
    private String receiverName;

    @ApiModelProperty(value = "收货人电话")
    private String receiverPhone;

    @ApiModelProperty(value = "下单选中的优惠券id")
    private Long couponId;

    public OrderSubmitVo() {
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public Long getCouponId() {
        return this.couponId;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderSubmitVo)) return false;
        final OrderSubmitVo other = (OrderSubmitVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderNo = this.getOrderNo();
        final Object other$orderNo = other.getOrderNo();
        if (this$orderNo == null ? other$orderNo != null : !this$orderNo.equals(other$orderNo)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$receiverName = this.getReceiverName();
        final Object other$receiverName = other.getReceiverName();
        if (this$receiverName == null ? other$receiverName != null : !this$receiverName.equals(other$receiverName))
            return false;
        final Object this$receiverPhone = this.getReceiverPhone();
        final Object other$receiverPhone = other.getReceiverPhone();
        if (this$receiverPhone == null ? other$receiverPhone != null : !this$receiverPhone.equals(other$receiverPhone))
            return false;
        final Object this$couponId = this.getCouponId();
        final Object other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !this$couponId.equals(other$couponId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderSubmitVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderNo = this.getOrderNo();
        result = result * PRIME + ($orderNo == null ? 43 : $orderNo.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $receiverName = this.getReceiverName();
        result = result * PRIME + ($receiverName == null ? 43 : $receiverName.hashCode());
        final Object $receiverPhone = this.getReceiverPhone();
        result = result * PRIME + ($receiverPhone == null ? 43 : $receiverPhone.hashCode());
        final Object $couponId = this.getCouponId();
        result = result * PRIME + ($couponId == null ? 43 : $couponId.hashCode());
        return result;
    }

    public String toString() {
        return "OrderSubmitVo(orderNo=" + this.getOrderNo() + ", userId=" + this.getUserId() + ", leaderId=" + this.getLeaderId() + ", receiverName=" + this.getReceiverName() + ", receiverPhone=" + this.getReceiverPhone() + ", couponId=" + this.getCouponId() + ")";
    }

//	@ApiModelProperty("购买的sku信息")
//	private List<Long> skuIdList;
}

