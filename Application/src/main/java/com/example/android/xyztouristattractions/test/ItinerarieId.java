
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItinerarieId {

    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("itineraryType")
    @Expose
    private String itineraryType;

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getItineraryType() {
        return itineraryType;
    }

    public void setItineraryType(String itineraryType) {
        this.itineraryType = itineraryType;
    }

}
