package com.bestchoice.vo.order;

import com.bestchoice.model.activity.ActivityRule;
import com.bestchoice.model.order.CartInfo;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * OrderDetailActivity
 * </p>
 *
 * @author qy
 */
public class CartInfoVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 购物项凑单，同一活动对应的最优活动规则
     */
    @ApiModelProperty(value = "cartInfoList")
    private List<CartInfo> cartInfoList;

    @ApiModelProperty(value = "活动规则")
    private ActivityRule activityRule;

    public CartInfoVo() {
    }


    public List<CartInfo> getCartInfoList() {
        return this.cartInfoList;
    }

    public ActivityRule getActivityRule() {
        return this.activityRule;
    }

    public void setCartInfoList(List<CartInfo> cartInfoList) {
        this.cartInfoList = cartInfoList;
    }

    public void setActivityRule(ActivityRule activityRule) {
        this.activityRule = activityRule;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartInfoVo)) return false;
        final CartInfoVo other = (CartInfoVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cartInfoList = this.getCartInfoList();
        final Object other$cartInfoList = other.getCartInfoList();
        if (this$cartInfoList == null ? other$cartInfoList != null : !this$cartInfoList.equals(other$cartInfoList))
            return false;
        final Object this$activityRule = this.getActivityRule();
        final Object other$activityRule = other.getActivityRule();
        if (this$activityRule == null ? other$activityRule != null : !this$activityRule.equals(other$activityRule))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartInfoVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cartInfoList = this.getCartInfoList();
        result = result * PRIME + ($cartInfoList == null ? 43 : $cartInfoList.hashCode());
        final Object $activityRule = this.getActivityRule();
        result = result * PRIME + ($activityRule == null ? 43 : $activityRule.hashCode());
        return result;
    }

    public String toString() {
        return "CartInfoVo(cartInfoList=" + this.getCartInfoList() + ", activityRule=" + this.getActivityRule() + ")";
    }
}

