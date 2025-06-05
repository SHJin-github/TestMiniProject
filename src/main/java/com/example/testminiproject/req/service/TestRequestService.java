package com.example.testminiproject.req.service;

import com.example.testminiproject.req.dto.TestRequestDto;

import java.util.List;

public interface TestRequestService {

    List<TestRequestDto> getAllRequests(TestRequestDto testRequestDto);
    TestRequestDto getRequestByTestNo(String testNo);
    void createRequest(TestRequestDto testRequestDto);
    void updateRequest(TestRequestDto testRequestDto);
    void deleteRequest(TestRequestDto testRequestDto);
    void updateStatusToReceipt(TestRequestDto testRequestDto);

}
