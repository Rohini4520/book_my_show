package com.acciojob.book_my_show.Repositories;

import com.acciojob.book_my_show.Enums.Language;
import com.acciojob.book_my_show.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

Movie findMovieByMovieName(String movieName);
    List<Movie> findAllByLanguage(Language language);



}
