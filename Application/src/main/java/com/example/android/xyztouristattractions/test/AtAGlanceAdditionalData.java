
package com.example.android.xyztouristattractions.test;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AtAGlanceAdditionalData {

    @SerializedName("currentEvents")
    @Expose
    private List<Object> currentEvents = null;
    @SerializedName("featuredPosts")
    @Expose
    private List<FeaturedPost> featuredPosts = null;

    @SerializedName("totalQuestionCount")
    @Expose
    private Integer totalQuestionCount;
    @SerializedName("totalReviewCount")
    @Expose
    private Integer totalReviewCount;

    public List<Object> getCurrentEvents() {
        return currentEvents;
    }

    public void setCurrentEvents(List<Object> currentEvents) {
        this.currentEvents = currentEvents;
    }

    public List<FeaturedPost> getFeaturedPosts() {
        return featuredPosts;
    }

    public void setFeaturedPosts(List<FeaturedPost> featuredPosts) {
        this.featuredPosts = featuredPosts;
    }


    public Integer getTotalQuestionCount() {
        return totalQuestionCount;
    }

    public void setTotalQuestionCount(Integer totalQuestionCount) {
        this.totalQuestionCount = totalQuestionCount;
    }

    public Integer getTotalReviewCount() {
        return totalReviewCount;
    }

    public void setTotalReviewCount(Integer totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }

}
