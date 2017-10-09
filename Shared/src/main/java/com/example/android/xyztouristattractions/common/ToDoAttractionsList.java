
package com.example.android.xyztouristattractions.common;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ToDoAttractionsList {

    @SerializedName("attractionCost")
    @Expose
    private String attractionCost;
    @SerializedName("attractionId")
    @Expose
    private Integer attractionId;
    @SerializedName("attractionIdealTime")
    @Expose
    private String attractionIdealTime;
    @SerializedName("attractionImageURL")
    @Expose
    private String attractionImageURL;
    @SerializedName("attractionName")
    @Expose
    private String attractionName;
    @SerializedName("attractionOpenTime")
    @Expose
    private String attractionOpenTime;
    @SerializedName("attractionsShortText")
    @Expose
    private String attractionsShortText;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("placeCode")
    @Expose
    private String placeCode;

    public String getAttractionCost() {
        return attractionCost;
    }

    public void setAttractionCost(String attractionCost) {
        this.attractionCost = attractionCost;
    }

    public Integer getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(Integer attractionId) {
        this.attractionId = attractionId;
    }

    public String getAttractionIdealTime() {
        return attractionIdealTime;
    }

    public void setAttractionIdealTime(String attractionIdealTime) {
        this.attractionIdealTime = attractionIdealTime;
    }

    public String getAttractionImageURL() {
        return attractionImageURL;
    }

    public void setAttractionImageURL(String attractionImageURL) {
        this.attractionImageURL = attractionImageURL;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getAttractionOpenTime() {
        return attractionOpenTime;
    }

    public void setAttractionOpenTime(String attractionOpenTime) {
        this.attractionOpenTime = attractionOpenTime;
    }

    public String getAttractionsShortText() {
        return attractionsShortText;
    }

    public void setAttractionsShortText(String attractionsShortText) {
        this.attractionsShortText = attractionsShortText;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public LatLng getLocation(){
        LatLng latLng=new LatLng(latitude,longitude);
        return latLng;
    }

}
