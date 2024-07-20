package com.acciojob.book_my_show.models;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private  String name;

    private String age;

    private  String emailId;

    private  String mobileNo;



}
