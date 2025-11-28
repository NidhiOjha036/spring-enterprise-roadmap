package com.nidhi.spring_boot_rest.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    public static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);

    //return type, classname, method name(args)

    @Before("execution(* *.*(..))")
    public void logMethodCall() {
        LOGGER.info("Method Called");
    }

}
