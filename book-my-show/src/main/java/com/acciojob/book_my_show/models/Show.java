package com.acciojob.book_my_show.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer showId;

    private LocalDate showDate; //format-> "YYYY-MM-DD"

    private LocalTime showTime; //format-> "HH-MM-SS"

    @JoinColumn
    @ManyToOne
    private Movie movie;

    @JoinColumn
    @ManyToOne
    private Theater theater;

    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    private List<ShowSeat> showSeatList=new ArrayList<>();

}
