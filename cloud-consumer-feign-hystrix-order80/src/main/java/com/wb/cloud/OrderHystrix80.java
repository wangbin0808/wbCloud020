package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : PaymentHystrixMain8001
 * @Author : 王斌
 * @Date : 2020-11-23 21:50
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class OrderHystrix80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrix80.class,args);
    }
}
