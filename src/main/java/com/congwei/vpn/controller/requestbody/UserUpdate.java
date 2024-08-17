package com.congwei.vpn.controller.requestbody;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserUpdate {

    private String email;

    private LocalDate deadline;

}
