package com.example.android.xyztouristattractions.api;

import com.example.android.xyztouristattractions.test.TestModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by advanz101 on 17/5/17.
 */
public interface ApiInterface {
    

    @GET("ryyt")
    Call<TestModel> getCityData(@Query("placeCode") String placeCode);

    /*------------------------------------Old API----------------------------------------------*/
}