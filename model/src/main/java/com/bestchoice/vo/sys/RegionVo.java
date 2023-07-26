package com.bestchoice.vo.sys;

import io.swagger.annotations.ApiModelProperty;

public class RegionVo {

    @ApiModelProperty(value = "开通区域")
    private Long regionId;

    @ApiModelProperty(value = "区域名称")
    private String regionName;

    public RegionVo() {
    }

    public Long getRegionId() {
        return this.regionId;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RegionVo)) return false;
        final RegionVo other = (RegionVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$regionId = this.getRegionId();
        final Object other$regionId = other.getRegionId();
        if (this$regionId == null ? other$regionId != null : !this$regionId.equals(other$regionId)) return false;
        final Object this$regionName = this.getRegionName();
        final Object other$regionName = other.getRegionName();
        if (this$regionName == null ? other$regionName != null : !this$regionName.equals(other$regionName))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RegionVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $regionId = this.getRegionId();
        result = result * PRIME + ($regionId == null ? 43 : $regionId.hashCode());
        final Object $regionName = this.getRegionName();
        result = result * PRIME + ($regionName == null ? 43 : $regionName.hashCode());
        return result;
    }

    public String toString() {
        return "RegionVo(regionId=" + this.getRegionId() + ", regionName=" + this.getRegionName() + ")";
    }
}

