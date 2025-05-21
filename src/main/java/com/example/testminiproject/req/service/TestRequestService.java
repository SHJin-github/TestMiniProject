package com.example.testminiproject.req.service;

import com.example.testminiproject.req.vo.TestVo;

import java.util.List;

public interface TestRequestService {

    List<TestVo> getAllRequests();
    TestVo getByTestNo(String testNo);
    void createRequest(TestVo testVo);
    void updateRequest(TestVo testVo);
    void deleteRequest(TestVo testVo);
    void updateRequestStatus(TestVo testVo);

}
