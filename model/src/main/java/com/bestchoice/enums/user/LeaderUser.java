package com.bestchoice.enums.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bestchoice.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "LeaderUser")
@TableName("leader_user")
public class LeaderUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "团长ID")
    @TableField("leader_id")
    private String leaderId;

    @ApiModelProperty(value = "userId")
    @TableField("user_id")
    private Long userId;

    public LeaderUser() {
    }

    public String getLeaderId() {
        return this.leaderId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LeaderUser)) return false;
        final LeaderUser other = (LeaderUser) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LeaderUser;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        return result;
    }

    public String toString() {
        return "LeaderUser(leaderId=" + this.getLeaderId() + ", userId=" + this.getUserId() + ")";
    }
}