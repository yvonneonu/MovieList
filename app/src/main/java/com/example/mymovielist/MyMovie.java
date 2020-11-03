package com.example.mymovielist;

import java.io.Serializable;

public class MyMovie implements Serializable {
    String name;
    String description;
    int year;
    String image;
    int ratings;



    public MyMovie(String name, String description, int year, String image, int ratings) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.image = image;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
