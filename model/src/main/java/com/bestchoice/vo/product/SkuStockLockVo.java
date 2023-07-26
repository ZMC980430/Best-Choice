package com.bestchoice.vo.product;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class SkuStockLockVo implements Serializable {

    @ApiModelProperty(value = "skuId")
    private Long skuId;

    @ApiModelProperty(value = "sku个数")
    private Integer skuNum;

    @ApiModelProperty(value = "是否锁定")
    private Boolean isLock = false;

    public SkuStockLockVo() {
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public Integer getSkuNum() {
        return this.skuNum;
    }

    public Boolean getIsLock() {
        return this.isLock;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuStockLockVo)) return false;
        final SkuStockLockVo other = (SkuStockLockVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$skuNum = this.getSkuNum();
        final Object other$skuNum = other.getSkuNum();
        if (this$skuNum == null ? other$skuNum != null : !this$skuNum.equals(other$skuNum)) return false;
        final Object this$isLock = this.getIsLock();
        final Object other$isLock = other.getIsLock();
        if (this$isLock == null ? other$isLock != null : !this$isLock.equals(other$isLock)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SkuStockLockVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $skuNum = this.getSkuNum();
        result = result * PRIME + ($skuNum == null ? 43 : $skuNum.hashCode());
        final Object $isLock = this.getIsLock();
        result = result * PRIME + ($isLock == null ? 43 : $isLock.hashCode());
        return result;
    }

    public String toString() {
        return "SkuStockLockVo(skuId=" + this.getSkuId() + ", skuNum=" + this.getSkuNum() + ", isLock=" + this.getIsLock() + ")";
    }
}

