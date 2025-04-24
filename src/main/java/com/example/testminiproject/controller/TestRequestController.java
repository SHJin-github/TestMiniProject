package com.example.testminiproject.controller;

import com.example.testminiproject.service.TestRequestService;
import com.example.testminiproject.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tests")
public class TestRequestController {

    private TestRequestService testRequestServiceImpl;

    @Autowired
    public void TestRequestServiceImpl(TestRequestService testRequestServiceImpl) {
        this.testRequestServiceImpl = testRequestServiceImpl;
    }

    @GetMapping
    public List<TestVo> getAll() {
        return testRequestServiceImpl.getAll();
    }

    @GetMapping("/{testNo}")
    public TestVo get(@PathVariable("testNo") String testNo) {
        return testRequestServiceImpl.getByTestNo(testNo);
    }

    @PostMapping
    public void create(@RequestBody TestVo testVo) {
        testRequestServiceImpl.create(testVo);
    }

    @PutMapping("/{testNo}")
    public void update(@RequestBody TestVo testVo) {
        testRequestServiceImpl.update(testVo);
    }

    @DeleteMapping("/{testNo}")
    public void delete(@PathVariable("testNo") String testNo) {
        testRequestServiceImpl.delete(testNo);
    }

    @PostMapping("/{testNo}/receipt")
    public void receipt(@PathVariable("testNo") String testNo) {
        testRequestServiceImpl.receipt(testNo);
    }

}
