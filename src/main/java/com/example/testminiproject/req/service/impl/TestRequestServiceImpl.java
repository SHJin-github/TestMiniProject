package com.example.testminiproject.req.service.impl;

import com.example.testminiproject.enums.StatusKey;
import com.example.testminiproject.req.mapper.TestRequestMapper;
import com.example.testminiproject.req.service.TestRequestService;
import com.example.testminiproject.req.vo.TestVo;
import com.example.testminiproject.util.GetUserSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestRequestServiceImpl implements TestRequestService {

    private final TestRequestMapper testRequestMapper;

    public TestRequestServiceImpl(TestRequestMapper testRequestMapper) {
        this.testRequestMapper = testRequestMapper;
    }

    public List<TestVo> getAllRequests() {
        return testRequestMapper.findAllRequests();
    }

    public TestVo getByTestNo(String testNo) {
        return testRequestMapper.findByTestNo(testNo);
    }

    public void createRequest(TestVo testVo) {
        testVo.setStatus(StatusKey.REQUEST.getValue());
        testVo.setCreateUserId(getUserId());
        testRequestMapper.insertRequest(testVo);
    }

    public void updateRequest(TestVo testVo) {
        testVo.setModifyUserId(getUserId());
        testRequestMapper.updateRequest(testVo);
    }

    public void deleteRequest(TestVo testVo) {
        testVo.setDeleteUserId(getUserId());
        testRequestMapper.deleteRequest(testVo);
    }

    public void updateRequestStatus(TestVo testVo) {
        testVo.setStatus(StatusKey.REQUEST.getValue());
        testVo.setModifyUserId(getUserId());
        testRequestMapper.updateRequestStatus(testVo);
    }

    private String getUserId() {
        return GetUserSession.getUserId();
    }


}
