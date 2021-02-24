package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName : EurekaMain7001
 * @Author : 王斌
 * @Date : 2020-11-18 21:40
 * @Description  @EnableEurekaServer 开启注册中心服务
 * @Version
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

    public static void main(String[] args) {
        System.out.println("----EurekaMain7002 start --");
        SpringApplication.run(EurekaMain7002.class,args);
        System.out.println("----EurekaMain7002 end --");
    }
}
