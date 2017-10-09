
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ToReachId {

    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("toReachCategory")
    @Expose
    private String toReachCategory;

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getToReachCategory() {
        return toReachCategory;
    }

    public void setToReachCategory(String toReachCategory) {
        this.toReachCategory = toReachCategory;
    }

}
