package com.movies_api.demo.datatransferobject.movies;

public class MovieDto {
    public int id;
    private String title;
    private String synopsis;
    private String genre;
    private String director;

    public MovieDto(int id, String title, String synopsis, String genre, String director) {
        this.id = id;
        this.title = title;
        this.synopsis = synopsis;
        this.genre = genre;
        this.director = director;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
