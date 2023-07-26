package com.bestchoice.vo.search;

// 封装查询条件
public class LeaderEsQueryVo {

    double latitude = 39.9504550;
    double longitude = 116.3512330;
    double distance = 100;

    public LeaderEsQueryVo() {
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getDistance() {
        return this.distance;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LeaderEsQueryVo)) return false;
        final LeaderEsQueryVo other = (LeaderEsQueryVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getLatitude(), other.getLatitude()) != 0) return false;
        if (Double.compare(this.getLongitude(), other.getLongitude()) != 0) return false;
        if (Double.compare(this.getDistance(), other.getDistance()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LeaderEsQueryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $latitude = Double.doubleToLongBits(this.getLatitude());
        result = result * PRIME + (int) ($latitude >>> 32 ^ $latitude);
        final long $longitude = Double.doubleToLongBits(this.getLongitude());
        result = result * PRIME + (int) ($longitude >>> 32 ^ $longitude);
        final long $distance = Double.doubleToLongBits(this.getDistance());
        result = result * PRIME + (int) ($distance >>> 32 ^ $distance);
        return result;
    }

    public String toString() {
        return "LeaderEsQueryVo(latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", distance=" + this.getDistance() + ")";
    }
}
