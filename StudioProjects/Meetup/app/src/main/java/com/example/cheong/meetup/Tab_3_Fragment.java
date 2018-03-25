package com.example.cheong.meetup;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by Cheong on 21/3/2018.
 */

public class Tab_3_Fragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_3, container, false);

        Button button = (Button) view.findViewById(R.id.email_sign_in_button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
            }
        });

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

        return view;
    }
}

