package com.example.testminiproject.req.service.impl;

import com.example.testminiproject.rec.dto.TestReceiptCreateDto;
import com.example.testminiproject.rec.service.TestReceiptService;
import com.example.testminiproject.req.dto.*;
import com.example.testminiproject.req.mapper.TestRequestMapper;
import com.example.testminiproject.req.service.TestRequestService;
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
    public List<TestRequestSearchDto> getAllRequests(TestRequestSearchDto searchDto) {
        return testRequestMapper.findAllRequests(searchDto);
    }

    @Override
    public TestRequestSearchDto getRequestByTestNo(String testNo) {
        return testRequestMapper.findRequestByTestNo(testNo);
    }

    @Override
    public void createRequest(TestRequestCreateDto createDto) {
        testRequestMapper.insertRequest(createDto);
    }

    @Override
    public void updateRequest(TestRequestUpdateDto updateDto) {
        testRequestMapper.updateRequest(updateDto);
    }

    @Override
    public void deleteRequest(TestRequestDeleteDto deleteDto) {
        testRequestMapper.deleteRequest(deleteDto);
    }

    @Override
    public void updateToReceipt(TestRequestUpdateDto updateDto) {
        testRequestMapper.updateRequest(updateDto);
        TestReceiptCreateDto createDto = TestReceiptCreateDto.markAsCreated(getUserId(), updateDto);
        testReceiptServiceImpl.createReceipt(createDto);
    }

    private String getUserId() {
        return GetUserSession.getUserId();
    }


}
