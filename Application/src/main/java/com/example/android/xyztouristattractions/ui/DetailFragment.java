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

package com.example.android.xyztouristattractions.ui;

import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.android.xyztouristattractions.R;
import com.example.android.xyztouristattractions.adapter.CityAttractionAdapter;
import com.example.android.xyztouristattractions.api.ApiClient;
import com.example.android.xyztouristattractions.api.ApiInterface;
import com.example.android.xyztouristattractions.common.Attraction;
import com.example.android.xyztouristattractions.common.Constants;
import com.example.android.xyztouristattractions.common.Utils;
import com.example.android.xyztouristattractions.provider.TouristAttractions;
import com.example.android.xyztouristattractions.test.TestModel;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.gson.Gson;
import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.DirectionsRoute;
import com.google.maps.model.TravelMode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * The tourist attraction detail fragment which contains the details of a
 * a single attraction (contained inside
 * {@link com.example.android.xyztouristattractions.ui.DetailActivity}).
 */
public class DetailFragment extends Fragment implements OnMapReadyCallback {

    private static final String EXTRA_ATTRACTION = "attraction";
    private Attraction mAttraction;
    AttractionsRecyclerView attractionsRecyclerView;
    GoogleMap googleMap;

    public static DetailFragment createInstance(String attractionName) {
        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_ATTRACTION, attractionName);
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    public DetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        String attractionName = getArguments().getString(EXTRA_ATTRACTION);
        mAttraction = findAttraction(attractionName);

        if (mAttraction == null) {
            getActivity().finish();
            return null;
        }

        TextView nameTextView = (TextView) view.findViewById(R.id.nameTextView);
        TextView descTextView = (TextView) view.findViewById(R.id.descriptionTextView);
        TextView distanceTextView = (TextView) view.findViewById(R.id.distanceTextView);
        attractionsRecyclerView = (AttractionsRecyclerView) view.findViewById(R.id.list);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        FloatingActionButton mapFab = (FloatingActionButton) view.findViewById(R.id.mapFab);

        LatLng location = Utils.getLocation(getActivity());
        String distance = Utils.formatDistanceBetween(location, mAttraction.getCityListData().getLocation());
        if (TextUtils.isEmpty(distance)) {
            distanceTextView.setVisibility(View.GONE);
        }

        nameTextView.setText(attractionName);
        distanceTextView.setText(distance);
        descTextView.setText(mAttraction.getCityListData().getCityIntro());

        int imageSize = getResources().getDimensionPixelSize(R.dimen.image_size)
                * Constants.IMAGE_ANIM_MULTIPLIER;
        Glide.with(getActivity())
                .load(mAttraction.getCityListData().getCityImagePath())
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .placeholder(R.color.lighter_gray)
                .override(imageSize, imageSize)
                .into(imageView);

        mapFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(Constants.MAPS_INTENT_URI +
                        Uri.encode(mAttraction.getCityListData().getPlaceName() + ", " + mAttraction.getCityListData().getStateName())));
                startActivity(intent);
            }
        });

        CityAttractionAdapter cityAttractionAdapter = new CityAttractionAdapter(mAttraction.getToDoAttractionsList(), getActivity());
        attractionsRecyclerView.setAdapter(cityAttractionAdapter);
        setMap();

        getRoute();
        return view;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Some small additions to handle "up" navigation correctly
                Intent upIntent = NavUtils.getParentActivityIntent(getActivity());
                upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                // Check if up activity needs to be created (usually when
                // detail screen is opened from a notification or from the
                // Wearable app
                if (NavUtils.shouldUpRecreateTask(getActivity(), upIntent)
                        || getActivity().isTaskRoot()) {

                    // Synthesize parent stack
                    TaskStackBuilder.create(getActivity())
                            .addNextIntentWithParentStack(upIntent)
                            .startActivities();
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    // On Lollipop+ we finish so to run the nice animation
                    getActivity().finishAfterTransition();
                    return true;
                }

                // Otherwise let the system handle navigating "up"
                return false;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Really hacky loop for finding attraction in our static content provider.
     * Obviously would not be used in a production app.
     */
    private Attraction findAttraction(String attractionName) {

        List<Attraction> attractions = TouristAttractions.getAttractions(getActivity());
        for (Attraction attraction : attractions) {
            if (attractionName.equals(attraction.getCityListData().getPlaceName())) {
                return attraction;
            }
        }

        return null;
    }

    public void getRoute() {
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyA2Qz6K0nwKqk4nIz8Q3F01Vb_x7JYNsUc");

        DirectionsApiRequest apiRequest = DirectionsApi.newRequest(context);
        apiRequest.origin(new com.google.maps.model.LatLng(Utils.getLocation(getActivity()).latitude, Utils.getLocation(getActivity()).longitude));
        apiRequest.destination(new com.google.maps.model.LatLng(Utils.getLocation(getActivity()).latitude, Utils.getLocation(getActivity()).longitude));
        com.google.maps.model.LatLng[] wayPoints = new com.google.maps.model.LatLng[mAttraction.getToDoAttractionsList().size()];
        for (int i = 0; i < mAttraction.getToDoAttractionsList().size(); i++) {
            wayPoints[i] = new com.google.maps.model.LatLng(mAttraction.getToDoAttractionsList().get(i).getLatitude(), mAttraction.getToDoAttractionsList().get(i).getLongitude());
        }
        apiRequest.waypoints(wayPoints);
        apiRequest.mode(TravelMode.DRIVING); //set travelling mode

        apiRequest.setCallback(new com.google.maps.PendingResult.Callback<DirectionsResult>() {
            @Override
            public void onResult(DirectionsResult result) {
                DirectionsRoute[] routes = result.routes;
                Log.e("onresult", routes.length + "");
                if (googleMap != null) {
                    DirectionsRoute route = routes[0];
                    List<LatLng> directionPointList = getLatlngList(route.overviewPolyline.decodePath());
                    googleMap.addPolyline(new PolylineOptions().addAll(directionPointList));

                }
            }

            @Override
            public void onFailure(Throwable e) {
                Log.e("onresult", e.getMessage() + "");
            }
        });
    }

    public static List<LatLng> getLatlngList(List<com.google.maps.model.LatLng> latLngList) {
        List<LatLng> convertedLatLngList = new ArrayList<>();
        for (int i = 0; i < latLngList.size(); i++) {

            com.google.maps.model.LatLng toConvetLatLng = latLngList.get(i);
            LatLng covnetedlatLng = new LatLng(toConvetLatLng.lat, toConvetLatLng.lng);
            convertedLatLngList.add(covnetedlatLng);
        }
        return convertedLatLngList;
    }


    SupportMapFragment mapFragment;

    public void setMap() {
        mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
    }
}
