package com.ron.toppicks;

import java.io.Serializable;

public class toppicksdata implements Serializable {
    int img[];
    String place,state,desc;
    float lat,lon,rating;

    public toppicksdata(int[] img, String place, String state, String desc, double lat, double lon, double rating) {
        this.img = img;
        this.place = place;
        this.state = state;
        this.desc = desc;
        this.lat = (float) lat;
        this.lon = (float) lon;
        this.rating = (float) rating;
    }

    public int getImg(int i) {
        return img[i];
    }

    public void setImg(int[] img) {
        this.img = img;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
