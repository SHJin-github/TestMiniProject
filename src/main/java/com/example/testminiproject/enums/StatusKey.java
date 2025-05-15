package com.example.testminiproject.enums;

public enum StatusKey {

    REQUEST("의뢰"),
    RECEIPT("접수"),
    ;

    private String value;

    StatusKey(String state) {
        this.value = state;
    }

    public String getValue() {
        return value;
    }



}
