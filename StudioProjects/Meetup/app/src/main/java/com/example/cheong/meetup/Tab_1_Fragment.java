package com.example.cheong.meetup;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cheong on 21/3/2018.
 */

public class Tab_1_Fragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_1, container, false);

        //RV for Upcoming Events

        ArrayList<Event> upcoming_events = new ArrayList<>();
        upcoming_events.add(new Event("项目一", "今天", R.drawable.round_thumbnail));
        upcoming_events.add(new Event("项目二", "今天", R.drawable.round_thumbnail));
        upcoming_events.add(new Event("项目三", "明天", R.drawable.round_thumbnail));

        RecyclerView rv_upcoming_events = (RecyclerView)view.findViewById(R.id.rv_upcoming_events);
        LinearLayoutManager llm_upcoming_events = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv_upcoming_events.setLayoutManager(llm_upcoming_events);

        RVAdapter adapter_upcoming_events = new RVAdapter(upcoming_events, getContext());
        rv_upcoming_events.setAdapter(adapter_upcoming_events);

        upcoming_events.add(new Event("项目四", "明天", R.drawable.round_thumbnail));
        upcoming_events.add(new Event("项目五", "明天", R.drawable.round_thumbnail));
        upcoming_events.add(new Event("项目六", "后天", R.drawable.round_thumbnail));
        adapter_upcoming_events.notifyDataSetChanged();

        // RV for Newsfeed

        ArrayList<News> newsfeed = new ArrayList<>();
        newsfeed.add(new News("新闻一", "内容描述", R.drawable.empty_thumbnail));
        newsfeed.add(new News("新闻二", "内容描述", R.drawable.empty_thumbnail));
        newsfeed.add(new News("新闻三", "内容描述", R.drawable.empty_thumbnail));
/*
        https://iteritory.com/android-recyclerview-horizontal-list-tutorial/
*/

        RecyclerView rv_newsfeed = (RecyclerView)view.findViewById(R.id.rv_newsfeed);
        LinearLayoutManager llm_newsfeed = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_newsfeed.setLayoutManager(llm_newsfeed);

        RVAdapterNews adapter_newsfeed = new RVAdapterNews(newsfeed, getContext());
        rv_newsfeed.setAdapter(adapter_newsfeed);

        newsfeed.add(new News("新闻四", "内容描述", R.drawable.empty_thumbnail));
        newsfeed.add(new News("新闻五", "内容描述", R.drawable.empty_thumbnail));
        newsfeed.add(new News("新闻六", "内容描述", R.drawable.empty_thumbnail));
        newsfeed.add(new News("新闻七", "内容描述", R.drawable.empty_thumbnail));
        newsfeed.add(new News("新闻八", "内容描述", R.drawable.empty_thumbnail));
        adapter_newsfeed.notifyDataSetChanged();

        return view;
    }
}
