package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : SeataAccount2003
 * @Author : 王斌
 * @Date : 2020-12-04 21:30
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SeataAccount2003 {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccount2003.class,args);
    }
}
