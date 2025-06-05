package com.example.testminiproject.rec.mapper;

import com.example.testminiproject.rec.dto.TestReceiptDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestReceiptMapper {
    void insertReceipt(TestReceiptDto testReceiptDto);

}
