package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : NacosPayment9001
 * @Author : 王斌
 * @Date : 2020-11-30 12:36
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ALiBaBaPayment9001 {

    public static void main(String[] args) {
        SpringApplication.run(ALiBaBaPayment9001.class,args);
    }
}
