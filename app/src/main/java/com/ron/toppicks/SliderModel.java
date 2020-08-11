package com.ron.toppicks;

import java.io.Serializable;

public class SliderModel implements Serializable {

    int img;
    String name;

    public SliderModel(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }
}
