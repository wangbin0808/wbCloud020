package com.wb.cloud.controller;

import com.wb.cloud.service.PaymentFeignService;
import com.wb.cloud.entitles.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : OrderFeignController
 * @Author : 王斌
 * @Date : 2020-11-23 16:38
 * @Description
 * @Version
 */
@RestController
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @RequestMapping("/feign/get/{id}")
    public CommonResult create(@PathVariable("id") long id){

        return paymentFeignService.getPayment(id);
    }

    @RequestMapping("/feign/get/timeout")
    public String getPayment(){
        return paymentFeignService.getPayment();
    }

}
