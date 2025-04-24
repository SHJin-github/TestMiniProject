package com.example.testminiproject.service;

import com.example.testminiproject.vo.TestVo;

import java.util.List;

public interface TestRequestService {

    List<TestVo> getAll();
    TestVo getByTestNo(String testNo);
    void create(TestVo testVo);
    void update(TestVo testVo);
    void delete(String testNo);
    void receipt(String testNo);

}
