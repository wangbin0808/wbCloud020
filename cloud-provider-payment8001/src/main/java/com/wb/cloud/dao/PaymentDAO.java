package com.wb.cloud.dao;

import com.wb.cloud.entitles.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : PaymentDAO
 * @Author : 王斌
 * @Date : 2020-11-18 09:41
 * @Description
 * @Version
 */
@Mapper
public interface PaymentDAO {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") long id);

}
