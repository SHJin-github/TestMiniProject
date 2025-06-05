package com.example.testminiproject.rec.service.impl;

import com.example.testminiproject.rec.mapper.TestReceiptMapper;
import com.example.testminiproject.rec.service.TestReceiptService;
import com.example.testminiproject.rec.dto.TestReceiptDto;
import org.springframework.stereotype.Service;

@Service
public class TestReceiptServiceImpl implements TestReceiptService {

    private final TestReceiptMapper testReceiptMapper;

    public TestReceiptServiceImpl(TestReceiptMapper testReceiptMapper) {
        this.testReceiptMapper = testReceiptMapper;
    }

    @Override
    public void createReceipt(TestReceiptDto testReceiptDto) {
        testReceiptMapper.insertReceipt(testReceiptDto);
    }
}
