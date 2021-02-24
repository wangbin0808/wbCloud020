package com.wb.cloud.controller;

import com.wb.cloud.entitles.CommonResult;
import com.wb.cloud.entitles.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @ClassName : OrderController
 * @Author : 王斌
 * @Date : 2020-11-18 19:36
 * @Description
 * @Version
 */
@RequestMapping("order")
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    // eureka关心的是服务的名称，通过服务名称会去注册中心找到对应的服务，如果是集群的话，要配置上负载均衡的策略
    public final static String PAYMENT_URL ="http://CLOUD-PAYMENT-SERVICE";

    @RequestMapping("create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }


    @RequestMapping("get/{id}")
    public CommonResult getPayment(@PathVariable("id") long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

}
