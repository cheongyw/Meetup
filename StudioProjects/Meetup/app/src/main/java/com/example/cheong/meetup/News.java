package com.example.cheong.meetup;

/**
 * Created by Cheong on 25/3/2018.
 */

public class News {

    String name;
    String description;
    int imageID;

    News(String name, String description, int imageID) {
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageID() {
        return imageID;
    }
}
