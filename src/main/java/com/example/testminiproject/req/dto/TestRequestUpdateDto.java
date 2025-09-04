package com.example.testminiproject.req.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class TestRequestUpdateDto {

    @Setter
    private String testNo;

    private String title;
    private String content;
    private String reqRmrk;
    private String reqId;
    private String modifyDate;
    private String modifyUserId;



}
