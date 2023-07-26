package com.bestchoice.vo.product;

import com.bestchoice.model.product.SkuAttrValue;
import com.bestchoice.model.product.SkuImage;
import com.bestchoice.model.product.SkuInfo;
import com.bestchoice.model.product.SkuPoster;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SkuInfoVo extends SkuInfo {

    @ApiModelProperty(value = "海报列表")
    private List<SkuPoster> skuPosterList;

    @ApiModelProperty(value = "属性值")
    private List<SkuAttrValue> skuAttrValueList;

    @ApiModelProperty(value = "图片")
    private List<SkuImage> skuImagesList;

    public SkuInfoVo() {
    }

    public List<SkuPoster> getSkuPosterList() {
        return this.skuPosterList;
    }

    public List<SkuAttrValue> getSkuAttrValueList() {
        return this.skuAttrValueList;
    }

    public List<SkuImage> getSkuImagesList() {
        return this.skuImagesList;
    }

    public void setSkuPosterList(List<SkuPoster> skuPosterList) {
        this.skuPosterList = skuPosterList;
    }

    public void setSkuAttrValueList(List<SkuAttrValue> skuAttrValueList) {
        this.skuAttrValueList = skuAttrValueList;
    }

    public void setSkuImagesList(List<SkuImage> skuImagesList) {
        this.skuImagesList = skuImagesList;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SkuInfoVo)) return false;
        final SkuInfoVo other = (SkuInfoVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$skuPosterList = this.getSkuPosterList();
        final Object other$skuPosterList = other.getSkuPosterList();
        if (this$skuPosterList == null ? other$skuPosterList != null : !this$skuPosterList.equals(other$skuPosterList))
            return false;
        final Object this$skuAttrValueList = this.getSkuAttrValueList();
        final Object other$skuAttrValueList = other.getSkuAttrValueList();
        if (this$skuAttrValueList == null ? other$skuAttrValueList != null : !this$skuAttrValueList.equals(other$skuAttrValueList))
            return false;
        final Object this$skuImagesList = this.getSkuImagesList();
        final Object other$skuImagesList = other.getSkuImagesList();
        if (this$skuImagesList == null ? other$skuImagesList != null : !this$skuImagesList.equals(other$skuImagesList))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SkuInfoVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $skuPosterList = this.getSkuPosterList();
        result = result * PRIME + ($skuPosterList == null ? 43 : $skuPosterList.hashCode());
        final Object $skuAttrValueList = this.getSkuAttrValueList();
        result = result * PRIME + ($skuAttrValueList == null ? 43 : $skuAttrValueList.hashCode());
        final Object $skuImagesList = this.getSkuImagesList();
        result = result * PRIME + ($skuImagesList == null ? 43 : $skuImagesList.hashCode());
        return result;
    }

    public String toString() {
        return "SkuInfoVo(skuPosterList=" + this.getSkuPosterList() + ", skuAttrValueList=" + this.getSkuAttrValueList() + ", skuImagesList=" + this.getSkuImagesList() + ")";
    }
}

