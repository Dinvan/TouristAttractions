
package com.example.android.xyztouristattractions.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MonthlyWeather {

    @SerializedName("rowId")
    @Expose
    private Integer rowId;
    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("monthNum")
    @Expose
    private Integer monthNum;
    @SerializedName("monthName")
    @Expose
    private String monthName;
    @SerializedName("daysAvailable")
    @Expose
    private Integer daysAvailable;
    @SerializedName("avgApparentMax")
    @Expose
    private Double avgApparentMax;
    @SerializedName("avgApparentMin")
    @Expose
    private Double avgApparentMin;
    @SerializedName("avgMax")
    @Expose
    private Double avgMax;
    @SerializedName("avgMin")
    @Expose
    private Double avgMin;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public Integer getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(Integer monthNum) {
        this.monthNum = monthNum;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public Integer getDaysAvailable() {
        return daysAvailable;
    }

    public void setDaysAvailable(Integer daysAvailable) {
        this.daysAvailable = daysAvailable;
    }

    public Double getAvgApparentMax() {
        return avgApparentMax;
    }

    public void setAvgApparentMax(Double avgApparentMax) {
        this.avgApparentMax = avgApparentMax;
    }

    public Double getAvgApparentMin() {
        return avgApparentMin;
    }

    public void setAvgApparentMin(Double avgApparentMin) {
        this.avgApparentMin = avgApparentMin;
    }

    public Double getAvgMax() {
        return avgMax;
    }

    public void setAvgMax(Double avgMax) {
        this.avgMax = avgMax;
    }

    public Double getAvgMin() {
        return avgMin;
    }

    public void setAvgMin(Double avgMin) {
        this.avgMin = avgMin;
    }

}
