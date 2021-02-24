package com.wb.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wb.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName : PaymentController
 * @Author : 王斌
 * @Date : 2020-11-23 21:52
 * @Description
 * @Version
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod") // 全局的异常处理
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    AtomicInteger okInteger = new AtomicInteger(0);
    AtomicInteger failInteger = new AtomicInteger(0);

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") long id){
        System.out.println("请求次数："+okInteger.incrementAndGet() + "--线程："+Thread.currentThread().getName());
        return paymentService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/fail/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_Fail_handler",commandProperties ={
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    @HystrixCommand
    public String paymentInfo_Fail(@PathVariable("id") long id){
        System.out.println("请求次数："+failInteger.incrementAndGet() + "--线程："+Thread.currentThread().getName());
        return paymentService.paymentInfo_Fail(id);
    }

    public String paymentInfo_Fail_handler(long id){
        return "线程池打满:" + Thread.currentThread().getName() + " consumer--paymentInfo_Fail_handler id="+ id;
    }

    public String payment_Global_FallbackMethod(){
        return "Global 异常处理信息，请稍后再试";
    }
}
