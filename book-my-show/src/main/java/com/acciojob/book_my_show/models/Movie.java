package com.acciojob.book_my_show.models;


import com.acciojob.book_my_show.Enums.Language;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(unique = true)
    private String movieName;

    private double duration;

    private LocalDate releaseDate;
@Enumerated(value = EnumType.STRING)
private Language language;

private double rating;


}
