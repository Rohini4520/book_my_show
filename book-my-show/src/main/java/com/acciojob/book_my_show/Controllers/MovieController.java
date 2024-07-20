package com.acciojob.book_my_show.Controllers;

import com.acciojob.book_my_show.Requests.AddMovieRequest;
import com.acciojob.book_my_show.Requests.UpdateMovieRequest;
import com.acciojob.book_my_show.Services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movie")

public class MovieController {

    @Autowired
    private MovieServices movieServices;

    @PostMapping("add")
    public ResponseEntity addMovie(@RequestBody AddMovieRequest movieRequest){

        String response = movieServices.addMovie(movieRequest);
        return new ResponseEntity(response, HttpStatus.OK);

    }





}
