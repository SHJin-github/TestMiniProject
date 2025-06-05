package com.example.testminiproject.rec.dto;

import com.example.testminiproject.enums.StatusKey;
import com.example.testminiproject.req.dto.TestRequestDto;

public class TestReceiptDto {

    private String receiptNo;
    private String testNo;
    private String title;
    private String content;
    private String reqRmrk;
    private String recId;
    private String recDate;
    private String createDate;
    private String createUserId;
    private String modifyDate;
    private String modifyUserId;
    private String deleteUserId;
    private String deleteDate;
    private String status;

    //searcch
    private String userName;
    private String reqStrDate;
    private String reqEndDate;

    public static TestReceiptDto markAsCreated(String userId, TestRequestDto testRequestDto) {
        TestReceiptDto testReceiptDto = new TestReceiptDto();

        testReceiptDto.testNo = testRequestDto.getTestNo();
        testReceiptDto.title = testRequestDto.getTitle();
        testReceiptDto.content = testRequestDto.getContent();
        testReceiptDto.reqRmrk = testRequestDto.getReqRmrk();
        testReceiptDto.recId = userId;
        testReceiptDto.createUserId = userId;
        testReceiptDto.status = StatusKey.RECEIPT.getValue();

        return testReceiptDto;
    }


}
