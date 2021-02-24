package com.wb.cloud.service;

import com.wb.cloud.entitles.Payment;

/**
 * @ClassName : PaymentService
 * @Author : 王斌
 * @Date : 2020-11-18 09:42
 * @Description
 * @Version
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(long id);
}
