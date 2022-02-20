package com.example.admincollegeapp;

import java.security.PublicKey;

public class NoticeData {
    String title, image, date, time, key;

    public NoticeData(){

    }
    public NoticeData(String title, String time, String image, String date,String key) {

        this.title = title;
        this.time = time;
        this.image = image;
        this.date = date;
        this.key = key;

    }
    public String getTitle(){
        return title;
    }

}
