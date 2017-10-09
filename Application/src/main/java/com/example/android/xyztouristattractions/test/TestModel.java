
package com.example.android.xyztouristattractions.test;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TestModel {

    @SerializedName("cityListData")
    @Expose
    private CityListData cityListData;
    @SerializedName("atAGlanceText")
    @Expose
    private AtAGlanceText atAGlanceText;
    @SerializedName("atAGlanceImagesList")
    @Expose
    private List<AtAGlanceImagesList> atAGlanceImagesList = null;
    @SerializedName("stateRank")
    @Expose
    private Integer stateRank;
    @SerializedName("stateTotal")
    @Expose
    private Integer stateTotal;
    @SerializedName("countryRank")
    @Expose
    private Integer countryRank;
    @SerializedName("countryTotal")
    @Expose
    private Integer countryTotal;
    @SerializedName("specialEventText")
    @Expose
    private String specialEventText;
    @SerializedName("idealDaysCount")
    @Expose
    private Integer idealDaysCount;
    @SerializedName("packageAvailable")
    @Expose
    private Boolean packageAvailable;
    @SerializedName("nearbyPlaces")
    @Expose
    private List<String> nearbyPlaces = null;
    @SerializedName("similarPlaces")
    @Expose
    private List<String> similarPlaces = null;
    @SerializedName("toDoAttractionsList")
    @Expose
    private List<ToDoAttractionsList> toDoAttractionsList = null;
    @SerializedName("internalTransport")
    @Expose
    private InternalTransport internalTransport;
    @SerializedName("tipsList")
    @Expose
    private List<TipsList> tipsList = null;
    @SerializedName("itineraryList")
    @Expose
    private List<ItineraryList> itineraryList = null;
    @SerializedName("toEatDesc")
    @Expose
    private ToEatDesc toEatDesc;
    @SerializedName("toEatRestaurants")
    @Expose
    private List<ToEatRestaurant> toEatRestaurants = null;
    @SerializedName("toEatImages")
    @Expose
    private List<ToEatImage> toEatImages = null;
    @SerializedName("toReach")
    @Expose
    private List<ToReach> toReach = null;
    @SerializedName("toStay")
    @Expose
    private ToStay toStay;
    @SerializedName("atAGlanceAdditionalData")
    @Expose
    private AtAGlanceAdditionalData atAGlanceAdditionalData;
    @SerializedName("monthlyWeather")
    @Expose
    private List<MonthlyWeather> monthlyWeather = null;

    public CityListData getCityListData() {
        return cityListData;
    }

    public void setCityListData(CityListData cityListData) {
        this.cityListData = cityListData;
    }

    public AtAGlanceText getAtAGlanceText() {
        return atAGlanceText;
    }

    public void setAtAGlanceText(AtAGlanceText atAGlanceText) {
        this.atAGlanceText = atAGlanceText;
    }

    public List<AtAGlanceImagesList> getAtAGlanceImagesList() {
        return atAGlanceImagesList;
    }

    public void setAtAGlanceImagesList(List<AtAGlanceImagesList> atAGlanceImagesList) {
        this.atAGlanceImagesList = atAGlanceImagesList;
    }

    public Integer getStateRank() {
        return stateRank;
    }

    public void setStateRank(Integer stateRank) {
        this.stateRank = stateRank;
    }

    public Integer getStateTotal() {
        return stateTotal;
    }

    public void setStateTotal(Integer stateTotal) {
        this.stateTotal = stateTotal;
    }

    public Integer getCountryRank() {
        return countryRank;
    }

    public void setCountryRank(Integer countryRank) {
        this.countryRank = countryRank;
    }

    public Integer getCountryTotal() {
        return countryTotal;
    }

    public void setCountryTotal(Integer countryTotal) {
        this.countryTotal = countryTotal;
    }

    public String getSpecialEventText() {
        return specialEventText;
    }

    public void setSpecialEventText(String specialEventText) {
        this.specialEventText = specialEventText;
    }

    public Integer getIdealDaysCount() {
        return idealDaysCount;
    }

    public void setIdealDaysCount(Integer idealDaysCount) {
        this.idealDaysCount = idealDaysCount;
    }

    public Boolean getPackageAvailable() {
        return packageAvailable;
    }

    public void setPackageAvailable(Boolean packageAvailable) {
        this.packageAvailable = packageAvailable;
    }

    public List<String> getNearbyPlaces() {
        return nearbyPlaces;
    }

    public void setNearbyPlaces(List<String> nearbyPlaces) {
        this.nearbyPlaces = nearbyPlaces;
    }

    public List<String> getSimilarPlaces() {
        return similarPlaces;
    }

    public void setSimilarPlaces(List<String> similarPlaces) {
        this.similarPlaces = similarPlaces;
    }

    public List<ToDoAttractionsList> getToDoAttractionsList() {
        return toDoAttractionsList;
    }

    public void setToDoAttractionsList(List<ToDoAttractionsList> toDoAttractionsList) {
        this.toDoAttractionsList = toDoAttractionsList;
    }

    public InternalTransport getInternalTransport() {
        return internalTransport;
    }

    public void setInternalTransport(InternalTransport internalTransport) {
        this.internalTransport = internalTransport;
    }

    public List<TipsList> getTipsList() {
        return tipsList;
    }

    public void setTipsList(List<TipsList> tipsList) {
        this.tipsList = tipsList;
    }

    public List<ItineraryList> getItineraryList() {
        return itineraryList;
    }

    public void setItineraryList(List<ItineraryList> itineraryList) {
        this.itineraryList = itineraryList;
    }

    public ToEatDesc getToEatDesc() {
        return toEatDesc;
    }

    public void setToEatDesc(ToEatDesc toEatDesc) {
        this.toEatDesc = toEatDesc;
    }

    public List<ToEatRestaurant> getToEatRestaurants() {
        return toEatRestaurants;
    }

    public void setToEatRestaurants(List<ToEatRestaurant> toEatRestaurants) {
        this.toEatRestaurants = toEatRestaurants;
    }

    public List<ToEatImage> getToEatImages() {
        return toEatImages;
    }

    public void setToEatImages(List<ToEatImage> toEatImages) {
        this.toEatImages = toEatImages;
    }

    public List<ToReach> getToReach() {
        return toReach;
    }

    public void setToReach(List<ToReach> toReach) {
        this.toReach = toReach;
    }

    public ToStay getToStay() {
        return toStay;
    }

    public void setToStay(ToStay toStay) {
        this.toStay = toStay;
    }

    public AtAGlanceAdditionalData getAtAGlanceAdditionalData() {
        return atAGlanceAdditionalData;
    }

    public void setAtAGlanceAdditionalData(AtAGlanceAdditionalData atAGlanceAdditionalData) {
        this.atAGlanceAdditionalData = atAGlanceAdditionalData;
    }

    public List<MonthlyWeather> getMonthlyWeather() {
        return monthlyWeather;
    }

    public void setMonthlyWeather(List<MonthlyWeather> monthlyWeather) {
        this.monthlyWeather = monthlyWeather;
    }

}
