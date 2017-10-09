
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AtAGlanceText {

    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("firstPara")
    @Expose
    private String firstPara;
    @SerializedName("forWhom")
    @Expose
    private String forWhom;
    @SerializedName("readMoreText")
    @Expose
    private String readMoreText;
    @SerializedName("bestTimeText")
    @Expose
    private String bestTimeText;
    @SerializedName("bestTimeObjective")
    @Expose
    private String bestTimeObjective;

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirstPara() {
        return firstPara;
    }

    public void setFirstPara(String firstPara) {
        this.firstPara = firstPara;
    }

    public String getForWhom() {
        return forWhom;
    }

    public void setForWhom(String forWhom) {
        this.forWhom = forWhom;
    }

    public String getReadMoreText() {
        return readMoreText;
    }

    public void setReadMoreText(String readMoreText) {
        this.readMoreText = readMoreText;
    }

    public String getBestTimeText() {
        return bestTimeText;
    }

    public void setBestTimeText(String bestTimeText) {
        this.bestTimeText = bestTimeText;
    }

    public String getBestTimeObjective() {
        return bestTimeObjective;
    }

    public void setBestTimeObjective(String bestTimeObjective) {
        this.bestTimeObjective = bestTimeObjective;
    }

}
