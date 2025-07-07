package com.example.testminiproject.rec.mapper;

import com.example.testminiproject.rec.dto.TestReceiptCreateDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestReceiptMapper {
    void insertReceipt(TestReceiptCreateDto createDto);

}
