package com.example.testminiproject.req.mapper;

import com.example.testminiproject.req.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestRequestMapper {

    List<TestRequestSearchDto> findAllRequests(TestRequestSearchDto searchDto);
    TestRequestSearchDto findRequestByTestNo(String testNo);
    void insertRequest(TestRequestCreateDto createDto);
    void updateRequest(TestRequestUpdateDto updateDto);
    void deleteRequest(TestRequestDeleteDto deleteDto);

}
