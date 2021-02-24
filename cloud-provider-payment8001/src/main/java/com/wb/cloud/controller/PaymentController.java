package com.wb.cloud.controller;

import com.wb.cloud.entitles.CommonResult;
import com.wb.cloud.entitles.Payment;
import com.wb.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName : PaymentController
 * @Author : 王斌
 * @Date : 2020-11-18 09:43
 * @Description
 * @Version
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("create")
//    @PostMapping("create")
    public CommonResult create(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        if(result > 0){
            return new CommonResult<>(200,"success"+serverPort,payment.getId());
        }
        return new CommonResult(444,"fail");
    }


    @RequestMapping("get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id){
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult<>(200,"success"+serverPort,payment);
    }

    @RequestMapping("/discovery")
    public CommonResult discovery(){
        List<String> services = discoveryClient.getServices();
        services.forEach(log::info);
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(serviceInstance -> {
            log.info(serviceInstance.getHost()+"--"+serviceInstance.getServiceId()+"--"+serviceInstance.getPort());
        });
        return new CommonResult<>(200,"success"+serverPort,services);
    }

    // 这个是为了feign的超时功能，ribbon默认的调用超时时间是1秒
    @RequestMapping("get/timeout")
    public String getPayment(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

}
