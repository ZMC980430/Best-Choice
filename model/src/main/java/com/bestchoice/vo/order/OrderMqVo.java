package com.bestchoice.vo.order;

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
public class OrderMqVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "团长id")
    private Long leaderId;

    @ApiModelProperty(value = "团长佣金")
    private BigDecimal commissionAmount;

    @ApiModelProperty(value = "订单项列表")
    private List<OrderItemMqVo> orderItemMqVoList;

    public OrderMqVo() {
    }


    public String getOrderNo() {
        return this.orderNo;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public BigDecimal getCommissionAmount() {
        return this.commissionAmount;
    }

    public List<OrderItemMqVo> getOrderItemMqVoList() {
        return this.orderItemMqVoList;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public void setOrderItemMqVoList(List<OrderItemMqVo> orderItemMqVoList) {
        this.orderItemMqVoList = orderItemMqVoList;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderMqVo)) return false;
        final OrderMqVo other = (OrderMqVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderNo = this.getOrderNo();
        final Object other$orderNo = other.getOrderNo();
        if (this$orderNo == null ? other$orderNo != null : !this$orderNo.equals(other$orderNo)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$commissionAmount = this.getCommissionAmount();
        final Object other$commissionAmount = other.getCommissionAmount();
        if (this$commissionAmount == null ? other$commissionAmount != null : !this$commissionAmount.equals(other$commissionAmount))
            return false;
        final Object this$orderItemMqVoList = this.getOrderItemMqVoList();
        final Object other$orderItemMqVoList = other.getOrderItemMqVoList();
        if (this$orderItemMqVoList == null ? other$orderItemMqVoList != null : !this$orderItemMqVoList.equals(other$orderItemMqVoList))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderMqVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderNo = this.getOrderNo();
        result = result * PRIME + ($orderNo == null ? 43 : $orderNo.hashCode());
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $commissionAmount = this.getCommissionAmount();
        result = result * PRIME + ($commissionAmount == null ? 43 : $commissionAmount.hashCode());
        final Object $orderItemMqVoList = this.getOrderItemMqVoList();
        result = result * PRIME + ($orderItemMqVoList == null ? 43 : $orderItemMqVoList.hashCode());
        return result;
    }

    public String toString() {
        return "OrderMqVo(orderNo=" + this.getOrderNo() + ", leaderId=" + this.getLeaderId() + ", commissionAmount=" + this.getCommissionAmount() + ", orderItemMqVoList=" + this.getOrderItemMqVoList() + ")";
    }
}

