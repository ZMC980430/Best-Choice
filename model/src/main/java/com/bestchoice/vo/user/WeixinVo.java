package com.bestchoice.vo.user;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel(description = "weixinVo")
public class WeixinVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String iv;
    private String encryptedData;
    private String sessionKey;
    private String openId;

    public WeixinVo() {
    }

    public String getIv() {
        return this.iv;
    }

    public String getEncryptedData() {
        return this.encryptedData;
    }

    public String getSessionKey() {
        return this.sessionKey;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WeixinVo)) return false;
        final WeixinVo other = (WeixinVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$iv = this.getIv();
        final Object other$iv = other.getIv();
        if (this$iv == null ? other$iv != null : !this$iv.equals(other$iv)) return false;
        final Object this$encryptedData = this.getEncryptedData();
        final Object other$encryptedData = other.getEncryptedData();
        if (this$encryptedData == null ? other$encryptedData != null : !this$encryptedData.equals(other$encryptedData))
            return false;
        final Object this$sessionKey = this.getSessionKey();
        final Object other$sessionKey = other.getSessionKey();
        if (this$sessionKey == null ? other$sessionKey != null : !this$sessionKey.equals(other$sessionKey))
            return false;
        final Object this$openId = this.getOpenId();
        final Object other$openId = other.getOpenId();
        if (this$openId == null ? other$openId != null : !this$openId.equals(other$openId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WeixinVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $iv = this.getIv();
        result = result * PRIME + ($iv == null ? 43 : $iv.hashCode());
        final Object $encryptedData = this.getEncryptedData();
        result = result * PRIME + ($encryptedData == null ? 43 : $encryptedData.hashCode());
        final Object $sessionKey = this.getSessionKey();
        result = result * PRIME + ($sessionKey == null ? 43 : $sessionKey.hashCode());
        final Object $openId = this.getOpenId();
        result = result * PRIME + ($openId == null ? 43 : $openId.hashCode());
        return result;
    }

    public String toString() {
        return "WeixinVo(iv=" + this.getIv() + ", encryptedData=" + this.getEncryptedData() + ", sessionKey=" + this.getSessionKey() + ", openId=" + this.getOpenId() + ")";
    }
}