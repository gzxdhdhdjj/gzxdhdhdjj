package com.example.personaltaskmanager;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private long id;
    private String userName;
    private String password;
    private String email;
    private String phone;

}
