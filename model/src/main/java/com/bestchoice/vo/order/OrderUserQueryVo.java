package com.bestchoice.vo.order;

import com.bestchoice.enums.OrderStatus;
import io.swagger.annotations.ApiModelProperty;

public class OrderUserQueryVo {

    private Long userId;

    @ApiModelProperty(value = "订单状态")
    private OrderStatus orderStatus;

    public OrderUserQueryVo() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public OrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderUserQueryVo)) return false;
        final OrderUserQueryVo other = (OrderUserQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$orderStatus = this.getOrderStatus();
        final Object other$orderStatus = other.getOrderStatus();
        if (this$orderStatus == null ? other$orderStatus != null : !this$orderStatus.equals(other$orderStatus))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderUserQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $orderStatus = this.getOrderStatus();
        result = result * PRIME + ($orderStatus == null ? 43 : $orderStatus.hashCode());
        return result;
    }

    public String toString() {
        return "OrderUserQueryVo(userId=" + this.getUserId() + ", orderStatus=" + this.getOrderStatus() + ")";
    }
}

