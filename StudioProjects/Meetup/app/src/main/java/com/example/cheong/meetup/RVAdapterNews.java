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
        holder.newsDate.setText(news.get(i).getDate());
        holder.newsTime.setText(news.get(i).getTime());
        holder.newsCategory.setText(news.get(i).getCategory());
        holder.newsGroup.setText(news.get(i).getGroup());
        holder.newsContent.setText(news.get(i).getContent());
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        CardView cv_news;
        ImageView newsImage;
        TextView newsDate;
        TextView newsTime;
        TextView newsCategory;
        TextView newsGroup;
        TextView newsContent;

        NewsViewHolder(View itemView) {
            super(itemView);
            cv_news = (CardView) itemView.findViewById(R.id.cv_news);
            newsImage = (ImageView) itemView.findViewById(R.id.news_image);
            newsDate = (TextView) itemView.findViewById(R.id.news_date);
            newsTime = (TextView) itemView.findViewById(R.id.news_time);
            newsCategory = (TextView) itemView.findViewById(R.id.news_category);
            newsGroup = (TextView) itemView.findViewById(R.id.news_group);
            newsContent = (TextView) itemView.findViewById(R.id.news_content);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
