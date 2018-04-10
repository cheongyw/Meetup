package com.example.cheong.meetup;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Cheong on 21/3/2018.
 */

public class Tab_2_Fragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_2, container, false);
/*
        https://iteritory.com/android-recyclerview-horizontal-list-tutorial/
*/
        //RV for Popular Now

        ArrayList<Event> popular_now = new ArrayList<>();
        popular_now.add(new Event("项目一", "项目描述", R.drawable.empty_thumbnail));
        popular_now.add(new Event("项目二", "项目描述", R.drawable.empty_thumbnail));
        popular_now.add(new Event("项目三", "项目描述", R.drawable.empty_thumbnail));

        RecyclerView rv_popular_now = (RecyclerView)view.findViewById(R.id.rv_popular_now);
        LinearLayoutManager llm_popular_now = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv_popular_now.setLayoutManager(llm_popular_now);

        RVAdapter adapter_popular_now = new RVAdapter(popular_now, getContext());
        rv_popular_now.setAdapter(adapter_popular_now);

        popular_now.add(new Event("项目四", "项目描述", R.drawable.empty_thumbnail));
        popular_now.add(new Event("项目五", "项目描述", R.drawable.empty_thumbnail));
        popular_now.add(new Event("项目六", "项目描述", R.drawable.empty_thumbnail));
        adapter_popular_now.notifyDataSetChanged();

        //RV for Suggested Events

        ArrayList<Event> suggested_events = new ArrayList<>();
        suggested_events.add(new Event("项目一", "今天", R.drawable.empty_thumbnail));
        suggested_events.add(new Event("项目二", "今天", R.drawable.empty_thumbnail));
        suggested_events.add(new Event("项目三", "明天", R.drawable.empty_thumbnail));

        RecyclerView rv_suggested_events = (RecyclerView)view.findViewById(R.id.rv_suggested_events);
        LinearLayoutManager llm_suggested_events = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv_suggested_events.setLayoutManager(llm_suggested_events);

        RVAdapter adapter_suggested_events = new RVAdapter(suggested_events, getContext());
        rv_suggested_events.setAdapter(adapter_suggested_events);

        suggested_events.add(new Event("项目四", "明天", R.drawable.empty_thumbnail));
        suggested_events.add(new Event("项目五", "后天", R.drawable.empty_thumbnail));
        suggested_events.add(new Event("项目六", "后天", R.drawable.empty_thumbnail));
        adapter_suggested_events.notifyDataSetChanged();

        //RV for Recently Added

        ArrayList<Event> recently_added = new ArrayList<>();
        recently_added.add(new Event("项目一", "项目描述", R.drawable.empty_thumbnail));
        recently_added.add(new Event("项目二", "项目描述", R.drawable.empty_thumbnail));
        recently_added.add(new Event("项目三", "项目描述", R.drawable.empty_thumbnail));

        RecyclerView rv_recently_added = (RecyclerView)view.findViewById(R.id.rv_recently_added);
        LinearLayoutManager llm_recently_added = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv_recently_added.setLayoutManager(llm_recently_added);

        RVAdapter adapter_recently_added = new RVAdapter(recently_added, getContext());
        rv_recently_added.setAdapter(adapter_recently_added);

        recently_added.add(new Event("项目四", "项目描述", R.drawable.empty_thumbnail));
        recently_added.add(new Event("项目五", "项目描述", R.drawable.empty_thumbnail));
        recently_added.add(new Event("项目六", "项目描述", R.drawable.empty_thumbnail));

        adapter_recently_added.notifyDataSetChanged();

        return view;
    }
}

