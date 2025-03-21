package com.movies_api.demo.datatransferobject.movies;

public class MovieDto {
    
    private String title;
    private String synopsis;
    private String genre;
    private String director;

    public MovieDto(String title, String synopsis, String genre, String director) {
        this.title = title;
        this.synopsis = synopsis;
        this.genre = genre;
        this.director = director;
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
