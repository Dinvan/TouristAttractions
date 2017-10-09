
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AtAGlanceImagesList {

    @SerializedName("imageId")
    @Expose
    private Integer imageId;
    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("imageURL")
    @Expose
    private String imageURL;
    @SerializedName("imageSRCUrl")
    @Expose
    private String imageSRCUrl;
    @SerializedName("imageTitle")
    @Expose
    private String imageTitle;
    @SerializedName("imageAuthorName")
    @Expose
    private String imageAuthorName;
    @SerializedName("imageAuthorURL")
    @Expose
    private String imageAuthorURL;
    @SerializedName("imageURLSmall")
    @Expose
    private String imageURLSmall;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageSRCUrl() {
        return imageSRCUrl;
    }

    public void setImageSRCUrl(String imageSRCUrl) {
        this.imageSRCUrl = imageSRCUrl;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public String getImageAuthorName() {
        return imageAuthorName;
    }

    public void setImageAuthorName(String imageAuthorName) {
        this.imageAuthorName = imageAuthorName;
    }

    public String getImageAuthorURL() {
        return imageAuthorURL;
    }

    public void setImageAuthorURL(String imageAuthorURL) {
        this.imageAuthorURL = imageAuthorURL;
    }

    public String getImageURLSmall() {
        return imageURLSmall;
    }

    public void setImageURLSmall(String imageURLSmall) {
        this.imageURLSmall = imageURLSmall;
    }

}
