package com.movies_api.demo.repository.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.movies_api.demo.entities.MovieEntity;
import com.movies_api.demo.repository.interfacesvc.*;

@Repository
public class MovieRepositorySvcImpl implements IMovieRepositorySvc {


private ArrayList<MovieEntity> movieEntities =  new ArrayList<MovieEntity>();


     public MovieRepositorySvcImpl(){
        movieEntities.add(new MovieEntity(1, "The Shawshank Redemption", "Dos hombres encarcelados forman un vínculo durante años, encontrando consuelo y eventual redención a través de actos de decencia común.", "Drama", "Frank Darabont"));
        movieEntities.add(new MovieEntity(2, "The Godfather", "El patriarca envejecido de una dinastía criminal organizada en la ciudad de Nueva York transfiere el control de su imperio clandestino a su hijo menor.", "Crimen, Drama", "Francis Ford Coppola"));
        movieEntities.add(new MovieEntity(3, "The Dark Knight", "Cuando el Joker emerge como una nueva amenaza, Batman debe aceptar uno de los mayores desafíos para luchar contra la injusticia.", "Acción, Crimen, Drama", "Christopher Nolan"));
        movieEntities.add(new MovieEntity(4, "Pulp Fiction", "Las vidas de dos sicarios, un boxeador, la esposa de un gánster y dos bandidos se entrelazan en cuatro historias de violencia y redención.", "Crimen, Drama", "Quentin Tarantino"));
        movieEntities.add(new MovieEntity(5, "Schindler's List", "Durante la Segunda Guerra Mundial, Oskar Schindler gradualmente se preocupa por su fuerza de trabajo judía después de presenciar su persecución por los nazis.", "Biografía, Drama, Historia", "Steven Spielberg"));
     }

    @Override
    public List<MovieEntity> GetAll() {
       return movieEntities;
    }

    @Override
    public MovieEntity GetSingleOrDefaultById(int id) {
        MovieEntity movie =  null;

        for(MovieEntity item : movieEntities){
            if(item.getId()!= id) continue;
            
            movie = item;
        }

        return movie;
    }
    
}
