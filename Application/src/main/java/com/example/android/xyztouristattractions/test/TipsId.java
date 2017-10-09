
package com.example.android.xyztouristattractions.test;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TipsId {

    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("tipNum")
    @Expose
    private Integer tipNum;

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public Integer getTipNum() {
        return tipNum;
    }

    public void setTipNum(Integer tipNum) {
        this.tipNum = tipNum;
    }

}
