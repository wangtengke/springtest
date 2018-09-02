package com.spring.test.Controller;

import com.spring.test.Service.AspectService;
import com.spring.test.Service.testService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springtest
 * @description: aop的具体类
 * @author: WangTengKe
 * @create: 2018-09-01
 **/
@Slf4j
@RestController
public class AspectMethod {
    @Autowired
    AspectService aspectService;
    @Autowired
    testService testService;
    @GetMapping("/test")
    public void visit(){
        aspectService.aspect();
        log.info("visit.........");
        log.info("finished");
        testService.test();
    }
}
