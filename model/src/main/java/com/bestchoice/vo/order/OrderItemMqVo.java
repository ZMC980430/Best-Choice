package com.bestchoice.vo.order;

import com.bestchoice.enums.SkuType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "OrderItem")
public class OrderItemMqVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品类型：0->普通商品 1->秒杀商品")
    private SkuType skuType;

    @ApiModelProperty(value = "商品sku编号")
    private Long skuId;

    @ApiModelProperty(value = "商品购买的数量")
    private Integer skuNum;

    public OrderItemMqVo() {
    }

    public SkuType getSkuType() {
        return this.skuType;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public Integer getSkuNum() {
        return this.skuNum;
    }

    public void setSkuType(SkuType skuType) {
        this.skuType = skuType;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderItemMqVo)) return false;
        final OrderItemMqVo other = (OrderItemMqVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$skuType = this.getSkuType();
        final Object other$skuType = other.getSkuType();
        if (this$skuType == null ? other$skuType != null : !this$skuType.equals(other$skuType)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$skuNum = this.getSkuNum();
        final Object other$skuNum = other.getSkuNum();
        if (this$skuNum == null ? other$skuNum != null : !this$skuNum.equals(other$skuNum)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderItemMqVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $skuType = this.getSkuType();
        result = result * PRIME + ($skuType == null ? 43 : $skuType.hashCode());
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $skuNum = this.getSkuNum();
        result = result * PRIME + ($skuNum == null ? 43 : $skuNum.hashCode());
        return result;
    }

    public String toString() {
        return "OrderItemMqVo(skuType=" + this.getSkuType() + ", skuId=" + this.getSkuId() + ", skuNum=" + this.getSkuNum() + ")";
    }
}