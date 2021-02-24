package com.wb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Mapper 和 @MapperScan 不能一起使用，使用其中一个就可以了
 * @MapperScan 使用在启动类上面，扫描包
 * @Mapper 作用在dao层类上
 */
@SpringBootApplication
//@MapperScan(value = "com.wb.cloud.dao")
@EnableDiscoveryClient
public class Payment8002 {

    public static void main(String[] args) {
        System.out.println("cloud provider payment start...");
        SpringApplication.run(Payment8002.class, args);
        System.out.println("cloud provider payment end...");
    }

}
