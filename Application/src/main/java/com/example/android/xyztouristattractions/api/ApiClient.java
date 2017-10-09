package com.example.android.xyztouristattractions.api;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by advanz101 on 17/5/17.
 */

public class ApiClient {


    public static final String BASE_URL="test";
    private static Retrofit retrofit = null;


    public static Retrofit getDataAPIClient(String baseURL) {
        Retrofit retrofit=null;
        Gson gson = new GsonBuilder().create();
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
