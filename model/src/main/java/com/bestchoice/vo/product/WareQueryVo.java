package com.bestchoice.vo.product;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class WareQueryVo {

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "省code")
    private String province;

    @ApiModelProperty(value = "城市code")
    private String city;

    @ApiModelProperty(value = "区域code")
    private String district;

    @ApiModelProperty(value = "详细地址")
    private String detailAddress;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "删除标记（0:不可用 1:可用）")
    private Integer isDeleted;

    public WareQueryVo() {
    }


    public String getName() {
        return this.name;
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

    public String getDetailAddress() {
        return this.detailAddress;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getLatitude() {
        return this.latitude;
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

    public void setName(String name) {
        this.name = name;
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

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
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
        if (!(o instanceof WareQueryVo)) return false;
        final WareQueryVo other = (WareQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$province = this.getProvince();
        final Object other$province = other.getProvince();
        if (this$province == null ? other$province != null : !this$province.equals(other$province)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$district = this.getDistrict();
        final Object other$district = other.getDistrict();
        if (this$district == null ? other$district != null : !this$district.equals(other$district)) return false;
        final Object this$detailAddress = this.getDetailAddress();
        final Object other$detailAddress = other.getDetailAddress();
        if (this$detailAddress == null ? other$detailAddress != null : !this$detailAddress.equals(other$detailAddress))
            return false;
        final Object this$longitude = this.getLongitude();
        final Object other$longitude = other.getLongitude();
        if (this$longitude == null ? other$longitude != null : !this$longitude.equals(other$longitude)) return false;
        final Object this$latitude = this.getLatitude();
        final Object other$latitude = other.getLatitude();
        if (this$latitude == null ? other$latitude != null : !this$latitude.equals(other$latitude)) return false;
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
        return other instanceof WareQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $province = this.getProvince();
        result = result * PRIME + ($province == null ? 43 : $province.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $district = this.getDistrict();
        result = result * PRIME + ($district == null ? 43 : $district.hashCode());
        final Object $detailAddress = this.getDetailAddress();
        result = result * PRIME + ($detailAddress == null ? 43 : $detailAddress.hashCode());
        final Object $longitude = this.getLongitude();
        result = result * PRIME + ($longitude == null ? 43 : $longitude.hashCode());
        final Object $latitude = this.getLatitude();
        result = result * PRIME + ($latitude == null ? 43 : $latitude.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        final Object $isDeleted = this.getIsDeleted();
        result = result * PRIME + ($isDeleted == null ? 43 : $isDeleted.hashCode());
        return result;
    }

    public String toString() {
        return "WareQueryVo(name=" + this.getName() + ", province=" + this.getProvince() + ", city=" + this.getCity() + ", district=" + this.getDistrict() + ", detailAddress=" + this.getDetailAddress() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", isDeleted=" + this.getIsDeleted() + ")";
    }
}

