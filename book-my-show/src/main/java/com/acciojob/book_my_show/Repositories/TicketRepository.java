package com.acciojob.book_my_show.Repositories;

import com.acciojob.book_my_show.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository  extends JpaRepository<Ticket, String > {
}
