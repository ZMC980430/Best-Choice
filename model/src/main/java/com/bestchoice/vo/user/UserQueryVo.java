package com.bestchoice.vo.user;

import io.swagger.annotations.ApiModelProperty;

public class UserQueryVo {

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "身份证号码")
    private String idNo;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "电话号码")
    private String phone;

    public UserQueryVo() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserQueryVo)) return false;
        final UserQueryVo other = (UserQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
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
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        final Object $idNo = this.getIdNo();
        result = result * PRIME + ($idNo == null ? 43 : $idNo.hashCode());
        final Object $sex = this.getSex();
        result = result * PRIME + ($sex == null ? 43 : $sex.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        return result;
    }

    public String toString() {
        return "UserQueryVo(nickName=" + this.getNickName() + ", idNo=" + this.getIdNo() + ", sex=" + this.getSex() + ", phone=" + this.getPhone() + ")";
    }
}

