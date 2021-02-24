package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : ConsulOrder80
 * @Author : 王斌
 * @Date : 2020-11-20 16:55
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder80.class,args);
    }
}
