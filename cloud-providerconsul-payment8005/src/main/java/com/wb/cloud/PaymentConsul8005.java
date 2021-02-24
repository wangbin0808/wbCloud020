package com.wb.cloud;

import org.bouncycastle.util.Pack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : PaymentConsul8005
 * @Author : 王斌
 * @Date : 2020-11-20 16:50
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8005 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8005.class,args);
    }
}
