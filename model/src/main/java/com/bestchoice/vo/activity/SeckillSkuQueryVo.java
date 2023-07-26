package com.bestchoice.vo.activity;

import io.swagger.annotations.ApiModelProperty;

public class SeckillSkuQueryVo {

    @ApiModelProperty(value = "秒杀活动id")
    private Long seckillId;

    @ApiModelProperty(value = "活动场次id")
    private Long seckillTimeId;

    public SeckillSkuQueryVo() {
    }

    public Long getSeckillId() {
        return this.seckillId;
    }

    public Long getSeckillTimeId() {
        return this.seckillTimeId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public void setSeckillTimeId(Long seckillTimeId) {
        this.seckillTimeId = seckillTimeId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SeckillSkuQueryVo)) return false;
        final SeckillSkuQueryVo other = (SeckillSkuQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$seckillId = this.getSeckillId();
        final Object other$seckillId = other.getSeckillId();
        if (this$seckillId == null ? other$seckillId != null : !this$seckillId.equals(other$seckillId)) return false;
        final Object this$seckillTimeId = this.getSeckillTimeId();
        final Object other$seckillTimeId = other.getSeckillTimeId();
        if (this$seckillTimeId == null ? other$seckillTimeId != null : !this$seckillTimeId.equals(other$seckillTimeId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SeckillSkuQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $seckillId = this.getSeckillId();
        result = result * PRIME + ($seckillId == null ? 43 : $seckillId.hashCode());
        final Object $seckillTimeId = this.getSeckillTimeId();
        result = result * PRIME + ($seckillTimeId == null ? 43 : $seckillTimeId.hashCode());
        return result;
    }

    public String toString() {
        return "SeckillSkuQueryVo(seckillId=" + this.getSeckillId() + ", seckillTimeId=" + this.getSeckillTimeId() + ")";
    }
}

