package com.example.testminiproject.rec.service.impl;

import com.example.testminiproject.rec.dto.TestReceiptCreateDto;
import com.example.testminiproject.rec.mapper.TestReceiptMapper;
import com.example.testminiproject.rec.service.TestReceiptService;
import org.springframework.stereotype.Service;

@Service
public class TestReceiptServiceImpl implements TestReceiptService {

    private final TestReceiptMapper testReceiptMapper;

    public TestReceiptServiceImpl(TestReceiptMapper testReceiptMapper) {
        this.testReceiptMapper = testReceiptMapper;
    }

    @Override
    public void createReceipt(TestReceiptCreateDto createDto) {
        testReceiptMapper.insertReceipt(createDto);
    }
}
