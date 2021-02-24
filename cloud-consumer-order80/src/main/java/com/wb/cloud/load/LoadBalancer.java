package com.wb.cloud.load;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName : LoadBalancer
 * @Author : 王斌
 * @Date : 2020-11-22 11:32
 * @Description
 * @Version
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);
}
