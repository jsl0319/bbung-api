package com.bbung.api.test.controller;

import com.bbung.api.test.dto.TestDto;
import com.bbung.api.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @GetMapping("/{str}")
    public String test(@PathVariable String str) {
        TestDto res = testService.testServiceMethod(str);

        return "test";
    }
}
