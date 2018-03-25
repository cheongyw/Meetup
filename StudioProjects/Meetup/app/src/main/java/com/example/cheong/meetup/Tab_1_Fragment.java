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
import java.util.List;

/**
 * Created by Cheong on 21/3/2018.
 */

public class Tab_1_Fragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_1, container, false);

        ArrayList<Event> events = new ArrayList<>();
        events.add(new Event("Event 1", "today", R.drawable.test_icon));
        events.add(new Event("Event 2", "today", R.drawable.test_icon));
        events.add(new Event("Event 3", "tomorrow", R.drawable.test_icon));

/*
        https://iteritory.com/android-recyclerview-horizontal-list-tutorial/
*/

        RecyclerView rv = (RecyclerView)view.findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(llm);

        RVAdapter adapter = new RVAdapter(events, getContext());
        rv.setAdapter(adapter);

        events.add(new Event("Event 4", "Tomorrow", R.drawable.test_icon));
        adapter.notifyDataSetChanged();

        return view;
    }
}
