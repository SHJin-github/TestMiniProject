package com.example.testminiproject.rec.dto;

import com.example.testminiproject.req.dto.TestRequestUpdateDto;

public class TestReceiptCreateDto {

    private String receiptNo;
    private String testNo;
    private String title;
    private String content;
    private String reqRmrk;
    private String recId;
    private String recDate;
    private String createDate;
    private String createUserId;

    public static TestReceiptCreateDto markAsCreated(String userId, TestRequestUpdateDto updateDto) {
        TestReceiptCreateDto createDto = new TestReceiptCreateDto();

        createDto.testNo = updateDto.getTestNo();
        createDto.title = updateDto.getTitle();
        createDto.content = updateDto.getContent();
        createDto.reqRmrk = updateDto.getReqRmrk();
        createDto.recId = userId;
        createDto.createUserId = userId;

        return createDto;
    }


}
