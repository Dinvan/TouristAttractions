
package com.example.android.xyztouristattractions.common;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attraction {

    @SerializedName("cityListData")
    @Expose
    private CityListData cityListData;
    @SerializedName("placeCode")
    @Expose
    private String placeCode;
    @SerializedName("toDoAttractionsList")
    @Expose
    private List<ToDoAttractionsList> toDoAttractionsList = null;

    public CityListData getCityListData() {
        return cityListData;
    }

    public void setCityListData(CityListData cityListData) {
        this.cityListData = cityListData;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public List<ToDoAttractionsList> getToDoAttractionsList() {
        return toDoAttractionsList;
    }

    public void setToDoAttractionsList(List<ToDoAttractionsList> toDoAttractionsList) {
        this.toDoAttractionsList = toDoAttractionsList;
    }

}
