package com.bestchoice.vo.sys;

import io.swagger.annotations.ApiModelProperty;

public class RegionWareQueryVo {

    @ApiModelProperty(value = "关键字")
    private String keyword;

    public RegionWareQueryVo() {
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RegionWareQueryVo)) return false;
        final RegionWareQueryVo other = (RegionWareQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$keyword = this.getKeyword();
        final Object other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RegionWareQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $keyword = this.getKeyword();
        result = result * PRIME + ($keyword == null ? 43 : $keyword.hashCode());
        return result;
    }

    public String toString() {
        return "RegionWareQueryVo(keyword=" + this.getKeyword() + ")";
    }
}

