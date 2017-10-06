/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.xyztouristattractions.provider;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;

import com.example.android.xyztouristattractions.common.Attraction;
import com.example.android.xyztouristattractions.config.AssetsHelper;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.maps.android.SphericalUtil;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Static data content provider.
 */
public class TouristAttractions {

    public static final String CITY_SYDNEY = "Indore";

    public static final String TEST_CITY = CITY_SYDNEY;

    private static final float TRIGGER_RADIUS = 2000; // 2KM
    private static final int TRIGGER_TRANSITION = Geofence.GEOFENCE_TRANSITION_ENTER |
            Geofence.GEOFENCE_TRANSITION_EXIT;
    private static final long EXPIRATION_DURATION = Geofence.NEVER_EXPIRE;

    public static final Map<String, LatLng> CITY_LOCATIONS = new HashMap<String, LatLng>() {{
        put(CITY_SYDNEY, new LatLng(22.7196, 75.8577));
    }};

    /**
     * All photos used with permission under the Creative Commons Attribution-ShareAlike License.
     */
    public static final  List<Attraction> getAttractions(Context context){

        Type t = new TypeToken<List<Attraction>>() {
        }.getType();
        Gson gson = new Gson();
         String jsonDataArray= AssetsHelper.readFromfile("attraction.json",context);
        List<Attraction> list = gson.fromJson(jsonDataArray, t);
        return list;
    }
    public static  List<Attraction> loadAttractionsFromLocation(final LatLng curLatLng,Context context) {
        String closestCity = TouristAttractions.getClosestCity(curLatLng,context);
        if (closestCity != null) {
            List<Attraction> attractions =  TouristAttractions.getAttractions(context);
            if (curLatLng != null) {
                Collections.sort(attractions,
                        new Comparator<Attraction>() {
                            @Override
                            public int compare(Attraction lhs, Attraction rhs) {
                                double lhsDistance = SphericalUtil.computeDistanceBetween(
                                        lhs.getCityListData().getLocation(), curLatLng);
                                double rhsDistance = SphericalUtil.computeDistanceBetween(
                                        rhs.getCityListData().getLocation(), curLatLng);
                                return (int) (lhsDistance - rhsDistance);
                            }
                        }
                );
            }
            return attractions;
        }
        return null;
    }

    /**
     * Creates a list of geofences based on the city locations
     */
    public static List<Geofence> getGeofenceList() {
        List<Geofence> geofenceList = new ArrayList<Geofence>();
        for (String city : CITY_LOCATIONS.keySet()) {
            LatLng cityLatLng = CITY_LOCATIONS.get(city);
            geofenceList.add(new Geofence.Builder()
                    .setCircularRegion(cityLatLng.latitude, cityLatLng.longitude, TRIGGER_RADIUS)
                    .setRequestId(city)
                    .setTransitionTypes(TRIGGER_TRANSITION)
                    .setExpirationDuration(EXPIRATION_DURATION)
                    .build());
        }
        return geofenceList;
    }

    public static String getClosestCity(LatLng curLatLng,Context context) {
        if (curLatLng == null) {
            // If location is unknown return test city so some data is shown
            return TEST_CITY;
        }

        double minDistance = 0;
        String closestCity = null;
        for (Attraction attraction :getAttractions(context)) {
            double distance = SphericalUtil.computeDistanceBetween(curLatLng, attraction.getCityListData().getLocation());
            if (minDistance == 0 || distance < minDistance) {
                minDistance = distance;
                closestCity = attraction.getPlaceCode();
            }
        }
        return closestCity;
    }
}
