
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeaturedPost {

    @SerializedName("featuredId")
    @Expose
    private Integer featuredId;
    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("postUrl")
    @Expose
    private String postUrl;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("postId")
    @Expose
    private String postId;
    @SerializedName("postTitle")
    @Expose
    private String postTitle;
    @SerializedName("postType")
    @Expose
    private String postType;

    public Integer getFeaturedId() {
        return featuredId;
    }

    public void setFeaturedId(Integer featuredId) {
        this.featuredId = featuredId;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

}
