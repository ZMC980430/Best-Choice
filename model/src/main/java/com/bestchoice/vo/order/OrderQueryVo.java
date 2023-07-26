package com.bestchoice.vo.order;

import com.bestchoice.enums.OrderStatus;
import io.swagger.annotations.ApiModelProperty;

public class OrderQueryVo {


    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "收货人信息")
    private String receiver;

    @ApiModelProperty(value = "订单状态")
    private OrderStatus orderStatus;

    @ApiModelProperty(value = "团长id")
    private Long leaderId;

    @ApiModelProperty(value = "仓库id")
    private Long wareId;

    @ApiModelProperty(value = "创建时间")
    private String createTimeBegin;
    private String createTimeEnd;

    public OrderQueryVo() {
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public OrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public Long getWareId() {
        return this.wareId;
    }

    public String getCreateTimeBegin() {
        return this.createTimeBegin;
    }

    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public void setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderQueryVo)) return false;
        final OrderQueryVo other = (OrderQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderNo = this.getOrderNo();
        final Object other$orderNo = other.getOrderNo();
        if (this$orderNo == null ? other$orderNo != null : !this$orderNo.equals(other$orderNo)) return false;
        final Object this$receiver = this.getReceiver();
        final Object other$receiver = other.getReceiver();
        if (this$receiver == null ? other$receiver != null : !this$receiver.equals(other$receiver)) return false;
        final Object this$orderStatus = this.getOrderStatus();
        final Object other$orderStatus = other.getOrderStatus();
        if (this$orderStatus == null ? other$orderStatus != null : !this$orderStatus.equals(other$orderStatus))
            return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        final Object this$createTimeBegin = this.getCreateTimeBegin();
        final Object other$createTimeBegin = other.getCreateTimeBegin();
        if (this$createTimeBegin == null ? other$createTimeBegin != null : !this$createTimeBegin.equals(other$createTimeBegin))
            return false;
        final Object this$createTimeEnd = this.getCreateTimeEnd();
        final Object other$createTimeEnd = other.getCreateTimeEnd();
        if (this$createTimeEnd == null ? other$createTimeEnd != null : !this$createTimeEnd.equals(other$createTimeEnd))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderNo = this.getOrderNo();
        result = result * PRIME + ($orderNo == null ? 43 : $orderNo.hashCode());
        final Object $receiver = this.getReceiver();
        result = result * PRIME + ($receiver == null ? 43 : $receiver.hashCode());
        final Object $orderStatus = this.getOrderStatus();
        result = result * PRIME + ($orderStatus == null ? 43 : $orderStatus.hashCode());
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        final Object $createTimeBegin = this.getCreateTimeBegin();
        result = result * PRIME + ($createTimeBegin == null ? 43 : $createTimeBegin.hashCode());
        final Object $createTimeEnd = this.getCreateTimeEnd();
        result = result * PRIME + ($createTimeEnd == null ? 43 : $createTimeEnd.hashCode());
        return result;
    }

    public String toString() {
        return "OrderQueryVo(orderNo=" + this.getOrderNo() + ", receiver=" + this.getReceiver() + ", orderStatus=" + this.getOrderStatus() + ", leaderId=" + this.getLeaderId() + ", wareId=" + this.getWareId() + ", createTimeBegin=" + this.getCreateTimeBegin() + ", createTimeEnd=" + this.getCreateTimeEnd() + ")";
    }
}

