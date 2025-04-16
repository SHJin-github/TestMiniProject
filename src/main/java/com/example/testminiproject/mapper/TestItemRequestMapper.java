package com.example.testminiproject.mapper;

import com.example.testminiproject.vo.TestItemVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface TestItemRequestMapper {

    List<TestItemVo> getItems(String testNo);
    List<TestItemVo> creatItems(String testNo, TestItemVo testItemVo);


}
