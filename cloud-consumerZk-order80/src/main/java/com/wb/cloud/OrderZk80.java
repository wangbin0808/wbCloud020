package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : OrderZk80
 * @Author : 王斌
 * @Date : 2020-11-19 21:42
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZk80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZk80.class,args);
    }
}
