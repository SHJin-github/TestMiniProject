package com.example.testminiproject.req.mapper;

import com.example.testminiproject.req.dto.TestRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestRequestMapper {

    List<TestRequestDto> findAllRequests(TestRequestDto testRequestDto);
    TestRequestDto findRequestByTestNo(String testNo);
    void insertRequest(TestRequestDto testRequestDto);
    void updateRequest(TestRequestDto testRequestDto);
    void deleteRequest(TestRequestDto testRequestDto);

}
