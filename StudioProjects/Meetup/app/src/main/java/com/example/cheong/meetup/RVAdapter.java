package com.example.cheong.meetup;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cheong on 25/3/2018.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.EventViewHolder> {


    private List<Event> events;
    Context context;

    RVAdapter(ArrayList<Event> events, Context context){
        this.events = events;
        this.context = context;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        // tutorial says R.layout.item
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item, parent, false);
        EventViewHolder evh = new EventViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int i) {
        holder.eventImage.setImageResource(events.get(i).getImageID());
        holder.eventName.setText(events.get(i).getName());
        holder.eventDate.setText(events.get(i).getDate());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        ImageView eventImage;
        TextView eventName;
        TextView eventDate;

        EventViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            eventImage = (ImageView) itemView.findViewById(R.id.event_image);
            eventName = (TextView) itemView.findViewById(R.id.event_name);
            eventDate = (TextView) itemView.findViewById(R.id.event_date);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
