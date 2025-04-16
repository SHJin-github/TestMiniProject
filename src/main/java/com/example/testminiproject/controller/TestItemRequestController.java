package com.example.testminiproject.controller;

import com.example.testminiproject.service.TestItemRequestService;
import com.example.testminiproject.vo.TestItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class TestItemRequestController {

    @Autowired
    private TestItemRequestService testItemRequestService;

    @GetMapping("{testNo}")
    public List<TestItemVo> getItems(@PathVariable String testNo) {
        return testItemRequestService.getItems(testNo);
    }

    @PostMapping
    public List<TestItemVo> creatItems(@PathVariable("testNo") String testNo, @RequestBody TestItemVo testItemVo) {
        return testItemRequestService.creatItems(testNo, testItemVo);
    }


}
