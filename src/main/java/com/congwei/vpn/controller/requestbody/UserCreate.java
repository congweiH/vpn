package com.congwei.vpn.controller.requestbody;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserCreate {

    private String email;

    private LocalDate deadline;
}
