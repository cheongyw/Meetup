package com.example.cheong.meetup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Cheong on 7/4/2018.
 */

public class Tab_5_Fragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_5, container, false);

/*
        https://www.youtube.com/watch?v=TY-2Cx4IW9A
*/
        Button button = (Button) view.findViewById(R.id.email_sign_in_button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /*FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.container, new Tab_2_Fragment());
                fr.commit();*/
                Intent intent = new Intent(getActivity(),SubActivity.class);
                startActivity(intent);
            }
        });

        return view;

    }
}
