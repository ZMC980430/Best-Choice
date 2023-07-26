package com.bestchoice.vo.activity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class SeckillSkuNoticeVo {

    @ApiModelProperty(value = "member_id")
    private Long memberId;

    @ApiModelProperty(value = "sku_id")
    private Long skuId;

    @ApiModelProperty(value = "活动场次id")
    private Long sessionId;

    @ApiModelProperty(value = "订阅时间")
    private Date subcribeTime;

    @ApiModelProperty(value = "发送时间")
    private Date sendTime;

    @ApiModelProperty(value = "通知方式[0-短信，1-邮件]")
    private Boolean noticeType;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "删除标记（0:不可用 1:可用）")
    private Integer isDeleted;

    public SeckillSkuNoticeVo() {
    }


    public Long getMemberId() {
        return this.memberId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public Long getSessionId() {
        return this.sessionId;
    }

    public Date getSubcribeTime() {
        return this.subcribeTime;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public Boolean getNoticeType() {
        return this.noticeType;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public void setSubcribeTime(Date subcribeTime) {
        this.subcribeTime = subcribeTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public void setNoticeType(Boolean noticeType) {
        this.noticeType = noticeType;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SeckillSkuNoticeVo)) return false;
        final SeckillSkuNoticeVo other = (SeckillSkuNoticeVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$memberId = this.getMemberId();
        final Object other$memberId = other.getMemberId();
        if (this$memberId == null ? other$memberId != null : !this$memberId.equals(other$memberId)) return false;
        final Object this$skuId = this.getSkuId();
        final Object other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) return false;
        final Object this$sessionId = this.getSessionId();
        final Object other$sessionId = other.getSessionId();
        if (this$sessionId == null ? other$sessionId != null : !this$sessionId.equals(other$sessionId)) return false;
        final Object this$subcribeTime = this.getSubcribeTime();
        final Object other$subcribeTime = other.getSubcribeTime();
        if (this$subcribeTime == null ? other$subcribeTime != null : !this$subcribeTime.equals(other$subcribeTime))
            return false;
        final Object this$sendTime = this.getSendTime();
        final Object other$sendTime = other.getSendTime();
        if (this$sendTime == null ? other$sendTime != null : !this$sendTime.equals(other$sendTime)) return false;
        final Object this$noticeType = this.getNoticeType();
        final Object other$noticeType = other.getNoticeType();
        if (this$noticeType == null ? other$noticeType != null : !this$noticeType.equals(other$noticeType))
            return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        final Object this$isDeleted = this.getIsDeleted();
        final Object other$isDeleted = other.getIsDeleted();
        if (this$isDeleted == null ? other$isDeleted != null : !this$isDeleted.equals(other$isDeleted)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SeckillSkuNoticeVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $memberId = this.getMemberId();
        result = result * PRIME + ($memberId == null ? 43 : $memberId.hashCode());
        final Object $skuId = this.getSkuId();
        result = result * PRIME + ($skuId == null ? 43 : $skuId.hashCode());
        final Object $sessionId = this.getSessionId();
        result = result * PRIME + ($sessionId == null ? 43 : $sessionId.hashCode());
        final Object $subcribeTime = this.getSubcribeTime();
        result = result * PRIME + ($subcribeTime == null ? 43 : $subcribeTime.hashCode());
        final Object $sendTime = this.getSendTime();
        result = result * PRIME + ($sendTime == null ? 43 : $sendTime.hashCode());
        final Object $noticeType = this.getNoticeType();
        result = result * PRIME + ($noticeType == null ? 43 : $noticeType.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        final Object $isDeleted = this.getIsDeleted();
        result = result * PRIME + ($isDeleted == null ? 43 : $isDeleted.hashCode());
        return result;
    }

    public String toString() {
        return "SeckillSkuNoticeVo(memberId=" + this.getMemberId() + ", skuId=" + this.getSkuId() + ", sessionId=" + this.getSessionId() + ", subcribeTime=" + this.getSubcribeTime() + ", sendTime=" + this.getSendTime() + ", noticeType=" + this.getNoticeType() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", isDeleted=" + this.getIsDeleted() + ")";
    }
}

