package com.example.materialdesign;

/**
 * Created by 令子 on 2017/1/19.
 */

public class Fruit {

    private String name;

    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
