package com.bestchoice.vo.product;

import io.swagger.annotations.ApiModelProperty;

public class AttrGroupQueryVo {

    @ApiModelProperty(value = "组名")
    private String name;

    public AttrGroupQueryVo() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AttrGroupQueryVo)) return false;
        final AttrGroupQueryVo other = (AttrGroupQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AttrGroupQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "AttrGroupQueryVo(name=" + this.getName() + ")";
    }
}

