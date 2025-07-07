package com.example.testminiproject.req.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class TestRequestDeleteDto {

    @Setter
    private String testNo;

    private String deleteDate;
    private String deleteUserId;



}
