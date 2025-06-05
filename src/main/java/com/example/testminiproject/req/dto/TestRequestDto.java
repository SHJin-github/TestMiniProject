package com.example.testminiproject.req.dto;

import com.example.testminiproject.enums.StatusKey;
import lombok.Data;

@Data
public class TestRequestDto {

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
    private String deleteUserId;
    private String deleteDate;
    private String status;

    //searcch
    private String userName;
    private String reqStrDate;
    private String reqEndDate;

    public void markAsCreated(String userId) {
        this.reqId = userId;
        this.createUserId = userId;
        this.status = StatusKey.REQUEST.getValue();
    }

    public void markAsUpdated(String userId) {
        this.modifyUserId = userId;
        this.status = StatusKey.UPDATE.getValue();
    }

    public void markAsDeleted(String userId) {
        this.deleteUserId = userId;
        this.status = StatusKey.DELETE.getValue();
    }

    public void markAsReceipt(String userId) {
        this.modifyUserId = userId;
        this.status = StatusKey.RECEIPT.getValue();
    }


}
