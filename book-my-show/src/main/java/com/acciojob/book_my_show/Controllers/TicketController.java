package com.acciojob.book_my_show.Controllers;

import com.acciojob.book_my_show.Requests.BookTicketRequest;
import com.acciojob.book_my_show.Services.TicketService;
import com.acciojob.book_my_show.models.Ticket;
import org.hibernate.annotations.DialectOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("bookTicket")
    public String bookTicket(@RequestBody BookTicketRequest bookTicketRequest) {

        return ticketService.bookTicket(bookTicketRequest);
    }
}