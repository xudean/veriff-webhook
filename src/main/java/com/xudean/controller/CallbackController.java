package com.xudean.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CallbackController {
    @PostMapping("/**")
    public String callback(@RequestBody(required = false) String body){
        log.info("get body from veriff:");
        log.info(body);
        return "success";
    }
}
