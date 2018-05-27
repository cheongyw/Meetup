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
import android.widget.ImageButton;

import java.util.ArrayList;

/**
 * Created by Cheong on 21/3/2018.
 */

public class Tab_3_Fragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_3, container, false);

        ImageButton create_event = (ImageButton) view.findViewById(R.id.create_event);
        create_event.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(),NewEventActivity.class);
                startActivity(intent);
            }
        });

        ImageButton create_group = (ImageButton) view.findViewById(R.id.create_group);
        create_group.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(),NewGroupActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}

