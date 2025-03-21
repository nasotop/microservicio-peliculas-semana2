package com.movies_api.demo.repository.interfacesvc;

import java.util.List;

import com.movies_api.demo.entities.MovieEntity;

public interface IMovieRepositorySvc {
    
    List<MovieEntity> GetAll();
    
    MovieEntity GetSingleOrDefaultById(int id);
}
