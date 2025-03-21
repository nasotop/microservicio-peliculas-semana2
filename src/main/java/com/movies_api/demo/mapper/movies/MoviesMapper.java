package com.movies_api.demo.mapper.movies;

import java.util.List;
import java.util.stream.Collectors;

import com.movies_api.demo.datatransferobject.movies.MovieDto;
import com.movies_api.demo.entities.MovieEntity;

public class MoviesMapper {
    
    public static List<MovieDto> toDtos(List<MovieEntity> entities){
        return entities.stream().map(MoviesMapper::toDto).collect(Collectors.toList());
    }

    public static MovieDto toDto(MovieEntity entity){
        return new MovieDto(
            entity.getId(),
            entity.getTitle(),
            entity.getSynopsis(),
            entity.getGenre(),
            entity.getDirector()
        );
    }
}
