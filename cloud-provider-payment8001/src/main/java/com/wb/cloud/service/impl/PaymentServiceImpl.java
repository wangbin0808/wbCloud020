package com.wb.cloud.service.impl;

import com.wb.cloud.dao.PaymentDAO;
import com.wb.cloud.entitles.Payment;
import com.wb.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : PaymentServiceImpl
 * @Author : 王斌
 * @Date : 2020-11-18 09:43
 * @Description
 * @Version
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDAO paymentDAO;


    @Override
    public int create(Payment payment) {
        return paymentDAO.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDAO.getPaymentById(id);
    }
}
