package com.movies_api.demo.services.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movies_api.demo.datatransferobject.movies.MovieDto;
import com.movies_api.demo.entities.MovieEntity;
import com.movies_api.demo.mapper.movies.MoviesMapper;
import com.movies_api.demo.repository.interfacesvc.IMovieRepositorySvc;
import com.movies_api.demo.services.interfaceSvc.IMovieSvc;
import com.movies_api.demo.repository.implement.MovieRepositorySvcImpl;

@Service
public class MovieSvcImpl implements IMovieSvc{

   private final IMovieRepositorySvc _movieRepository;

   public MovieSvcImpl(MovieRepositorySvcImpl movieRepository) {
      _movieRepository = movieRepository;
   }

   public List<MovieDto> getMovies() {
      return MoviesMapper.toDtos(_movieRepository.GetAll());
   }

   public MovieDto getMovieById(int id) throws Exception {
      
      MovieEntity content =_movieRepository.GetSingleOrDefaultById(id);

      if (content == null) {
         throw new Exception("Pelicula número " + id + " no encontrada");
      }

      return MoviesMapper.toDto(content);
   }
}
