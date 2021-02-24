package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : Payment8004
 * @Author : 王斌
 * @Date : 2020-11-19 21:34
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004 {

    public static void main(String[] args) {
        System.out.println("-----Payment8004 start---");
        SpringApplication.run(Payment8004.class,args);
        System.out.println("-----Payment8004 end---");
    }
}
