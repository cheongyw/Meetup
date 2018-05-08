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
        holder.groupIcon.setImageResource(news.get(i).getGroupIcon());
        holder.groupName.setText(news.get(i).getGroupName());
        holder.noOfMembers.setText(news.get(i).getNo_of_members());
        holder.whenPosted.setText(news.get(i).getWhen_posted());
        holder.newsCaption.setText(news.get(i).getNews_caption());
        holder.newsTeaser.setText(news.get(i).getNews_teaser());
        holder.newsImage.setImageResource(news.get(i).getImageID());
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        CardView cv_news;
        ImageView groupIcon;
        TextView groupName;
        TextView noOfMembers;
        TextView whenPosted;
        TextView newsCaption;
        TextView newsTeaser;
        ImageView newsImage;

        NewsViewHolder(View itemView) {
            super(itemView);
            cv_news = (CardView) itemView.findViewById(R.id.cv_news);
            groupIcon = (ImageView) itemView.findViewById(R.id.group_icon);
            groupName = (TextView) itemView.findViewById(R.id.group_name);
            noOfMembers = (TextView) itemView.findViewById(R.id.no_of_group_members);
            whenPosted = (TextView) itemView.findViewById(R.id.when_posted);
            newsCaption = (TextView) itemView.findViewById(R.id.news_caption);
            newsTeaser = (TextView) itemView.findViewById(R.id.news_teaser);
            newsImage = (ImageView) itemView.findViewById(R.id.news_image);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
