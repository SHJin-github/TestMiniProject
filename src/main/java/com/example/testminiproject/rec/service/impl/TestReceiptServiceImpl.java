package com.example.testminiproject.rec.service.impl;

import com.example.testminiproject.rec.service.TestReceiptService;
import com.example.testminiproject.req.mapper.TestRequestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestReceiptServiceImpl implements TestReceiptService {

    private final TestRequestMapper testRequestMapper;

    public TestReceiptServiceImpl(TestRequestMapper testRequestMapper) {
        this.testRequestMapper = testRequestMapper;
    }


}
