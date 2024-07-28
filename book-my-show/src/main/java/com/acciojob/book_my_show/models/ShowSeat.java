package com.acciojob.book_my_show.models;

import com.acciojob.book_my_show.Enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "show_seats")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showSeatId;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Boolean isBooked;
    private Boolean isFoodAttached;

    @ManyToOne
    @JoinColumn(name = "show_id") // Matches the updated column
    private Show show;
}