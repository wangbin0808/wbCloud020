package com.wb.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : LoggerConfig
 * @Author : 王斌
 * @Date : 2020-11-23 17:13
 * @Description
 * @Version
 */
@Configuration
public class LoggerConfig {

    /**
     * 开启feign的日志功能
     * @return
     */
    @Bean
    public Logger.Level loggerLevel(){
        return Logger.Level.FULL;
    }
}
