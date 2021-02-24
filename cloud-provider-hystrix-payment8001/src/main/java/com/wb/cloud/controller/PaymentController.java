package com.wb.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wb.cloud.entitles.CommonResult;
import com.wb.cloud.entitles.Payment;
import com.wb.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName : PaymentController
 * @Author : 王斌
 * @Date : 2020-11-18 09:43
 * @Description
 * @Version
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    AtomicInteger okInteger = new AtomicInteger(0);
    AtomicInteger failInteger = new AtomicInteger(0);

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") long id){
        System.out.println("请求次数："+okInteger.incrementAndGet() + "--线程："+Thread.currentThread().getName());
        return paymentService.paymentInfo_OK(id);
    }

    @GetMapping("/payment/hystrix/fail/{id}")
    public String paymentInfo_Fail(@PathVariable("id") long id){
        System.out.println("请求次数："+failInteger.incrementAndGet() + "--线程："+Thread.currentThread().getName());
        return paymentService.paymentInfo_Fail(id);
    }


    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") long id){
        System.out.println("请求次数："+failInteger.incrementAndGet() + "--线程："+Thread.currentThread().getName());
        return paymentService.paymentCircuitBreaker(id);
    }


}
