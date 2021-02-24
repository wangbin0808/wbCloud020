package com.wb.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName : PaymentController
 * @Author : 王斌
 * @Date : 2020-11-19 21:36
 * @Description
 * @Version
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul/get")
    public String test(){

        return "spring cloud " + serverPort + "---" + UUID.randomUUID().toString();
    }


}
