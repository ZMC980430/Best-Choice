package com.bestchoice.vo.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(description = "OrderDeliver")
public class OrderDeliverVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "配送日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date deliverDate;

    @ApiModelProperty(value = "团长id")
    private Long leaderId;

    @ApiModelProperty(value = "司机id")
    private Long driverId;

    @ApiModelProperty(value = "司机名称")
    private String driverName;

    @ApiModelProperty(value = "司机电话")
    private String driverPhone;

    @ApiModelProperty(value = "状态（0：默认，1：已发货，2：团长收货）")
    private Integer status;

    public OrderDeliverVo() {
    }

    public Date getDeliverDate() {
        return this.deliverDate;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public Long getDriverId() {
        return this.driverId;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public String getDriverPhone() {
        return this.driverPhone;
    }

    public Integer getStatus() {
        return this.status;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderDeliverVo)) return false;
        final OrderDeliverVo other = (OrderDeliverVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$deliverDate = this.getDeliverDate();
        final Object other$deliverDate = other.getDeliverDate();
        if (this$deliverDate == null ? other$deliverDate != null : !this$deliverDate.equals(other$deliverDate))
            return false;
        final Object this$leaderId = this.getLeaderId();
        final Object other$leaderId = other.getLeaderId();
        if (this$leaderId == null ? other$leaderId != null : !this$leaderId.equals(other$leaderId)) return false;
        final Object this$driverId = this.getDriverId();
        final Object other$driverId = other.getDriverId();
        if (this$driverId == null ? other$driverId != null : !this$driverId.equals(other$driverId)) return false;
        final Object this$driverName = this.getDriverName();
        final Object other$driverName = other.getDriverName();
        if (this$driverName == null ? other$driverName != null : !this$driverName.equals(other$driverName))
            return false;
        final Object this$driverPhone = this.getDriverPhone();
        final Object other$driverPhone = other.getDriverPhone();
        if (this$driverPhone == null ? other$driverPhone != null : !this$driverPhone.equals(other$driverPhone))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderDeliverVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $deliverDate = this.getDeliverDate();
        result = result * PRIME + ($deliverDate == null ? 43 : $deliverDate.hashCode());
        final Object $leaderId = this.getLeaderId();
        result = result * PRIME + ($leaderId == null ? 43 : $leaderId.hashCode());
        final Object $driverId = this.getDriverId();
        result = result * PRIME + ($driverId == null ? 43 : $driverId.hashCode());
        final Object $driverName = this.getDriverName();
        result = result * PRIME + ($driverName == null ? 43 : $driverName.hashCode());
        final Object $driverPhone = this.getDriverPhone();
        result = result * PRIME + ($driverPhone == null ? 43 : $driverPhone.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "OrderDeliverVo(deliverDate=" + this.getDeliverDate() + ", leaderId=" + this.getLeaderId() + ", driverId=" + this.getDriverId() + ", driverName=" + this.getDriverName() + ", driverPhone=" + this.getDriverPhone() + ", status=" + this.getStatus() + ")";
    }
}