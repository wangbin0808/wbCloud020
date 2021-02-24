package com.wb.cloud.service;

import com.wb.cloud.entitles.CommonResult;
import com.wb.cloud.entitles.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName : PaymentFeignService
 * @Author : 王斌
 * @Date : 2020-11-23 16:36
 * @Description
 * @Version
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @RequestMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id);

    /**
     * 测试超时
     * @return
     */
    @RequestMapping("/payment/get/timeout")
    public String getPayment();
}
