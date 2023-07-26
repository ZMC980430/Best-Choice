package com.bestchoice.vo.acl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "管理员登录信息")
public class AdminLoginVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "管理员id")
    private Long adminId;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "仓库id")
    private Long wareId;

    public AdminLoginVo() {
    }

    public Long getAdminId() {
        return this.adminId;
    }

    public String getName() {
        return this.name;
    }

    public Long getWareId() {
        return this.wareId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AdminLoginVo)) return false;
        final AdminLoginVo other = (AdminLoginVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$adminId = this.getAdminId();
        final Object other$adminId = other.getAdminId();
        if (this$adminId == null ? other$adminId != null : !this$adminId.equals(other$adminId)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$wareId = this.getWareId();
        final Object other$wareId = other.getWareId();
        if (this$wareId == null ? other$wareId != null : !this$wareId.equals(other$wareId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AdminLoginVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $adminId = this.getAdminId();
        result = result * PRIME + ($adminId == null ? 43 : $adminId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $wareId = this.getWareId();
        result = result * PRIME + ($wareId == null ? 43 : $wareId.hashCode());
        return result;
    }

    public String toString() {
        return "AdminLoginVo(adminId=" + this.getAdminId() + ", name=" + this.getName() + ", wareId=" + this.getWareId() + ")";
    }
}