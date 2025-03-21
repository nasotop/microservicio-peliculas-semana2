package com.movies_api.demo.entities;

public class MovieEntity {
    
    private int Id;

    private String Title;

    private String Synopsis;

    private String Genre;
    private String Director;


    public MovieEntity(int id, String title, String synopsis, String genre, String director){
            Id=id;
            Title=title;
            Synopsis= synopsis;
            Genre=genre;
            Director= director;
    }

    public int getId(){
        return this.Id;
    }

    
    public String getTitle(){
        return this.Title;
    }
    
    public String getSynopsis(){
        return this.Synopsis;
    }
    public String getGenre(){
        return this.Genre;
    }

    public String getDirector(){
        return this.Director;
    }

    
}
