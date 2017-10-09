
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ToReach {

    @SerializedName("toReachId")
    @Expose
    private ToReachId toReachId;
    @SerializedName("toReachCategoryDesc")
    @Expose
    private String toReachCategoryDesc;
    @SerializedName("nearestStop")
    @Expose
    private String nearestStop;
    @SerializedName("distance")
    @Expose
    private Double distance;

    public ToReachId getToReachId() {
        return toReachId;
    }

    public void setToReachId(ToReachId toReachId) {
        this.toReachId = toReachId;
    }

    public String getToReachCategoryDesc() {
        return toReachCategoryDesc;
    }

    public void setToReachCategoryDesc(String toReachCategoryDesc) {
        this.toReachCategoryDesc = toReachCategoryDesc;
    }

    public String getNearestStop() {
        return nearestStop;
    }

    public void setNearestStop(String nearestStop) {
        this.nearestStop = nearestStop;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

}
