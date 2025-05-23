package com.example.testminiproject.req.controller;

import com.example.testminiproject.req.service.TestRequestService;
import com.example.testminiproject.req.vo.TestVo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
public class TestRequestController {

    private final TestRequestService testRequestServiceImpl;

    public TestRequestController(TestRequestService testRequestServiceImpl) {
        this.testRequestServiceImpl = testRequestServiceImpl;
    }

    @GetMapping
    public List<TestVo> getAllRequests() {
        return testRequestServiceImpl.getAllRequests();
    }

    @GetMapping("/{testNo}")
    public TestVo get(@PathVariable("testNo") String testNo) {
        return testRequestServiceImpl.getByTestNo(testNo);
    }

    @PostMapping
    public void createRequest(@RequestBody TestVo testVo) {
        testRequestServiceImpl.createRequest(testVo);
    }

    @PutMapping("/{testNo}")
    public void updateRequest(@RequestBody TestVo testVo) {
        testRequestServiceImpl.updateRequest(testVo);
    }

    @DeleteMapping("/{testNo}")
    public void deleteRequest(@RequestBody TestVo testVo) {
        testRequestServiceImpl.deleteRequest(testVo);
    }

    @PutMapping("/{testNo}/status")
    public void updateRequestStatus(@RequestBody TestVo testVo) {
        testRequestServiceImpl.updateRequestStatus(testVo);
    }

}
