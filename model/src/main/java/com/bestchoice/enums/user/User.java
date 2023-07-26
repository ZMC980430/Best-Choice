package com.bestchoice.enums.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bestchoice.enums.UserType;
import com.bestchoice.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "User")
@TableName("user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("user_type")
    private UserType userType;

    @ApiModelProperty(value = "会员头像")
    @TableField("photo_url")
    private String photoUrl;

    @ApiModelProperty(value = "昵称")
    @TableField("nick_name")
    private String nickName;

    @ApiModelProperty(value = "身份证号码")
    @TableField("id_no")
    private String idNo;

    @ApiModelProperty(value = "性别")
    @TableField("sex")
    private String sex;

    @ApiModelProperty(value = "电话号码")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "备注")
    @TableField("memo")
    private String memo;

    @ApiModelProperty(value = "小程序open id")
    @TableField("open_id")
    private String openId;

    @ApiModelProperty(value = "微信开放平台unionID")
    @TableField("union_id")
    private String unionId;

    @ApiModelProperty(value = "是否新用户")
    @TableField("is_new")
    private Integer isNew;

    public User() {
    }

    public UserType getUserType() {
        return this.userType;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getIdNo() {
        return this.idNo;
    }

    public String getSex() {
        return this.sex;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getMemo() {
        return this.memo;
    }

    public String getOpenId() {
        return this.openId;
    }

    public String getUnionId() {
        return this.unionId;
    }

    public Integer getIsNew() {
        return this.isNew;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userType = this.getUserType();
        final Object other$userType = other.getUserType();
        if (this$userType == null ? other$userType != null : !this$userType.equals(other$userType)) return false;
        final Object this$photoUrl = this.getPhotoUrl();
        final Object other$photoUrl = other.getPhotoUrl();
        if (this$photoUrl == null ? other$photoUrl != null : !this$photoUrl.equals(other$photoUrl)) return false;
        final Object this$nickName = this.getNickName();
        final Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        final Object this$idNo = this.getIdNo();
        final Object other$idNo = other.getIdNo();
        if (this$idNo == null ? other$idNo != null : !this$idNo.equals(other$idNo)) return false;
        final Object this$sex = this.getSex();
        final Object other$sex = other.getSex();
        if (this$sex == null ? other$sex != null : !this$sex.equals(other$sex)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$memo = this.getMemo();
        final Object other$memo = other.getMemo();
        if (this$memo == null ? other$memo != null : !this$memo.equals(other$memo)) return false;
        final Object this$openId = this.getOpenId();
        final Object other$openId = other.getOpenId();
        if (this$openId == null ? other$openId != null : !this$openId.equals(other$openId)) return false;
        final Object this$unionId = this.getUnionId();
        final Object other$unionId = other.getUnionId();
        if (this$unionId == null ? other$unionId != null : !this$unionId.equals(other$unionId)) return false;
        final Object this$isNew = this.getIsNew();
        final Object other$isNew = other.getIsNew();
        if (this$isNew == null ? other$isNew != null : !this$isNew.equals(other$isNew)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userType = this.getUserType();
        result = result * PRIME + ($userType == null ? 43 : $userType.hashCode());
        final Object $photoUrl = this.getPhotoUrl();
        result = result * PRIME + ($photoUrl == null ? 43 : $photoUrl.hashCode());
        final Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        final Object $idNo = this.getIdNo();
        result = result * PRIME + ($idNo == null ? 43 : $idNo.hashCode());
        final Object $sex = this.getSex();
        result = result * PRIME + ($sex == null ? 43 : $sex.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $memo = this.getMemo();
        result = result * PRIME + ($memo == null ? 43 : $memo.hashCode());
        final Object $openId = this.getOpenId();
        result = result * PRIME + ($openId == null ? 43 : $openId.hashCode());
        final Object $unionId = this.getUnionId();
        result = result * PRIME + ($unionId == null ? 43 : $unionId.hashCode());
        final Object $isNew = this.getIsNew();
        result = result * PRIME + ($isNew == null ? 43 : $isNew.hashCode());
        return result;
    }

    public String toString() {
        return "User(userType=" + this.getUserType() + ", photoUrl=" + this.getPhotoUrl() + ", nickName=" + this.getNickName() + ", idNo=" + this.getIdNo() + ", sex=" + this.getSex() + ", phone=" + this.getPhone() + ", memo=" + this.getMemo() + ", openId=" + this.getOpenId() + ", unionId=" + this.getUnionId() + ", isNew=" + this.getIsNew() + ")";
    }
}