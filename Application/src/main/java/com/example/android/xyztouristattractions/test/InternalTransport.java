
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InternalTransport {

    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("transportDesc")
    @Expose
    private String transportDesc;

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getTransportDesc() {
        return transportDesc;
    }

    public void setTransportDesc(String transportDesc) {
        this.transportDesc = transportDesc;
    }

}
