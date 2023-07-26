package com.bestchoice.vo.product;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class SkuStockVo implements Serializable {

    @ApiModelProperty(value = "skuId")
    private Long skuId;

    @ApiModelProperty(value = "sku类型")
    private Integer skuType;

    @ApiModelProperty(value = "更新的库存数量")
    private Integer stockNum;

    public SkuStockVo() {
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public Integer getSkuType() {
        return this.skuType;
    }

    public Integer getStockNum() {
        return this.stockNum;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSkuType(Integer skuType) {
        this.skuType = skuType;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuStockVo)) return false;
        final SkuStockVo other = (SkuStockVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$skuType = this.getSkuType();
        final Object other$skuType = other.getSkuType();
        if (this$skuType == null ? other$skuType != null : !this$skuType.equals(other$skuType)) return false;
        final Object this$stockNum = this.getStockNum();
        final Object other$stockNum = other.getStockNum();
        if (this$stockNum == null ? other$stockNum != null : !this$stockNum.equals(other$stockNum)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SkuStockVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $skuType = this.getSkuType();
        result = result * PRIME + ($skuType == null ? 43 : $skuType.hashCode());
        final Object $stockNum = this.getStockNum();
        result = result * PRIME + ($stockNum == null ? 43 : $stockNum.hashCode());
        return result;
    }

    public String toString() {
        return "SkuStockVo(skuId=" + this.getSkuId() + ", skuType=" + this.getSkuType() + ", stockNum=" + this.getStockNum() + ")";
    }
}

