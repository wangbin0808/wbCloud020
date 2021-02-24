package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : MainApp8401
 * @Author : 王斌
 * @Date : 2020-12-01 17:35
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients
public class MainApp8401 {

    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class,args);
    }
}
