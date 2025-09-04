package com.example.testminiproject.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


/*
* enum
*
*
* */

@Getter
@AllArgsConstructor
public enum StatusKey {

    REQUEST("의뢰"),
    UPDATE("수정"),
    DELETE("삭제"),
    RECEIPT("접수"),
    ;

    private final String value;

}
