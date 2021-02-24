package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @ClassName : ALiBaBaPayment9992
 * @Author : 王斌
 * @Date : 2020-11-30 13:53
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ALiBaBaPayment9992 {

    public static void main(String[] args) {
        SpringApplication.run(ALiBaBaPayment9992.class,args);
    }
}
