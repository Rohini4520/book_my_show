package com.acciojob.book_my_show.models;

import com.acciojob.book_my_show.Enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "theater_seats")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TheaterSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer theaterId;

    private String seatNo;

    @Enumerated(value =  EnumType.STRING)
    private SeatType seatType;

    @JoinColumn
    @ManyToOne
    private Theater theater;

}
