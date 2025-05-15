package com.example.testminiproject.req.service.impl;

import com.example.testminiproject.enums.StatusKey;
import com.example.testminiproject.req.mapper.TestRequestMapper;
import com.example.testminiproject.req.service.TestRequestService;
import com.example.testminiproject.req.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestRequstServiceImpl implements TestRequestService {

    private TestRequestMapper testRequestMapper;

    @Autowired
    public TestRequstServiceImpl(TestRequestMapper testRequestMapper) {
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
        testRequestMapper.insertRequest(testVo);
    }

    public void updateRequest(TestVo testVo) {
        testRequestMapper.updateRequest(testVo);
    }

    public void deleteRequest(String testNo) {
        testRequestMapper.deleteRequest(testNo);
    }

    public void updateRequestStatus(TestVo testVo) {
        testVo.setStatus(StatusKey.REQUEST.getValue());
        testRequestMapper.updateRequestStatus(testVo);
    }

}
