package com.bestchoice.vo.order;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class StockStatisticsVo implements Serializable {

    @ApiModelProperty(value = "skuId")
    private Long skuId;

    @ApiModelProperty(value = "销售价格")
    private String price;

    @ApiModelProperty(value = "销量")
    @TableField("sale")
    private Integer sale;

    public StockStatisticsVo() {
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public String getPrice() {
        return this.price;
    }

    public Integer getSale() {
        return this.sale;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StockStatisticsVo)) return false;
        final StockStatisticsVo other = (StockStatisticsVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$sale = this.getSale();
        final Object other$sale = other.getSale();
        if (this$sale == null ? other$sale != null : !this$sale.equals(other$sale)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StockStatisticsVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $sale = this.getSale();
        result = result * PRIME + ($sale == null ? 43 : $sale.hashCode());
        return result;
    }

    public String toString() {
        return "StockStatisticsVo(skuId=" + this.getSkuId() + ", price=" + this.getPrice() + ", sale=" + this.getSale() + ")";
    }
}
