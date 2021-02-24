package com.wb.cloud.load;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName : MyRuleBalancer
 * @Author : 王斌
 * @Date : 2020-11-23 15:54
 * @Description  自己实现负载均衡
 * @Version
 */
public class MyRuleBalancer extends AbstractLoadBalancerRule {

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
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object key) {

        return choose(getLoadBalancer(), key);
    }

    private Server choose(ILoadBalancer lb, Object key) {

        if (lb == null) {
            return null;
        }

        List<Server> allList = lb.getAllServers();

        return allList.get(getAndIncrement() % allList.size());
    }
}
