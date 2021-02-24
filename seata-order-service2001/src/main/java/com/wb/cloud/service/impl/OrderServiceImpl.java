package com.wb.cloud.service.impl;

import com.wb.cloud.dao.OrderDao;
import com.wb.cloud.entitles.TOrder;
import com.wb.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : OrderServiceImpl
 * @Author : 王斌
 * @Date : 2020-12-04 21:09
 * @Description
 * @Version
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;


    @Override
    public long createOrder(TOrder order) {
        return orderDao.createOrder(order);
    }

    @Override
    public int updateOrder(long userId, int status) {
        return 0;
    }
}
