package com.example.testminiproject.req.controller;

import com.example.testminiproject.req.service.TestRequestService;
import com.example.testminiproject.req.dto.TestRequestDto;
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
    public List<TestRequestDto> getAllRequests(@RequestBody TestRequestDto testRequestDto) {
        return testRequestServiceImpl.getAllRequests(testRequestDto);
    }

    @GetMapping("/{testNo}")
    public TestRequestDto getRequestByTestNo(@PathVariable("testNo") String testNo) {
        return testRequestServiceImpl.getRequestByTestNo(testNo);
    }

    @PostMapping
    public String createRequest(@RequestBody TestRequestDto testRequestDto) {
        testRequestServiceImpl.createRequest(testRequestDto);
        return testRequestDto.getTestNo();
    }

    @PutMapping("/{testNo}")
    public void updateRequest(@PathVariable("testNo") String testNo, @RequestBody TestRequestDto testRequestDto) {
        testRequestDto.setTestNo(testNo);
        testRequestServiceImpl.updateRequest(testRequestDto);
    }

    @DeleteMapping("/{testNo}")
    public void deleteRequest(@PathVariable("testNo") String testNo) {
        TestRequestDto testRequestDto = new TestRequestDto();
        testRequestDto.setTestNo(testNo);
        testRequestServiceImpl.deleteRequest(testRequestDto);
    }

    @PutMapping("/{testNo}/status")
    public void updateStatusToReceipt(@PathVariable("testNo") String testNo, @RequestBody TestRequestDto testRequestDto) {
        testRequestDto.setTestNo(testNo);
        testRequestServiceImpl.updateStatusToReceipt(testRequestDto);
    }

}
