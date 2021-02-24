package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import com.wb.myrule.MyRule;

/**
 * @ClassName : OrderMain80
 * @Author : 王斌
 * @Date : 2020-11-18 19:32
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableDiscoveryClient
// name指定服务，使用那种负载均衡策略
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyRule.class)
public class OrderMain80 {

    public static void main(String[] args) {
        System.out.println("------OrderMain80 start-----");
        SpringApplication.run(OrderMain80.class,args);
        System.out.println("------OrderMain80 end-----");
    }
}
