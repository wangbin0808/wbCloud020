package com.wb.cloud.controller;

import com.wb.cloud.entitles.CommonResult;
import com.wb.cloud.entitles.TOrder;
import com.wb.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : OrderController
 * @Author : 王斌
 * @Date : 2020-12-04 21:08
 * @Description
 * @Version
 */
@RestController
public class OrderController {


    @Autowired
    private OrderService orderService;

    @RequestMapping("/order")
    public CommonResult order(TOrder order){
        orderService.createOrder(order);
        return CommonResult.builder().build();
    }
}
