package com.acciojob.book_my_show.Requests;

import com.acciojob.book_my_show.Enums.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UpdateMovieRequest {

    private String movieName;
    private Language newLanguage;
    private Double newRating;

}
