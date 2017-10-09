
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItineraryList {

    @SerializedName("itinerarieId")
    @Expose
    private ItinerarieId itinerarieId;
    @SerializedName("itineraryText")
    @Expose
    private String itineraryText;

    public ItinerarieId getItinerarieId() {
        return itinerarieId;
    }

    public void setItinerarieId(ItinerarieId itinerarieId) {
        this.itinerarieId = itinerarieId;
    }

    public String getItineraryText() {
        return itineraryText;
    }

    public void setItineraryText(String itineraryText) {
        this.itineraryText = itineraryText;
    }

}
