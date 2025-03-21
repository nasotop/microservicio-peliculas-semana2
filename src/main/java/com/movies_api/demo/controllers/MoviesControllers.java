package com.movies_api.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.movies_api.demo.datatransferobject.GenericResponseDto;
import com.movies_api.demo.datatransferobject.GenericSingleResponseDto;
import com.movies_api.demo.datatransferobject.movies.MovieDto;
import com.movies_api.demo.entities.MovieEntity;
import com.movies_api.demo.mapper.GenericResponseMapper;
import com.movies_api.demo.services.implement.MovieSvcImpl;
import com.movies_api.demo.services.interfaceSvc.IMovieSvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/movies")
public class MoviesControllers {

    private final IMovieSvc _movieService;

    @Autowired
    public MoviesControllers(MovieSvcImpl movieService) {
        _movieService = movieService;
    }

    @GetMapping
    public GenericResponseDto<MovieDto> getMovies() {
        GenericResponseDto<MovieDto> response = new GenericResponseDto<MovieDto>();

        try {

            response = GenericResponseMapper.ToGenericResponseDto(_movieService.getMovies());

        } catch (Exception ex) {

            response.loadError(ex.getMessage());
        }

        return response;
    }

    @GetMapping("/{id}")
    public GenericSingleResponseDto<MovieDto> getMovie(@PathVariable("id") int id) {
        GenericSingleResponseDto<MovieDto> response = new GenericSingleResponseDto<MovieDto>();

        try {

            response = GenericResponseMapper.ToGenericSingleResponseDto(_movieService.getMovieById(id));

        } catch (Exception ex) {

            response.loadError(ex.getMessage());
        }

        return response;
    }
}
