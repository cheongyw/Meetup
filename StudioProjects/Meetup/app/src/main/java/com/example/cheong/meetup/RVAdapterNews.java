package com.example.cheong.meetup;

import android.content.Context;
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

public class RVAdapterNews extends RecyclerView.Adapter<RVAdapterNews.NewsViewHolder> {


    private List<News> news;
    Context context;

    RVAdapterNews(ArrayList<News> news, Context context){
        this.news = news;
        this.context = context;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        // tutorial says R.layout.item
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);
        NewsViewHolder nvh = new NewsViewHolder(v);
        return nvh;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int i) {
        holder.newsImage.setImageResource(news.get(i).getImageID());
        holder.newsName.setText(news.get(i).getName());
        holder.newsDesc.setText(news.get(i).getDescription());
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        CardView cv_news;
        ImageView newsImage;
        TextView newsName;
        TextView newsDesc;

        NewsViewHolder(View itemView) {
            super(itemView);
            cv_news = (CardView) itemView.findViewById(R.id.cv_news);
            newsImage = (ImageView) itemView.findViewById(R.id.news_image);
            newsName = (TextView) itemView.findViewById(R.id.news_name);
            newsDesc = (TextView) itemView.findViewById(R.id.news_description);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
