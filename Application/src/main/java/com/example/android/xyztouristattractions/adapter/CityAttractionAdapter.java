package com.example.android.xyztouristattractions.adapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.android.xyztouristattractions.R;
import com.example.android.xyztouristattractions.common.Constants;
import com.example.android.xyztouristattractions.common.ToDoAttractionsList;
import com.example.android.xyztouristattractions.common.Utils;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/**
 * Created by advanz101 on 9/10/17.
 */

public class CityAttractionAdapter extends RecyclerView.Adapter<CityAttractionAdapter.ViewHolder> {

    List<ToDoAttractionsList> cityAttractions;
    Context context;
    LatLng mLatestLocation;

    public CityAttractionAdapter(List<ToDoAttractionsList> cityAttractions, Context context) {
        this.cityAttractions = cityAttractions;
        this.context = context;
        mLatestLocation=Utils.getLocation(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.city_attraction_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ToDoAttractionsList cityAttraction = cityAttractions.get(position);
        holder.txtTitle.setText(cityAttraction.getAttractionName());
        holder.txtDetail.setText(cityAttraction.getAttractionsShortText());
        int mImageSize = context.getResources().getDimensionPixelSize(R.dimen.image_size)
                * Constants.IMAGE_ANIM_MULTIPLIER;
        Glide.with(context)
                .load(cityAttraction.getAttractionImageURL())
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .placeholder(R.drawable.empty_photo)
                .override(mImageSize, mImageSize)
                .into(holder.icon);

        String distance =
                Utils.formatDistanceBetween(mLatestLocation, cityAttraction.getLocation());
        if (TextUtils.isEmpty(distance)) {
            holder.txtDistance.setVisibility(View.GONE);
        } else {
            holder.txtDistance.setVisibility(View.VISIBLE);
            holder.txtDistance.setText(distance);
        }
    }

    @Override
    public int getItemCount() {
        return cityAttractions.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView icon;
        private TextView txtDistance;
        private TextView txtTitle;
        private TextView txtDetail;

        public ViewHolder(View view) {
            super(view);
            icon = (ImageView) view.findViewById(android.R.id.icon);
            txtDistance = (TextView) view.findViewById(R.id.txtDistance);
            txtTitle = (TextView) view.findViewById(R.id.txtTitle);
            txtDetail = (TextView) view.findViewById(R.id.txtDetail);
        }
    }


    interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
