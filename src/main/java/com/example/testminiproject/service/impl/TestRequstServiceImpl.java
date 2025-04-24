package com.example.testminiproject.service.impl;

import com.example.testminiproject.mapper.TestRequestMapper;
import com.example.testminiproject.service.TestRequestService;
import com.example.testminiproject.vo.TestVo;
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

    public List<TestVo> getAll() {
        return testRequestMapper.findAll();
    }

    public TestVo getByTestNo(String testNo) {
        return testRequestMapper.findByTestNo(testNo);
    }

    public void create(TestVo testVo) {
        testRequestMapper.insert(testVo);
    }

    public void update(TestVo testVo) {
        testRequestMapper.update(testVo);
    }

    public void delete(String testNo) {
        testRequestMapper.delete(testNo);
    }

    public void receipt(String testNo) {
        testRequestMapper.receipt(testNo);
    }

}
