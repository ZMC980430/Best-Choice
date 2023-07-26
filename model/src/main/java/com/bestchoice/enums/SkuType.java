package com.bestchoice.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum SkuType {
    COMMON(0, "普通"),
    SECKILL(1, "秒杀");

    @EnumValue
    private Integer code;
    private String comment;

    SkuType(Integer code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getComment() {
        return this.comment;
    }
}