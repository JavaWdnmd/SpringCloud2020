package com.carve.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Function:
 * ClassName: PaymentMain8001
 *
 * @author lmb on 2020/7/25 11:49
 */
@SpringBootApplication
@EnableEurekaClient // 开启客户端注册
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
