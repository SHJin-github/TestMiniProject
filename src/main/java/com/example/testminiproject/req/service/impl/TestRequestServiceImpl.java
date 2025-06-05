package com.example.testminiproject.req.service.impl;

import com.example.testminiproject.enums.StatusKey;
import com.example.testminiproject.rec.dto.TestReceiptDto;
import com.example.testminiproject.rec.service.TestReceiptService;
import com.example.testminiproject.req.mapper.TestRequestMapper;
import com.example.testminiproject.req.service.TestRequestService;
import com.example.testminiproject.req.dto.TestRequestDto;
import com.example.testminiproject.util.GetUserSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestRequestServiceImpl implements TestRequestService {

    private final TestRequestMapper testRequestMapper;
    private final TestReceiptService testReceiptServiceImpl;

    public TestRequestServiceImpl(TestRequestMapper testRequestMapper,
                                  TestReceiptService testReceiptServiceImpl) {
        this.testRequestMapper = testRequestMapper;
        this.testReceiptServiceImpl = testReceiptServiceImpl;
    }

    @Override
    public List<TestRequestDto> getAllRequests(TestRequestDto testRequestDto) {
        return testRequestMapper.findAllRequests(testRequestDto);
    }

    @Override
    public TestRequestDto getRequestByTestNo(String testNo) {
        return testRequestMapper.findRequestByTestNo(testNo);
    }

    @Override
    public void createRequest(TestRequestDto testRequestDto) {
        testRequestDto.markAsCreated(getUserId());
        testRequestMapper.insertRequest(testRequestDto);
    }

    @Override
    public void updateRequest(TestRequestDto testRequestDto) {
        testRequestDto.markAsUpdated(getUserId());
        testRequestMapper.updateRequest(testRequestDto);
    }

    @Override
    public void deleteRequest(TestRequestDto testRequestDto) {
        testRequestDto.markAsDeleted(getUserId());
        testRequestMapper.deleteRequest(testRequestDto);
    }

    @Override
    public void updateStatusToReceipt(TestRequestDto testRequestDto) {
        testRequestDto.markAsReceipt(getUserId());
        testRequestMapper.updateRequest(testRequestDto);
        TestReceiptDto testReceiptDto = TestReceiptDto.markAsCreated(getUserId(), testRequestDto);
        testReceiptServiceImpl.createReceipt(testReceiptDto);
    }

    private String getUserId() {
        return GetUserSession.getUserId();
    }


}
