package com.example.hp.recycler;

public class Movies {

    private String title,genre,year;
    private int image;

    public Movies (String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.image = image;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) {
        this.title = title;
    }


    public  String getGenre() { return genre; }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public  String getYear() {
        return year;
    }

    public void setYear(String year) { this.year = year; }

    public int getimage() {
        return  image;
    }

    public  void setImage(int image) {
        this.image =image;}


}

