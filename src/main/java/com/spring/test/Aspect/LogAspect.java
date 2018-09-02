package com.spring.test.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springtest
 * @description: 日志系统AOP
 * @author: WangTengKe
 * @create: 2018-09-01
 **/
@Aspect
@Component
@Slf4j
public class LogAspect {
    //1) execution(): 表达式主体
    //2) 第一个public *号：表示返回类型， *号表示所有的类型。
    //3) 包名：表示需要拦截的包名，后面的两个句点表示当前包和当前包的所有子包，com.king.controller包、子孙包下所有类的方法。
    //4) 第二个*号：表示类名，*号表示所有的类。
    //5) *(..):最后这个星号表示方法名，*号表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数

    @Pointcut("execution(public * com.spring.test..*.*(..))")
    public void method(){}
    @Before("method()")
    public void dobefore(){
        log.info("dobefore....");
    }
    @After("method()")
    public void doafter(){
        log.info("doafter....");
    }
    @AfterReturning("method()")
    public void doreturn(){
        log.info("doreturn....");
    }
}
