package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : SeataApp2001
 * @Author : 王斌
 * @Date : 2020-12-04 20:56
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SeataApp2001 {

    public static void main(String[] args) {
        SpringApplication.run(SeataApp2001.class,args);
    }
}
