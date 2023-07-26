package com.bestchoice.enums.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bestchoice.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "UserLoginLog")
@TableName("user_login_log")
public class UserLoginLog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty(value = "登录ip")
    @TableField("ip")
    private String ip;

    @ApiModelProperty(value = "登录城市")
    @TableField("city")
    private String city;

    @ApiModelProperty(value = "登录类型【0-web，1-移动】")
    @TableField("type")
    private Boolean type;

    public UserLoginLog() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getIp() {
        return this.ip;
    }

    public String getCity() {
        return this.city;
    }

    public Boolean getType() {
        return this.type;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserLoginLog)) return false;
        final UserLoginLog other = (UserLoginLog) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$ip = this.getIp();
        final Object other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserLoginLog;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $ip = this.getIp();
        result = result * PRIME + ($ip == null ? 43 : $ip.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "UserLoginLog(userId=" + this.getUserId() + ", ip=" + this.getIp() + ", city=" + this.getCity() + ", type=" + this.getType() + ")";
    }
}