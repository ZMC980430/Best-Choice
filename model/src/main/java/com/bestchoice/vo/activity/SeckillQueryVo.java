package com.bestchoice.vo.activity;

import io.swagger.annotations.ApiModelProperty;

public class SeckillQueryVo {

    @ApiModelProperty(value = "活动标题")
    private String title;

    @ApiModelProperty(value = "上下线状态")
    private Integer status;

    public SeckillQueryVo() {
    }


    public String getTitle() {
        return this.title;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SeckillQueryVo)) return false;
        final SeckillQueryVo other = (SeckillQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SeckillQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "SeckillQueryVo(title=" + this.getTitle() + ", status=" + this.getStatus() + ")";
    }
}

