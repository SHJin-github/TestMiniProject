package com.example.testminiproject.rec.controller;

import com.example.testminiproject.rec.service.TestReceiptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receipts")
public class TestReceiptController {

    private final TestReceiptService testReceiptServiceImpl;

    public TestReceiptController(TestReceiptService testReceiptServiceImpl) {
        this.testReceiptServiceImpl = testReceiptServiceImpl;
    }


}
