package com.example.testminiproject.req.dto;

import lombok.Getter;

@Getter
public class TestRequestSearchDto {

    private String testNo;
    private String title;
    private String content;
    private String reqRmrk;
    private String reqDate;
    private String reqId;
    private String createDate;
    private String createUserId;
    private String modifyDate;
    private String modifyUserId;

    //searcch
    private String userName;
    private String reqStrDate;
    private String reqEndDate;


}
