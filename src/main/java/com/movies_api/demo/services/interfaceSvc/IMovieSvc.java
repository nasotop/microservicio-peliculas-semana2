package com.movies_api.demo.services.interfaceSvc;

import java.util.List;

import com.movies_api.demo.datatransferobject.movies.MovieDto;

public interface IMovieSvc {
     List<MovieDto> getMovies();
     MovieDto getMovieById(int id)throws Exception ;
}
