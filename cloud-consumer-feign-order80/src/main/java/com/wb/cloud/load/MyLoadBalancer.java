package com.wb.cloud.load;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName : MyLoadBalancer
 * @Author : 王斌
 * @Date : 2020-11-21 18:05
 * @Description 自己实现一个轮询均衡算法
 * @Version
 */
@Component
public class MyLoadBalancer implements LoadBalancer {


    private AtomicInteger atomicInteger = new AtomicInteger(0);


    /**
     * 通过自旋来更新
     * @return
     */
    public final int getAndIncrement(){

        int current;
        int next;
        do{
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        }while (!atomicInteger.compareAndSet(current,next));
        System.out.println ( "******* 第几次访问,次数next: " + next );
        return next;
    }


    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstanceList) {
        int index = getAndIncrement() %  serviceInstanceList.size();

        return serviceInstanceList.get(index);
    }
}
