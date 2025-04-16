package com.example.testminiproject.service;

import com.example.testminiproject.mapper.TestItemRequestMapper;
import com.example.testminiproject.vo.TestItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestItemRequestService {

    @Autowired
    private TestItemRequestMapper testItmRequestMapper;

    public List<TestItemVo> getItems(String testNo) {
        return testItmRequestMapper.getItems(testNo);
    }

    public List<TestItemVo> creatItems(String testNo, TestItemVo testItemVo) {
        return testItmRequestMapper.creatItems(testNo, testItemVo);
    }
}
