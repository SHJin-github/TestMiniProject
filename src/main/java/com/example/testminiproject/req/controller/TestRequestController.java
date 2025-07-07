package com.example.testminiproject.req.controller;

import com.example.testminiproject.req.dto.*;
import com.example.testminiproject.req.service.TestRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
* Restful
*
* REST : 클라이언트와 서버 간에 규정한 HTTP 프로토클 기반 통신 방식
*
*
* */

@RestController
@RequestMapping("/requests")
public class TestRequestController {

    private final TestRequestService testRequestServiceImpl;

    public TestRequestController(TestRequestService testRequestServiceImpl) {
        this.testRequestServiceImpl = testRequestServiceImpl;
    }

    @GetMapping
    public List<TestRequestSearchDto> getAllRequests(@RequestBody TestRequestSearchDto searchDto) {
        return testRequestServiceImpl.getAllRequests(searchDto);
    }

    @GetMapping("/{testNo}")
    public TestRequestSearchDto getRequestByTestNo(@PathVariable("testNo") String testNo) {
        return testRequestServiceImpl.getRequestByTestNo(testNo);
    }

    @PostMapping
    public String createRequest(@RequestBody TestRequestCreateDto createDto) {
        testRequestServiceImpl.createRequest(createDto);
        return createDto.getTestNo();
    }

    @PatchMapping("/{testNo}")
    public void updateRequest(@PathVariable("testNo") String testNo, @RequestBody TestRequestUpdateDto updateDto) {
        updateDto.setTestNo(testNo);
        testRequestServiceImpl.updateRequest(updateDto);
    }

    @DeleteMapping("/{testNo}")
    public void deleteRequest(@PathVariable("testNo") String testNo, @RequestBody TestRequestDeleteDto deleteDto) {
        deleteDto.setTestNo(testNo);
        testRequestServiceImpl.deleteRequest(deleteDto);
    }

    @PutMapping("/{testNo}/receipt")
    public void updateToReceipt(@PathVariable("testNo") String testNo, @RequestBody TestRequestUpdateDto updateDto) {
        updateDto.setTestNo(testNo);
        testRequestServiceImpl.updateToReceipt(updateDto);
    }

}
