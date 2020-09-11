package com.carve.springcloud.lb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Function:
 * ClassName: LoadBalancerImpl
 *
 * @author lmb on 2020/8/23 14:56
 */
@Component
public class LoadBalancerImpl implements LoadBalancer {
    @Autowired
    private DiscoveryClient discoveryClient;

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.err.println("****** next: " + next);
        return next;
    }

    // 负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标 ， 每次服务重启动后rest 接口计数从1开始
    @Override
    public ServiceInstance instances(List<ServiceInstance> instances) {
        int index = getAndIncrement() % instances.size();
        return instances.get(index);
    }
}
