package com.example.volume_calculater;

public class shape_arraylist_model {
    int shape_image;
    String shape_name;

    public shape_arraylist_model(int shape_image, String shape_name) {
        this.shape_image = shape_image;
        this.shape_name = shape_name;
    }

    public int getShape_image() {
        return shape_image;
    }

    public void setShape_image(int shape_image) {
        this.shape_image = shape_image;
    }

    public String getShape_name() {
        return shape_name;
    }

    public void setShape_name(String shape_name) {
        this.shape_name = shape_name;
    }
}
