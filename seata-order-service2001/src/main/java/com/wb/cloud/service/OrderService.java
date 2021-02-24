package com.wb.cloud.service;

import com.wb.cloud.entitles.TOrder;

/**
 * @ClassName : OrderService
 * @Author : 王斌
 * @Date : 2020-12-04 21:09
 * @Description
 * @Version
 */
public interface OrderService {

    long createOrder(TOrder order);

    int updateOrder(long userId,int status);
}
