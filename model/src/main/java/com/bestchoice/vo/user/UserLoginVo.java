package com.bestchoice.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "用户登录信息")
public class UserLoginVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "会员头像")
    private String photoUrl;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "小程序open id")
    private String openId;

    @ApiModelProperty(value = "是否新用户")
    private Integer isNew;

    @ApiModelProperty(value = "当前登录用户团长id")
    private Long leaderId;

    @ApiModelProperty(value = "仓库id")
    private Long wareId;

    public UserLoginVo() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getOpenId() {
        return this.openId;
    }

    public Integer getIsNew() {
        return this.isNew;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public Long getWareId() {
        return this.wareId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserLoginVo)) return false;
        final UserLoginVo other = (UserLoginVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$photoUrl = this.getPhotoUrl();
        final Object other$photoUrl = other.getPhotoUrl();
        if (this$photoUrl == null ? other$photoUrl != null : !this$photoUrl.equals(other$photoUrl)) return false;
        final Object this$nickName = this.getNickName();
        final Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        final Object this$openId = this.getOpenId();
        final Object other$openId = other.getOpenId();
        if (this$openId == null ? other$openId != null : !this$openId.equals(other$openId)) return false;
        final Object this$isNew = this.getIsNew();
        final Object other$isNew = other.getIsNew();
        if (this$isNew == null ? other$isNew != null : !this$isNew.equals(other$isNew)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserLoginVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $photoUrl = this.getPhotoUrl();
        result = result * PRIME + ($photoUrl == null ? 43 : $photoUrl.hashCode());
        final Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        final Object $openId = this.getOpenId();
        result = result * PRIME + ($openId == null ? 43 : $openId.hashCode());
        final Object $isNew = this.getIsNew();
        result = result * PRIME + ($isNew == null ? 43 : $isNew.hashCode());
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        return result;
    }

    public String toString() {
        return "UserLoginVo(userId=" + this.getUserId() + ", photoUrl=" + this.getPhotoUrl() + ", nickName=" + this.getNickName() + ", openId=" + this.getOpenId() + ", isNew=" + this.getIsNew() + ", leaderId=" + this.getLeaderId() + ", wareId=" + this.getWareId() + ")";
    }
}