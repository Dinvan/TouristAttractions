
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ToStay {

    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("toStayText")
    @Expose
    private String toStayText;

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getToStayText() {
        return toStayText;
    }

    public void setToStayText(String toStayText) {
        this.toStayText = toStayText;
    }

}
