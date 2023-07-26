package com.bestchoice.vo.user;

import io.swagger.annotations.ApiModelProperty;

public class LeaderQueryVo {

    @ApiModelProperty(value = "审核状态")
    private Integer checkStatus;

    @ApiModelProperty(value = "关键字")
    private String keyword;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区域")
    private String district;

    public LeaderQueryVo() {
    }

    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getProvince() {
        return this.province;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LeaderQueryVo)) return false;
        final LeaderQueryVo other = (LeaderQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$checkStatus = this.getCheckStatus();
        final Object other$checkStatus = other.getCheckStatus();
        if (this$checkStatus == null ? other$checkStatus != null : !this$checkStatus.equals(other$checkStatus))
            return false;
        final Object this$keyword = this.getKeyword();
        final Object other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) return false;
        final Object this$province = this.getProvince();
        final Object other$province = other.getProvince();
        if (this$province == null ? other$province != null : !this$province.equals(other$province)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$district = this.getDistrict();
        final Object other$district = other.getDistrict();
        if (this$district == null ? other$district != null : !this$district.equals(other$district)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LeaderQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $checkStatus = this.getCheckStatus();
        result = result * PRIME + ($checkStatus == null ? 43 : $checkStatus.hashCode());
        final Object $keyword = this.getKeyword();
        result = result * PRIME + ($keyword == null ? 43 : $keyword.hashCode());
        final Object $province = this.getProvince();
        result = result * PRIME + ($province == null ? 43 : $province.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $district = this.getDistrict();
        result = result * PRIME + ($district == null ? 43 : $district.hashCode());
        return result;
    }

    public String toString() {
        return "LeaderQueryVo(checkStatus=" + this.getCheckStatus() + ", keyword=" + this.getKeyword() + ", province=" + this.getProvince() + ", city=" + this.getCity() + ", district=" + this.getDistrict() + ")";
    }
}

