package com.example.testminiproject.req.vo;

import lombok.Data;

@Data
public class TestVo {

    private String testNo;
    private String title;
    private String content;
    private String createDate;
    private String createUserId;
    private String modifyDate;
    private String modifyUserId;
    private String deleteYn;
    private String deleteUserId;
    private String deleteDate;
    private String status;

}
