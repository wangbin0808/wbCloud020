package com.wb.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : OrderNacosController
 * @Author : 王斌
 * @Date : 2020-11-30 14:12
 * @Description
 * @Version
 */
@RestController
public class OrderNacosController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String SERVICE_PATH;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") long id){

        return restTemplate.getForObject(SERVICE_PATH + "/payment/nacos/" + id,String.class);
    }
}
