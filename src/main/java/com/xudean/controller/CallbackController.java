package com.xudean.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.LinkOption;
import java.util.Enumeration;
import java.util.Iterator;

@RestController
@Slf4j
public class CallbackController {
    @PostMapping("/**")
    public String callback(
            HttpServletRequest httpServletRequest,
            @RequestBody(required = false) String body){
        String requestURI = httpServletRequest.getRequestURI();
        log.info("URI is:");
        log.info(requestURI);
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        Iterator<String> iterator = headerNames.asIterator();
        log.info("Header is: ");
        while (iterator.hasNext()){
            String name = iterator.next();
            log.info("{} : {}",name,httpServletRequest.getHeader(name));
        }
        log.info("Body is:");
        log.info(body);
        return "success";
    }
}
