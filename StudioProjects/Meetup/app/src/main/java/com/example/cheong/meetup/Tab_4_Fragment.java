package com.example.cheong.meetup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Cheong on 7/4/2018.
 */

public class Tab_4_Fragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_4, container, false);

        Button create = (Button) view.findViewById(R.id.create_new_event);
        create.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
            }
        });

        Button cont = (Button) view.findViewById(R.id.continue_draft);
        cont.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
