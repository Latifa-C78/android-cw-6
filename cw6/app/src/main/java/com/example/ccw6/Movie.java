package com.example.ccw6;

public class Movie {
  private String title ;
    private String mainActor ;
    private Double movieRate ;
    private int paRate;
    private String genre;

    public Movie(String title, String mainActor, Double movieRate, int paRate, String genre) {
        this.title = title;
        this.mainActor = mainActor;
        this.movieRate = movieRate;
        this.paRate = paRate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public Double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(Double movieRate) {
        this.movieRate = movieRate;
    }

    public int getPaRate() {
        return paRate;
    }

    public void setPaRate(int paRate) {
        this.paRate = paRate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
