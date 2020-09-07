package com.example.runkeeper_technical_assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    //change this into the achievement class
    ArrayList<String> name;
    ArrayList<String> images;
    ArrayList<String> description;

    Context context;
    LayoutInflater inflater;

    public Adapter(Context context, ArrayList<String> name, ArrayList<String> images, ArrayList<String> description){
        this.context = context;
        this.name = name;
        this.images = images;
        this.description = description;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.achievement_tile, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(name.get(position));
        holder.description.setText(description.get(position));
        Glide.with(context)
                .asBitmap()
                .load(images.get(position))
                .into(holder.achievementImage);
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        ImageView achievementImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.achievemnt_title);
            description = itemView.findViewById(R.id.achievemnt_subtitle);
            achievementImage = itemView.findViewById(R.id.achievement_image);
        }
    }
}
