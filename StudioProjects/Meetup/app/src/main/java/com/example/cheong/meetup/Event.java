package com.example.cheong.meetup;

import android.media.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cheong on 25/3/2018.
 */

public class Event {
        String name;
        String date;
        int imageID;

        Event(String name, String date, int imageID) {
            this.name = name;
            this.date = date;
            this.imageID = imageID;
        }

        public String getName() {
            return name;
        }

        public String getDate() {
            return date;
        }

        public int getImageID() {
            return imageID;
        }
}
