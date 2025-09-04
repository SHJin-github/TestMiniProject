package com.example.testminiproject.req.service;

import com.example.testminiproject.req.dto.*;

import java.util.List;

public interface TestRequestService {

    List<TestRequestSearchDto> getAllRequests(TestRequestSearchDto searchDto);
    TestRequestSearchDto getRequestByTestNo(String testNo);
    void createRequest(TestRequestCreateDto createDto);
    void updateRequest(TestRequestUpdateDto updateDto);
    void deleteRequest(TestRequestDeleteDto deleteDto);
    void updateToReceipt(TestRequestUpdateDto updateDto);

}
