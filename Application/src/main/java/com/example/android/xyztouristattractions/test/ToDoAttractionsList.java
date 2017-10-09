
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ToDoAttractionsList {

    @SerializedName("attractionId")
    @Expose
    private Integer attractionId;
    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("attractionName")
    @Expose
    private String attractionName;
    @SerializedName("attractionImageURL")
    @Expose
    private String attractionImageURL;
    @SerializedName("attractionsShortText")
    @Expose
    private String attractionsShortText;
    @SerializedName("attractionText")
    @Expose
    private String attractionText;
    @SerializedName("attractionOpenTime")
    @Expose
    private String attractionOpenTime;
    @SerializedName("attractionCost")
    @Expose
    private String attractionCost;
    @SerializedName("attractionIdealTime")
    @Expose
    private String attractionIdealTime;
    @SerializedName("attractionTodoPageDesc")
    @Expose
    private String attractionTodoPageDesc;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("iconCategory")
    @Expose
    private String iconCategory;
    @SerializedName("mustVisit")
    @Expose
    private Boolean mustVisit;
    @SerializedName("upvotes")
    @Expose
    private Integer upvotes;
    @SerializedName("downvotes")
    @Expose
    private Integer downvotes;
    @SerializedName("attractionMetaTitle")
    @Expose
    private String attractionMetaTitle;
    @SerializedName("attractionCanonical")
    @Expose
    private String attractionCanonical;
    @SerializedName("roadDistanceMultiplier")
    @Expose
    private Double roadDistanceMultiplier;
    @SerializedName("visi")
    @Expose
    private Boolean visi;
    @SerializedName("attractionTag")
    @Expose
    private String attractionTag;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("foreignAttr")
    @Expose
    private Boolean foreignAttr;

    public Integer getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(Integer attractionId) {
        this.attractionId = attractionId;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getAttractionImageURL() {
        return attractionImageURL;
    }

    public void setAttractionImageURL(String attractionImageURL) {
        this.attractionImageURL = attractionImageURL;
    }

    public String getAttractionsShortText() {
        return attractionsShortText;
    }

    public void setAttractionsShortText(String attractionsShortText) {
        this.attractionsShortText = attractionsShortText;
    }

    public String getAttractionText() {
        return attractionText;
    }

    public void setAttractionText(String attractionText) {
        this.attractionText = attractionText;
    }

    public String getAttractionOpenTime() {
        return attractionOpenTime;
    }

    public void setAttractionOpenTime(String attractionOpenTime) {
        this.attractionOpenTime = attractionOpenTime;
    }

    public String getAttractionCost() {
        return attractionCost;
    }

    public void setAttractionCost(String attractionCost) {
        this.attractionCost = attractionCost;
    }

    public String getAttractionIdealTime() {
        return attractionIdealTime;
    }

    public void setAttractionIdealTime(String attractionIdealTime) {
        this.attractionIdealTime = attractionIdealTime;
    }

    public String getAttractionTodoPageDesc() {
        return attractionTodoPageDesc;
    }

    public void setAttractionTodoPageDesc(String attractionTodoPageDesc) {
        this.attractionTodoPageDesc = attractionTodoPageDesc;
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

    public String getIconCategory() {
        return iconCategory;
    }

    public void setIconCategory(String iconCategory) {
        this.iconCategory = iconCategory;
    }

    public Boolean getMustVisit() {
        return mustVisit;
    }

    public void setMustVisit(Boolean mustVisit) {
        this.mustVisit = mustVisit;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public Integer getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
    }

    public String getAttractionMetaTitle() {
        return attractionMetaTitle;
    }

    public void setAttractionMetaTitle(String attractionMetaTitle) {
        this.attractionMetaTitle = attractionMetaTitle;
    }

    public String getAttractionCanonical() {
        return attractionCanonical;
    }

    public void setAttractionCanonical(String attractionCanonical) {
        this.attractionCanonical = attractionCanonical;
    }

    public Double getRoadDistanceMultiplier() {
        return roadDistanceMultiplier;
    }

    public void setRoadDistanceMultiplier(Double roadDistanceMultiplier) {
        this.roadDistanceMultiplier = roadDistanceMultiplier;
    }

    public Boolean getVisi() {
        return visi;
    }

    public void setVisi(Boolean visi) {
        this.visi = visi;
    }

    public String getAttractionTag() {
        return attractionTag;
    }

    public void setAttractionTag(String attractionTag) {
        this.attractionTag = attractionTag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getForeignAttr() {
        return foreignAttr;
    }

    public void setForeignAttr(Boolean foreignAttr) {
        this.foreignAttr = foreignAttr;
    }

}
