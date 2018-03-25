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
