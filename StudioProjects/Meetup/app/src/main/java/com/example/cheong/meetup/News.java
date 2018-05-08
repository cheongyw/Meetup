package com.example.cheong.meetup;

/**
 * Created by Cheong on 25/3/2018.
 */

public class News {

    int group_icon;
    String group_name;
    String no_of_members;
    String when_posted;
    String news_caption;
    String news_teaser;
    int imageID;

    News(int group_icon, String group_name, String no_of_members, String when_posted, String news_caption, String news_teaser, int imageID) {
        this.group_icon = group_icon;
        this.group_name = group_name;
        this.no_of_members = no_of_members;
        this.when_posted = when_posted;
        this.news_caption = news_caption;
        this.news_teaser = news_teaser;
        this.imageID = imageID;
    }

    public int getGroupIcon() {
        return group_icon;
    }

    public String getGroupName() {
        return group_name;
    }

    public String getNo_of_members() {
        return no_of_members;
    }

    public String getWhen_posted() {
        return when_posted;
    }

    public String getNews_caption() {
        return news_caption;
    }

    public String getNews_teaser() {
        return news_teaser;
    }

    public int getImageID() {
        return imageID;
    }
}
