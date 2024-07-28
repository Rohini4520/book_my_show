package com.acciojob.book_my_show.Requests;

import lombok.Data;


import java.util.List;
@Data
public class BookTicketRequest {

    private List<String> requestedSeats;
    private Integer showId;
    private Integer userId;
}