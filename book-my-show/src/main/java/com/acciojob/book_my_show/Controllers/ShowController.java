package com.acciojob.book_my_show.Controllers;

import com.acciojob.book_my_show.Requests.AddShowRequest;
import com.acciojob.book_my_show.Services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("shows")
public class ShowController {

    @Autowired
    private ShowService showService;


    @PostMapping("add")
    public ResponseEntity addShow(@RequestBody AddShowRequest addShowRequest){

        String response = showService.addShow(addShowRequest);
        return new ResponseEntity(response, HttpStatus.OK);
    }



}
