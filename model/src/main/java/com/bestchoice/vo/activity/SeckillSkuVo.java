package com.bestchoice.vo.activity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel(description = "秒杀商品信息")
public class SeckillSkuVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "秒杀商品主键id")
    private Long seckillSkuId;

    @ApiModelProperty(value = "skuId")
    private Long skuId;

    @ApiModelProperty(value = "spu名称")
    private String skuName;

    @ApiModelProperty(value = "展示图片")
    private String imgUrl;

    @ApiModelProperty(value = "秒杀价格")
    private BigDecimal seckillPrice;

    @ApiModelProperty(value = "秒杀总量")
    private Integer seckillStock;

    @ApiModelProperty(value = "每人限购数量")
    private Integer seckillLimit;

    @ApiModelProperty(value = "秒杀销量")
    private Integer seckillSale;

    @ApiModelProperty(value = "场次名称")
    private String timeName;

    @ApiModelProperty(value = "每日开始时间")
    @JsonFormat(pattern = "HH:mm:ss")
    private Date startTime;

    @ApiModelProperty(value = "每日结束时间")
    @JsonFormat(pattern = "HH:mm:ss")
    private Date endTime;

    @ApiModelProperty(value = "场次状态 1：已开抢 2：抢购中 3：即将开抢")
    @TableField(exist = false)
    private Integer timeStaus;

    public SeckillSkuVo() {
    }

    public Long getSeckillSkuId() {
        return this.seckillSkuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public String getSkuName() {
        return this.skuName;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public BigDecimal getSeckillPrice() {
        return this.seckillPrice;
    }

    public Integer getSeckillStock() {
        return this.seckillStock;
    }

    public Integer getSeckillLimit() {
        return this.seckillLimit;
    }

    public Integer getSeckillSale() {
        return this.seckillSale;
    }

    public String getTimeName() {
        return this.timeName;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Integer getTimeStaus() {
        return this.timeStaus;
    }

    public void setSeckillSkuId(Long seckillSkuId) {
        this.seckillSkuId = seckillSkuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public void setSeckillStock(Integer seckillStock) {
        this.seckillStock = seckillStock;
    }

    public void setSeckillLimit(Integer seckillLimit) {
        this.seckillLimit = seckillLimit;
    }

    public void setSeckillSale(Integer seckillSale) {
        this.seckillSale = seckillSale;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName;
    }

    @JsonFormat(pattern = "HH:mm:ss")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @JsonFormat(pattern = "HH:mm:ss")
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setTimeStaus(Integer timeStaus) {
        this.timeStaus = timeStaus;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SeckillSkuVo)) return false;
        final SeckillSkuVo other = (SeckillSkuVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$seckillSkuId = this.getSeckillSkuId();
        final Object other$seckillSkuId = other.getSeckillSkuId();
        if (this$seckillSkuId == null ? other$seckillSkuId != null : !this$seckillSkuId.equals(other$seckillSkuId))
            return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$skuName = this.getSkuName();
        final Object other$skuName = other.getSkuName();
        if (this$skuName == null ? other$skuName != null : !this$skuName.equals(other$skuName)) return false;
        final Object this$imgUrl = this.getImgUrl();
        final Object other$imgUrl = other.getImgUrl();
        if (this$imgUrl == null ? other$imgUrl != null : !this$imgUrl.equals(other$imgUrl)) return false;
        final Object this$seckillPrice = this.getSeckillPrice();
        final Object other$seckillPrice = other.getSeckillPrice();
        if (this$seckillPrice == null ? other$seckillPrice != null : !this$seckillPrice.equals(other$seckillPrice))
            return false;
        final Object this$seckillStock = this.getSeckillStock();
        final Object other$seckillStock = other.getSeckillStock();
        if (this$seckillStock == null ? other$seckillStock != null : !this$seckillStock.equals(other$seckillStock))
            return false;
        final Object this$seckillLimit = this.getSeckillLimit();
        final Object other$seckillLimit = other.getSeckillLimit();
        if (this$seckillLimit == null ? other$seckillLimit != null : !this$seckillLimit.equals(other$seckillLimit))
            return false;
        final Object this$seckillSale = this.getSeckillSale();
        final Object other$seckillSale = other.getSeckillSale();
        if (this$seckillSale == null ? other$seckillSale != null : !this$seckillSale.equals(other$seckillSale))
            return false;
        final Object this$timeName = this.getTimeName();
        final Object other$timeName = other.getTimeName();
        if (this$timeName == null ? other$timeName != null : !this$timeName.equals(other$timeName)) return false;
        final Object this$startTime = this.getStartTime();
        final Object other$startTime = other.getStartTime();
        if (this$startTime == null ? other$startTime != null : !this$startTime.equals(other$startTime)) return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
        final Object this$timeStaus = this.getTimeStaus();
        final Object other$timeStaus = other.getTimeStaus();
        if (this$timeStaus == null ? other$timeStaus != null : !this$timeStaus.equals(other$timeStaus)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SeckillSkuVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $seckillSkuId = this.getSeckillSkuId();
        result = result * PRIME + ($seckillSkuId == null ? 43 : $seckillSkuId.hashCode());
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $skuName = this.getSkuName();
        result = result * PRIME + ($skuName == null ? 43 : $skuName.hashCode());
        final Object $imgUrl = this.getImgUrl();
        result = result * PRIME + ($imgUrl == null ? 43 : $imgUrl.hashCode());
        final Object $seckillPrice = this.getSeckillPrice();
        result = result * PRIME + ($seckillPrice == null ? 43 : $seckillPrice.hashCode());
        final Object $seckillStock = this.getSeckillStock();
        result = result * PRIME + ($seckillStock == null ? 43 : $seckillStock.hashCode());
        final Object $seckillLimit = this.getSeckillLimit();
        result = result * PRIME + ($seckillLimit == null ? 43 : $seckillLimit.hashCode());
        final Object $seckillSale = this.getSeckillSale();
        result = result * PRIME + ($seckillSale == null ? 43 : $seckillSale.hashCode());
        final Object $timeName = this.getTimeName();
        result = result * PRIME + ($timeName == null ? 43 : $timeName.hashCode());
        final Object $startTime = this.getStartTime();
        result = result * PRIME + ($startTime == null ? 43 : $startTime.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $timeStaus = this.getTimeStaus();
        result = result * PRIME + ($timeStaus == null ? 43 : $timeStaus.hashCode());
        return result;
    }

    public String toString() {
        return "SeckillSkuVo(seckillSkuId=" + this.getSeckillSkuId() + ", skuId=" + this.getSkuId() + ", skuName=" + this.getSkuName() + ", imgUrl=" + this.getImgUrl() + ", seckillPrice=" + this.getSeckillPrice() + ", seckillStock=" + this.getSeckillStock() + ", seckillLimit=" + this.getSeckillLimit() + ", seckillSale=" + this.getSeckillSale() + ", timeName=" + this.getTimeName() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", timeStaus=" + this.getTimeStaus() + ")";
    }
}