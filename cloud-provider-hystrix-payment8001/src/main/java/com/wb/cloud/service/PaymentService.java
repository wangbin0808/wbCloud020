package com.wb.cloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @ClassName : PaymentService
 * @Author : 王斌
 * @Date : 2020-11-23 21:04
 * @Description
 * @Version
 */
@Service
public class PaymentService {

    public String paymentInfo_OK(long id){
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_OK.id = "+ id + "--success";
    }


    @HystrixCommand(fallbackMethod = "paymentInfo_Fail_handler",commandProperties ={
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })
    public String paymentInfo_Fail(long id){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_Fail.id = "+ id + "--fail";
    }

    public String paymentInfo_Fail_handler(long id){
        return "线程池打满:" + Thread.currentThread().getName() + " --paymentInfo_Fail_handler id="+ id;
    }

    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String paymentCircuitBreaker(long id){
        if(id <0){
            throw new RuntimeException("id 不能是负数 id = " + id);
        }
        String serialNumber = IdUtil.fastSimpleUUID();
        return Thread.currentThread().getName() + "调用成功，流水号：" + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(long id){
        return "id 不能是负数 paymentCircuitBreaker_fallback id = " + id ;
    }
}
