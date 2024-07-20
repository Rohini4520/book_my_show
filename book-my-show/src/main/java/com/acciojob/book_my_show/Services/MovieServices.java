package com.acciojob.book_my_show.Services;

import com.acciojob.book_my_show.Repositories.MovieRepository;
import com.acciojob.book_my_show.Requests.AddMovieRequest;
import com.acciojob.book_my_show.Requests.UpdateMovieRequest;
import com.acciojob.book_my_show.models.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MovieServices {
    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(AddMovieRequest movieRequest) {
         //from my request Entry i am creating the entity:bcz entity saves into the DB
        Movie movie = new Movie();

        movie.setMovieName(movieRequest.getMovieName());
        movie.setLanguage(movieRequest.getLanguage());
        movie.setDuration(movieRequest.getDuration());
        movie.setRating(movieRequest.getRating());
        movie.setReleaseDate(movieRequest.getReleaseDate());

        movie = movieRepository.save(movie);
        return "Movie had been added to the db with movieId" +movie.getMovieId();
    }
    public String  UpdateMovieAttributes(UpdateMovieRequest movieRequest){
        //Get the movie entity
        Movie movie = movieRepository.findMovieByMovieName(movieRequest.getMovieName());

        //Update the new attributes
        movie.setLanguage(movieRequest.getNewLanguage());
        movie.setRating(movieRequest.getNewRating());

        //save it back to DB
        movieRepository.save(movie);

        //put ot back to HM
        return "movie Attributes have been updated ";



    }
}
