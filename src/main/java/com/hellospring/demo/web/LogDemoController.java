package com.hellospring.demo.web;

import com.hellospring.demo.common.MyLogger;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class LogDemoController {
    private final LogDemoService service;
    private final MyLogger logger;

    @RequestMapping("log-demo")
    @ResponseBody
    public String logDemo(HttpServletRequest request) {
        String requestUrl = request.getRequestURL().toString();
        logger.setRequestUrl(requestUrl);

        logger.log("controller test");
        service.logic("testId");

        return "OK";
    }
}
