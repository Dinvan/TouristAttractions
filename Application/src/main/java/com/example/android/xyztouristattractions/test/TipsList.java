
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TipsList {

    @SerializedName("tipsId")
    @Expose
    private TipsId tipsId;
    @SerializedName("tipText")
    @Expose
    private String tipText;

    public TipsId getTipsId() {
        return tipsId;
    }

    public void setTipsId(TipsId tipsId) {
        this.tipsId = tipsId;
    }

    public String getTipText() {
        return tipText;
    }

    public void setTipText(String tipText) {
        this.tipText = tipText;
    }

}
