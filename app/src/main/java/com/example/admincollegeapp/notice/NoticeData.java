package com.example.admincollegeapp.notice;

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
    public void setTitle(String title){
        this.title = title;
    }

    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getImage(){
        return image;
    }
    public void getImage(String image){
        this.image = image;
    }

    public String getDate(){
        return date;
    }
    public void getDate(String date){
        this.date = date;
    }
    public String getKey(){
        return key;
    }
    public void getKey(String key){
        this.key = key;
    }

}
