package com.bestchoice.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * UserAddress
 * </p>
 *
 * @author qy
 */
@ApiModel(description = "用户地址")
public class LeaderAddressVo {

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "团长id")
    private Long leaderId;

    @ApiModelProperty(value = "团长名称")
    private String leaderName;

    @ApiModelProperty(value = "团长电话")
    private String leaderPhone;

    @ApiModelProperty(value = "仓库id")
    private Long wareId;

    @ApiModelProperty(value = "提货点名称")
    private String takeName;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区域")
    private String district;

    @ApiModelProperty(value = "详细地址")
    private String detailAddress;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @ApiModelProperty(value = "门店照片")
    private String storePath;

    public LeaderAddressVo() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public String getLeaderName() {
        return this.leaderName;
    }

    public String getLeaderPhone() {
        return this.leaderPhone;
    }

    public Long getWareId() {
        return this.wareId;
    }

    public String getTakeName() {
        return this.takeName;
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

    public String getStorePath() {
        return this.storePath;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public void setLeaderPhone(String leaderPhone) {
        this.leaderPhone = leaderPhone;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public void setTakeName(String takeName) {
        this.takeName = takeName;
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

    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LeaderAddressVo)) return false;
        final LeaderAddressVo other = (LeaderAddressVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$leaderName = this.getLeaderName();
        final Object other$leaderName = other.getLeaderName();
        if (this$leaderName == null ? other$leaderName != null : !this$leaderName.equals(other$leaderName))
            return false;
        final Object this$leaderPhone = this.getLeaderPhone();
        final Object other$leaderPhone = other.getLeaderPhone();
        if (this$leaderPhone == null ? other$leaderPhone != null : !this$leaderPhone.equals(other$leaderPhone))
            return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        final Object this$takeName = this.getTakeName();
        final Object other$takeName = other.getTakeName();
        if (this$takeName == null ? other$takeName != null : !this$takeName.equals(other$takeName)) return false;
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
        final Object this$storePath = this.getStorePath();
        final Object other$storePath = other.getStorePath();
        if (this$storePath == null ? other$storePath != null : !this$storePath.equals(other$storePath)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LeaderAddressVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $leaderName = this.getLeaderName();
        result = result * PRIME + ($leaderName == null ? 43 : $leaderName.hashCode());
        final Object $leaderPhone = this.getLeaderPhone();
        result = result * PRIME + ($leaderPhone == null ? 43 : $leaderPhone.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        final Object $takeName = this.getTakeName();
        result = result * PRIME + ($takeName == null ? 43 : $takeName.hashCode());
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
        final Object $storePath = this.getStorePath();
        result = result * PRIME + ($storePath == null ? 43 : $storePath.hashCode());
        return result;
    }

    public String toString() {
        return "LeaderAddressVo(userId=" + this.getUserId() + ", leaderId=" + this.getLeaderId() + ", leaderName=" + this.getLeaderName() + ", leaderPhone=" + this.getLeaderPhone() + ", wareId=" + this.getWareId() + ", takeName=" + this.getTakeName() + ", province=" + this.getProvince() + ", city=" + this.getCity() + ", district=" + this.getDistrict() + ", detailAddress=" + this.getDetailAddress() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", storePath=" + this.getStorePath() + ")";
    }
}

