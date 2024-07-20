package com.acciojob.book_my_show.Requests;

import com.acciojob.book_my_show.Enums.Language;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddMovieRequest {

    private String movieName;

    private double duration;

    private LocalDate releaseDate;

    private Language language;

    private double rating;
}
