package com.example.testminiproject.service;

import com.example.testminiproject.mapper.TestRequestMapper;
import com.example.testminiproject.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestRequstService {

    @Autowired
    private TestRequestMapper testRequstMapper;

    public List<TestVo> getAll() {
        return testRequstMapper.findAll();
    }

    public TestVo getByTestNo(String testNo) {
        return testRequstMapper.findByTestNo(testNo);
    }

    public void create(TestVo testVo) {
        testRequstMapper.insert(testVo);
    }

    public void update(TestVo testVo) {
        testRequstMapper.update(testVo);
    }

    public void delete(String testNo) {
        testRequstMapper.delete(testNo);
    }

}
