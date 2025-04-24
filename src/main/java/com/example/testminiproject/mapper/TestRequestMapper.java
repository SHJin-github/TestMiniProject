package com.example.testminiproject.mapper;

import com.example.testminiproject.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestRequestMapper {

    List<TestVo> findAll();
    TestVo findByTestNo(String testNo);
    void insert(TestVo testVo);
    void update(TestVo testVo);
    void delete(String testNo);
    void receipt(String testNo);
}
