
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ToEatRestaurant {

    @SerializedName("restaurantID")
    @Expose
    private String restaurantID;
    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("restaurantName")
    @Expose
    private String restaurantName;
    @SerializedName("restaurantDesc")
    @Expose
    private String restaurantDesc;
    @SerializedName("restaurantCostPP")
    @Expose
    private String restaurantCostPP;
    @SerializedName("restaurantCuisine")
    @Expose
    private String restaurantCuisine;
    @SerializedName("restaurantTime")
    @Expose
    private String restaurantTime;
    @SerializedName("restaurantAddress")
    @Expose
    private String restaurantAddress;
    @SerializedName("restaurantContact")
    @Expose
    private String restaurantContact;
    @SerializedName("restaurantWebsite")
    @Expose
    private String restaurantWebsite;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("pureVeg")
    @Expose
    private String pureVeg;
    @SerializedName("mustTry")
    @Expose
    private String mustTry;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("restaurantImageUrl")
    @Expose
    private String restaurantImageUrl;

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantDesc() {
        return restaurantDesc;
    }

    public void setRestaurantDesc(String restaurantDesc) {
        this.restaurantDesc = restaurantDesc;
    }

    public String getRestaurantCostPP() {
        return restaurantCostPP;
    }

    public void setRestaurantCostPP(String restaurantCostPP) {
        this.restaurantCostPP = restaurantCostPP;
    }

    public String getRestaurantCuisine() {
        return restaurantCuisine;
    }

    public void setRestaurantCuisine(String restaurantCuisine) {
        this.restaurantCuisine = restaurantCuisine;
    }

    public String getRestaurantTime() {
        return restaurantTime;
    }

    public void setRestaurantTime(String restaurantTime) {
        this.restaurantTime = restaurantTime;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantContact() {
        return restaurantContact;
    }

    public void setRestaurantContact(String restaurantContact) {
        this.restaurantContact = restaurantContact;
    }

    public String getRestaurantWebsite() {
        return restaurantWebsite;
    }

    public void setRestaurantWebsite(String restaurantWebsite) {
        this.restaurantWebsite = restaurantWebsite;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getPureVeg() {
        return pureVeg;
    }

    public void setPureVeg(String pureVeg) {
        this.pureVeg = pureVeg;
    }

    public String getMustTry() {
        return mustTry;
    }

    public void setMustTry(String mustTry) {
        this.mustTry = mustTry;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getRestaurantImageUrl() {
        return restaurantImageUrl;
    }

    public void setRestaurantImageUrl(String restaurantImageUrl) {
        this.restaurantImageUrl = restaurantImageUrl;
    }

}
