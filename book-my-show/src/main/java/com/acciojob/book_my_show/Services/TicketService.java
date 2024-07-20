package com.acciojob.book_my_show.Services;

import com.acciojob.book_my_show.Enums.SeatType;
import com.acciojob.book_my_show.Repositories.ShowRepository;
import com.acciojob.book_my_show.Repositories.ShowSeatRepository;
import com.acciojob.book_my_show.Repositories.TicketRepository;
import com.acciojob.book_my_show.Repositories.UserRepository;
import com.acciojob.book_my_show.Requests.BookTicketRequest;
import com.acciojob.book_my_show.models.Show;
import com.acciojob.book_my_show.models.ShowSeat;
import com.acciojob.book_my_show.models.Ticket;
import com.acciojob.book_my_show.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private ShowSeatRepository showSeatRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TicketRepository ticketRepository;

    public String bookTicket(BookTicketRequest bookTicketRequest) {

        //1. find the show entity
        Show show = showRepository.findById(bookTicketRequest.getShowId()).get();


        //2. find the user entity
        User user = userRepository.findById(bookTicketRequest.getUserId()).get();

        //3. mark those seats as booked now and calculate total amount
        Integer totalAmount = 0;
        List<ShowSeat> showSeatList = show.getShowSeatList();

        for (ShowSeat showSeat : showSeatList) {

            String seatNo = showSeat.getSeatNo();
            if (bookTicketRequest.getRequestedSeats().contains(seatNo)) {

                showSeat.setIsBooked(Boolean.TRUE);

                if (showSeat.getSeatType().equals(SeatType.CLASSIC)) {
                    totalAmount = totalAmount + 100;
                } else
                    totalAmount = totalAmount + 150;
            }
        }
        //4. create the ticket entity and set the attributes
        Ticket ticket = Ticket.builder().showDate(show.getShowDate())
                .showTime(show.getShowTime())
                .movieName(show.getMovie().getMovieName())
                .TheaterName(show.getTheater().getName())
                .totalAmount(totalAmount)
                .show(show)
                .user(user)
                .build();

        return ticket;
        //save that ticket into db and return ticket entity (ticket respon
    }
}