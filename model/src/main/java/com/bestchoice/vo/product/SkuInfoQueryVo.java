package com.bestchoice.vo.product;

import io.swagger.annotations.ApiModelProperty;

public class SkuInfoQueryVo {

    @ApiModelProperty(value = "分类id")
    private Long categoryId;

    @ApiModelProperty(value = "商品类型：0->普通商品 1->秒杀商品")
    private String skuType;

    @ApiModelProperty(value = "spu名称")
    private String keyword;

    public SkuInfoQueryVo() {
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getSkuType() {
        return this.skuType;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setSkuType(String skuType) {
        this.skuType = skuType;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuInfoQueryVo)) return false;
        final SkuInfoQueryVo other = (SkuInfoQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$categoryId = this.getCategoryId();
        final Object other$categoryId = other.getCategoryId();
        if (this$categoryId == null ? other$categoryId != null : !this$categoryId.equals(other$categoryId))
            return false;
        final Object this$skuType = this.getSkuType();
        final Object other$skuType = other.getSkuType();
        if (this$skuType == null ? other$skuType != null : !this$skuType.equals(other$skuType)) return false;
        final Object this$keyword = this.getKeyword();
        final Object other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SkuInfoQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $categoryId = this.getCategoryId();
        result = result * PRIME + ($categoryId == null ? 43 : $categoryId.hashCode());
        final Object $skuType = this.getSkuType();
        result = result * PRIME + ($skuType == null ? 43 : $skuType.hashCode());
        final Object $keyword = this.getKeyword();
        result = result * PRIME + ($keyword == null ? 43 : $keyword.hashCode());
        return result;
    }

    public String toString() {
        return "SkuInfoQueryVo(categoryId=" + this.getCategoryId() + ", skuType=" + this.getSkuType() + ", keyword=" + this.getKeyword() + ")";
    }
}

