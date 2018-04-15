package com.example.cheong.meetup;

/**
 * Created by Cheong on 25/3/2018.
 */

public class News {

    String date;
    String time;
    String category;
    String group;
    String content;
    int imageID;

    News(String date, String time, String category, String group, String content, int imageID) {
        this.date = date;
        this.time = time;
        this.category = category;
        this.group = group;
        this.content = content;
        this.imageID = imageID;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getCategory() {
        return category;
    }

    public String getGroup() {
        return group;
    }

    public String getContent() {
        return content;
    }

    public int getImageID() {
        return imageID;
    }
}
