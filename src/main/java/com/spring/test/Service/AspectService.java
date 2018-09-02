package com.spring.test.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: springtest
 * @description: 服务类
 * @author: WangTengKe
 * @create: 2018-09-01
 **/
@Slf4j
@Service
public class AspectService {
    public void aspect(){
        log.info("aspect");
    }
}
