package com.wb.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : PaymentController
 * @Author : 王斌
 * @Date : 2020-11-30 13:27
 * @Description
 * @Version
 */
@RestController
public class PayController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") long id){

        return "nacos registry, serverPort: " + serverPort + ",id= " + id;
    }
}
