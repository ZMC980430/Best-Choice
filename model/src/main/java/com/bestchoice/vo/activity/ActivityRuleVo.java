package com.bestchoice.vo.activity;

import com.bestchoice.model.activity.ActivityRule;
import com.bestchoice.model.activity.ActivitySku;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(description = "活动规则")
public class ActivityRuleVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "活动id")
    private Long activityId;

    @ApiModelProperty(value = "活动规则list")
    private List<ActivityRule> activityRuleList;

    @ApiModelProperty(value = "活动参与商品list")
    private List<ActivitySku> activitySkuList;

    @ApiModelProperty(value = "优惠券id列表")
    private List<Long> couponIdList;

    public ActivityRuleVo() {
    }

    public Long getActivityId() {
        return this.activityId;
    }

    public List<ActivityRule> getActivityRuleList() {
        return this.activityRuleList;
    }

    public List<ActivitySku> getActivitySkuList() {
        return this.activitySkuList;
    }

    public List<Long> getCouponIdList() {
        return this.couponIdList;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public void setActivityRuleList(List<ActivityRule> activityRuleList) {
        this.activityRuleList = activityRuleList;
    }

    public void setActivitySkuList(List<ActivitySku> activitySkuList) {
        this.activitySkuList = activitySkuList;
    }

    public void setCouponIdList(List<Long> couponIdList) {
        this.couponIdList = couponIdList;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ActivityRuleVo)) return false;
        final ActivityRuleVo other = (ActivityRuleVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$activityId = this.getActivityId();
        final Object other$activityId = other.getActivityId();
        if (this$activityId == null ? other$activityId != null : !this$activityId.equals(other$activityId))
            return false;
        final Object this$activityRuleList = this.getActivityRuleList();
        final Object other$activityRuleList = other.getActivityRuleList();
        if (this$activityRuleList == null ? other$activityRuleList != null : !this$activityRuleList.equals(other$activityRuleList))
            return false;
        final Object this$activitySkuList = this.getActivitySkuList();
        final Object other$activitySkuList = other.getActivitySkuList();
        if (this$activitySkuList == null ? other$activitySkuList != null : !this$activitySkuList.equals(other$activitySkuList))
            return false;
        final Object this$couponIdList = this.getCouponIdList();
        final Object other$couponIdList = other.getCouponIdList();
        if (this$couponIdList == null ? other$couponIdList != null : !this$couponIdList.equals(other$couponIdList))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ActivityRuleVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $activityId = this.getActivityId();
        result = result * PRIME + ($activityId == null ? 43 : $activityId.hashCode());
        final Object $activityRuleList = this.getActivityRuleList();
        result = result * PRIME + ($activityRuleList == null ? 43 : $activityRuleList.hashCode());
        final Object $activitySkuList = this.getActivitySkuList();
        result = result * PRIME + ($activitySkuList == null ? 43 : $activitySkuList.hashCode());
        final Object $couponIdList = this.getCouponIdList();
        result = result * PRIME + ($couponIdList == null ? 43 : $couponIdList.hashCode());
        return result;
    }

    public String toString() {
        return "ActivityRuleVo(activityId=" + this.getActivityId() + ", activityRuleList=" + this.getActivityRuleList() + ", activitySkuList=" + this.getActivitySkuList() + ", couponIdList=" + this.getCouponIdList() + ")";
    }
}