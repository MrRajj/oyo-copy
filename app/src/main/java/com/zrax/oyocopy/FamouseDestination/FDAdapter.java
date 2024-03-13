package com.zrax.oyocopy.FamouseDestination;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.zrax.oyocopy.R;

import java.util.ArrayList;

public class FDAdapter extends RecyclerView.Adapter<FDAdapter.viewHolder> {
Context context;
ArrayList<FDModel> models;

    public FDAdapter(Context context, ArrayList<FDModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public FDAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(context).inflate(R.layout.item_famous_location,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FDAdapter.viewHolder holder, int position) {
        if (models.get(position).getLocationUrl()==""){
            Glide.with(context).load(models.get(position).getLocationUrl()).placeholder(R.drawable.near_me).into(holder.FamousDestinationImage);
            holder.FamousDestinationName.setText("Nearby");
        }else {
            Glide.with(context).load(models.get(position).getLocationUrl()).into(holder.FamousDestinationImage);
            holder.FamousDestinationName.setText(models.get(position).getLocationName());
            holder.FamousDestinationImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            holder.FamousDestinationImage.setPadding(0,0,0,0);
        }

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView FamousDestinationImage;
        TextView FamousDestinationName;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            FamousDestinationImage = itemView.findViewById(R.id.LocationImage);
            FamousDestinationName = itemView.findViewById(R.id.LocationName);
        }
    }
}
