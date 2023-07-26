package com.bestchoice.vo.user;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "Leader")
public class LeaderVo implements Serializable {

    private static final long serialVersionUID = 1L;

//	@ApiModelProperty(value = "用户id")
//	@TableField("user_id")
//	private Long userId;
//
//	@ApiModelProperty(value = "区域id")
//	@TableField("region_id")
//	private Long regionId;

    @ApiModelProperty(value = "有无门店")
    @TableField("have_store")
    private Integer haveStore;

    @ApiModelProperty(value = "提货点名称")
    @TableField("take_name")
    private String takeName;

    @ApiModelProperty(value = "省")
    @TableField("province")
    private Long province;

    @ApiModelProperty(value = "城市")
    @TableField("city")
    private Long city;

    @ApiModelProperty(value = "区域")
    @TableField("district")
    private Long district;

    @ApiModelProperty(value = "详细地址")
    @TableField("detail_address")
    private String detailAddress;

    @ApiModelProperty(value = "提货点类型；1->宝妈；2->便利店店主；3->快递站点；4->物业中心")
    @TableField("take_type")
    private String takeType;

    @ApiModelProperty(value = "营业时间")
    @TableField("work_time")
    private String workTime;

    @ApiModelProperty(value = "名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "手机号码")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "身份证")
    @TableField("id_no")
    private String idNo;

    @ApiModelProperty(value = "身份证图片路径")
    @TableField("id_no_url1")
    private String idNoUrl1;

    @ApiModelProperty(value = "身份证图片路径")
    @TableField("id_no_url2")
    private String idNoUrl2;

    @ApiModelProperty(value = "经度")
    @TableField("longitude")
    private Double longitude;

    @ApiModelProperty(value = "纬度")
    @TableField("latitude")
    private Double latitude;

    @ApiModelProperty(value = "门店照片")
    @TableField("store_path")
    private String storePath;

    public LeaderVo() {
    }

    public Integer getHaveStore() {
        return this.haveStore;
    }

    public String getTakeName() {
        return this.takeName;
    }

    public Long getProvince() {
        return this.province;
    }

    public Long getCity() {
        return this.city;
    }

    public Long getDistrict() {
        return this.district;
    }

    public String getDetailAddress() {
        return this.detailAddress;
    }

    public String getTakeType() {
        return this.takeType;
    }

    public String getWorkTime() {
        return this.workTime;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getIdNo() {
        return this.idNo;
    }

    public String getIdNoUrl1() {
        return this.idNoUrl1;
    }

    public String getIdNoUrl2() {
        return this.idNoUrl2;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public String getStorePath() {
        return this.storePath;
    }

    public void setHaveStore(Integer haveStore) {
        this.haveStore = haveStore;
    }

    public void setTakeName(String takeName) {
        this.takeName = takeName;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public void setTakeType(String takeType) {
        this.takeType = takeType;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setIdNoUrl1(String idNoUrl1) {
        this.idNoUrl1 = idNoUrl1;
    }

    public void setIdNoUrl2(String idNoUrl2) {
        this.idNoUrl2 = idNoUrl2;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LeaderVo)) return false;
        final LeaderVo other = (LeaderVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$haveStore = this.getHaveStore();
        final Object other$haveStore = other.getHaveStore();
        if (this$haveStore == null ? other$haveStore != null : !this$haveStore.equals(other$haveStore)) return false;
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
        final Object this$takeType = this.getTakeType();
        final Object other$takeType = other.getTakeType();
        if (this$takeType == null ? other$takeType != null : !this$takeType.equals(other$takeType)) return false;
        final Object this$workTime = this.getWorkTime();
        final Object other$workTime = other.getWorkTime();
        if (this$workTime == null ? other$workTime != null : !this$workTime.equals(other$workTime)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$idNo = this.getIdNo();
        final Object other$idNo = other.getIdNo();
        if (this$idNo == null ? other$idNo != null : !this$idNo.equals(other$idNo)) return false;
        final Object this$idNoUrl1 = this.getIdNoUrl1();
        final Object other$idNoUrl1 = other.getIdNoUrl1();
        if (this$idNoUrl1 == null ? other$idNoUrl1 != null : !this$idNoUrl1.equals(other$idNoUrl1)) return false;
        final Object this$idNoUrl2 = this.getIdNoUrl2();
        final Object other$idNoUrl2 = other.getIdNoUrl2();
        if (this$idNoUrl2 == null ? other$idNoUrl2 != null : !this$idNoUrl2.equals(other$idNoUrl2)) return false;
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
        return other instanceof LeaderVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $haveStore = this.getHaveStore();
        result = result * PRIME + ($haveStore == null ? 43 : $haveStore.hashCode());
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
        final Object $takeType = this.getTakeType();
        result = result * PRIME + ($takeType == null ? 43 : $takeType.hashCode());
        final Object $workTime = this.getWorkTime();
        result = result * PRIME + ($workTime == null ? 43 : $workTime.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $idNo = this.getIdNo();
        result = result * PRIME + ($idNo == null ? 43 : $idNo.hashCode());
        final Object $idNoUrl1 = this.getIdNoUrl1();
        result = result * PRIME + ($idNoUrl1 == null ? 43 : $idNoUrl1.hashCode());
        final Object $idNoUrl2 = this.getIdNoUrl2();
        result = result * PRIME + ($idNoUrl2 == null ? 43 : $idNoUrl2.hashCode());
        final Object $longitude = this.getLongitude();
        result = result * PRIME + ($longitude == null ? 43 : $longitude.hashCode());
        final Object $latitude = this.getLatitude();
        result = result * PRIME + ($latitude == null ? 43 : $latitude.hashCode());
        final Object $storePath = this.getStorePath();
        result = result * PRIME + ($storePath == null ? 43 : $storePath.hashCode());
        return result;
    }

    public String toString() {
        return "LeaderVo(haveStore=" + this.getHaveStore() + ", takeName=" + this.getTakeName() + ", province=" + this.getProvince() + ", city=" + this.getCity() + ", district=" + this.getDistrict() + ", detailAddress=" + this.getDetailAddress() + ", takeType=" + this.getTakeType() + ", workTime=" + this.getWorkTime() + ", name=" + this.getName() + ", phone=" + this.getPhone() + ", idNo=" + this.getIdNo() + ", idNoUrl1=" + this.getIdNoUrl1() + ", idNoUrl2=" + this.getIdNoUrl2() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", storePath=" + this.getStorePath() + ")";
    }
}