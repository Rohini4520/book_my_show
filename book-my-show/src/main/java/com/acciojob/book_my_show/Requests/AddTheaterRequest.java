package com.acciojob.book_my_show.Requests;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTheaterRequest {

    private Integer noOfScreens;
    private String name;
    private String address;


}
