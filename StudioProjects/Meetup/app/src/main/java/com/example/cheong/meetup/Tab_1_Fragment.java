package com.example.cheong.meetup;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
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
        upcoming_events.add(new Event("第三期羽毛球集会", "3月3日", R.drawable.group_1_event));
        upcoming_events.add(new Event("进化·重新定义办公", "3月5日", R.drawable.group_2_event));
        upcoming_events.add(new Event("五一周末北京周边游-古北水镇", "3月11日", R.drawable.group_3_event));

        RecyclerView rv_upcoming_events = (RecyclerView)view.findViewById(R.id.rv_upcoming_events);
        LinearLayoutManager llm_upcoming_events = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv_upcoming_events.setLayoutManager(llm_upcoming_events);

        RVAdapter adapter_upcoming_events = new RVAdapter(upcoming_events, getContext());
        rv_upcoming_events.setAdapter(adapter_upcoming_events);

        for (int i = 0; i < rv_upcoming_events.getChildCount(); i++) {
            ImageButton img = (ImageButton) rv_upcoming_events.findViewHolderForAdapterPosition(i).itemView.findViewById(R.id.event_image);
            img.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent intent = new Intent(getActivity(),SubActivity.class);
                    startActivity(intent);
                }
            });
        }

        // RV for Newsfeed

        ArrayList<News> newsfeed = new ArrayList<>();
        newsfeed.add(new News(R.drawable.group_1_dp, "北大娱乐羽毛球小组", "5个队员", "2小时", "第四期羽毛球集会", "这是我们第四期的羽毛球活动，只能够容纳24个人，先报先得。", R.drawable.group_1_news));
        newsfeed.add(new News(R.drawable.group_2_dp, "天师人工智能小组", "37个队员", "1天", "进化·重新定义办公", "以人为核心的办公场景变革即将来领临。我们与合作伙伴一起，诚恳邀请您参加我们的解决方案发布会！", R.drawable.group_2_news));
        newsfeed.add(new News(R.drawable.group_3_dp, "北大周末旅游小组", "60个队员", "1天", "五一周末北京周边游-古北水镇", "古北水镇是京郊罕见的山水城结合的旅游度假景区。街道上保留和修建了明清、民国风格的山地四合院，尽显北方古镇的大气威严；也建设有南方水乡特色的区域，环境古朴优雅。镇内还有很多特色的店铺，吃、住、购物都十分方便，是京郊地区休闲度假不错的选择。", R.drawable.group_3_news));

        /*
        https://iteritory.com/android-recyclerview-horizontal-list-tutorial/
*/

        RecyclerView rv_newsfeed = (RecyclerView)view.findViewById(R.id.rv_newsfeed);
        LinearLayoutManager llm_newsfeed = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_newsfeed.setLayoutManager(llm_newsfeed);

        RVAdapterNews adapter_newsfeed = new RVAdapterNews(newsfeed, getContext());
        rv_newsfeed.setAdapter(adapter_newsfeed);

        return view;
    }
}
