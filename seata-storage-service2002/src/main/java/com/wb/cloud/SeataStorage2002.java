package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : SeataStorage2002
 * @Author : 王斌
 * @Date : 2020-12-04 21:31
 * @Description
 * @Version
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SeataStorage2002 {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorage2002.class,args);
    }
}
