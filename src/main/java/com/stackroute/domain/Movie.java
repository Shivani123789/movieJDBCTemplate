package com.stackroute.domain;

public class Movie {
    int id;
    String movieName;
    int releaseYear;
    int rating;

    public Movie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Movie(int id, String movieName, int releaseYear, int rating) {
        this.id = id;
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                '}';
    }
}
