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
        upcoming_events.add(new Event("Event 1", "today", R.drawable.test_thumbnail));
        upcoming_events.add(new Event("Event 2", "today", R.drawable.test_thumbnail));
        upcoming_events.add(new Event("Event 3", "tomorrow", R.drawable.test_thumbnail));

        RecyclerView rv_upcoming_events = (RecyclerView)view.findViewById(R.id.rv_upcoming_events);
        LinearLayoutManager llm_upcoming_events = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv_upcoming_events.setLayoutManager(llm_upcoming_events);

        RVAdapter adapter_upcoming_events = new RVAdapter(upcoming_events, getContext());
        rv_upcoming_events.setAdapter(adapter_upcoming_events);

        upcoming_events.add(new Event("Event 4", "Tomorrow", R.drawable.test_thumbnail));
        upcoming_events.add(new Event("Event 5", "Tomorrow", R.drawable.test_thumbnail));
        upcoming_events.add(new Event("Event 6", "Tomorrow", R.drawable.test_thumbnail));
        adapter_upcoming_events.notifyDataSetChanged();

        //RV for Suggested Events

        ArrayList<Event> suggested_events = new ArrayList<>();
        suggested_events.add(new Event("Event 1", "today", R.drawable.test_thumbnail));
        suggested_events.add(new Event("Event 2", "today", R.drawable.test_thumbnail));
        suggested_events.add(new Event("Event 3", "tomorrow", R.drawable.test_thumbnail));

        RecyclerView rv_suggested_events = (RecyclerView)view.findViewById(R.id.rv_suggested_events);
        LinearLayoutManager llm_suggested_events = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv_suggested_events.setLayoutManager(llm_suggested_events);

        RVAdapter adapter_suggested_events = new RVAdapter(suggested_events, getContext());
        rv_suggested_events.setAdapter(adapter_suggested_events);

        suggested_events.add(new Event("Event 4", "Tomorrow", R.drawable.test_thumbnail));
        suggested_events.add(new Event("Event 5", "Tomorrow", R.drawable.test_thumbnail));
        suggested_events.add(new Event("Event 6", "Tomorrow", R.drawable.test_thumbnail));
        adapter_suggested_events.notifyDataSetChanged();

        // RV for Newsfeed

        ArrayList<News> newsfeed = new ArrayList<>();
        newsfeed.add(new News("News 1", "description", R.drawable.test_thumbnail));
        newsfeed.add(new News("News 2", "description", R.drawable.test_thumbnail));
        newsfeed.add(new News("News 3", "description", R.drawable.test_thumbnail));
/*
        https://iteritory.com/android-recyclerview-horizontal-list-tutorial/
*/

        RecyclerView rv_newsfeed = (RecyclerView)view.findViewById(R.id.rv_newsfeed);
        LinearLayoutManager llm_newsfeed = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_newsfeed.setLayoutManager(llm_newsfeed);

        RVAdapterNews adapter_newsfeed = new RVAdapterNews(newsfeed, getContext());
        rv_newsfeed.setAdapter(adapter_newsfeed);

        newsfeed.add(new News("News 4", "description", R.drawable.test_thumbnail));
        newsfeed.add(new News("News 5", "description", R.drawable.test_thumbnail));
        newsfeed.add(new News("News 6", "description", R.drawable.test_thumbnail));
        newsfeed.add(new News("News 7", "description", R.drawable.test_thumbnail));
        newsfeed.add(new News("News 8", "description", R.drawable.test_thumbnail));
        adapter_newsfeed.notifyDataSetChanged();

        return view;
    }
}
