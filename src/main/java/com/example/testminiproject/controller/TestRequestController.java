package com.example.testminiproject.controller;

import com.example.testminiproject.service.TestRequstService;
import com.example.testminiproject.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tests")
public class TestRequestController {

    @Autowired
    private TestRequstService testRequstService;

    @GetMapping
    public List<TestVo> getAll() {
        return testRequstService.getAll();
    }

    @GetMapping("/{testNo}")
    public TestVo get(@PathVariable("testNo") String testNo) {
        return testRequstService.getByTestNo(testNo);
    }

    @PostMapping
    public void create(@RequestBody TestVo testVo) {
        testRequstService.create(testVo);
    }

    @PutMapping("/{testNo}")
    public void update(@RequestBody TestVo testVo) {
        testRequstService.update(testVo);
    }

    @DeleteMapping("/{testNo}")
    public void delete(@PathVariable("testNo") String testNo) {
        testRequstService.delete(testNo);
    }






}
