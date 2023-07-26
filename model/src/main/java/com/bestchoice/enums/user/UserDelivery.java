package com.bestchoice.enums.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bestchoice.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "UserDelivery")
@TableName("user_delivery")
public class UserDelivery extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "会员ID")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty(value = "团长id")
    @TableField("leader_id")
    private Long leaderId;

    @ApiModelProperty(value = "仓库id")
    @TableField("ware_id")
    private Long wareId;

    @ApiModelProperty(value = "是否默认")
    @TableField("is_default")
    private Integer isDefault;

    public UserDelivery() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public Long getWareId() {
        return this.wareId;
    }

    public Integer getIsDefault() {
        return this.isDefault;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserDelivery)) return false;
        final UserDelivery other = (UserDelivery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        final Object this$isDefault = this.getIsDefault();
        final Object other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !this$isDefault.equals(other$isDefault)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserDelivery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        final Object $isDefault = this.getIsDefault();
        result = result * PRIME + ($isDefault == null ? 43 : $isDefault.hashCode());
        return result;
    }

    public String toString() {
        return "UserDelivery(userId=" + this.getUserId() + ", leaderId=" + this.getLeaderId() + ", wareId=" + this.getWareId() + ", isDefault=" + this.getIsDefault() + ")";
    }
}