
package com.example.android.xyztouristattractions.test;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ToEatDesc {

    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("toEatImageURL")
    @Expose
    private String toEatImageURL;
    @SerializedName("toEatDesc")
    @Expose
    private String toEatDesc;
    @SerializedName("toEatStateDesc")
    @Expose
    private String toEatStateDesc;

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getToEatImageURL() {
        return toEatImageURL;
    }

    public void setToEatImageURL(String toEatImageURL) {
        this.toEatImageURL = toEatImageURL;
    }

    public String getToEatDesc() {
        return toEatDesc;
    }

    public void setToEatDesc(String toEatDesc) {
        this.toEatDesc = toEatDesc;
    }

    public String getToEatStateDesc() {
        return toEatStateDesc;
    }

    public void setToEatStateDesc(String toEatStateDesc) {
        this.toEatStateDesc = toEatStateDesc;
    }

}
