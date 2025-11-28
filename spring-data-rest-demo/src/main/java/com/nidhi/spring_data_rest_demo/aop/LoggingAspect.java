package com.nidhi.spring_data_rest_demo.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LoggingAspect {

    public static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);


    public void logMethodCall() {
        LOGGER.info("Method Called");
    }

}