package com.example.testminiproject.req.mapper;

import com.example.testminiproject.req.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestRequestMapper {

    List<TestVo> findAllRequests();
    TestVo findByTestNo(String testNo);
    void insertRequest(TestVo testVo);
    void updateRequest(TestVo testVo);
    void deleteRequest(String testNo);
    void updateRequestStatus(TestVo testVo);
}
