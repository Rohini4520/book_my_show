package com.acciojob.book_my_show.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "theaters")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Theater {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer theaterId;

    private String name;

    private String address;

    private Integer noOfScreen;

    //Bidirectional mapping in the Parent to keep a record to child

    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    private List<TheaterSeat> theaterSeatList=new ArrayList<>();
}