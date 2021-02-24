package com.wb.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName : PaymentFallbackService
 * @Author : 王斌
 * @Date : 2020-11-24 10:48
 * @Description PaymentService 统一的异常处理类
 * @Version
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public String paymentInfo_OK(long id) {
        return "服务异常  paymentInfo_OK";
    }

    @Override
    public String paymentInfo_Fail(long id) {
        return  "服务异常  paymentInfo_Fail";
    }
}
