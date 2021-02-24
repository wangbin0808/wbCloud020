package com.wb.cloud;

import com.wb.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : FeignMain80
 * @Author : 王斌
 * @Date : 2020-11-23 16:28
 * @Description
 * @Version
 */
@SpringBootApplication
@EnableFeignClients
// name指定服务，使用那种负载均衡策略
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyRule.class)
public class FeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignMain80.class,args);
    }
}
