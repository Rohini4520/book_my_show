package com.acciojob.book_my_show.Requests;

import lombok.Data;

@Data
public class AddTheaterRequest {

    private Integer noOfScreens;
    private String name;
    private String address;

}
