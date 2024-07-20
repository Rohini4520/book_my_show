package com.acciojob.book_my_show.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Integer ticketId;

    private String bookedSeats;

    private LocalDate showDate;

    private  LocalTime showTime;

    private String movieName;

    private String  TheaterName;

    private Integer totalAmount;

    @JoinColumn
    @ManyToOne
    private  Show show;


    @JoinColumn
    @ManyToOne
    private  User user;






}
