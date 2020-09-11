package com.carve.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Function:
 * ClassName: LoadBalancer
 *
 * @author lmb on 2020/8/23 14:54
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> instances);

}
