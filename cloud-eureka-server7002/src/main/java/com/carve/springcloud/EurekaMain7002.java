package com.carve.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Function:
 * ClassName: EurekaMain7002
 *
 * @author lmb on 2020/7/26 16:23
 */
@SpringBootApplication
@EnableEurekaServer // 开启服务注册中心
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
    }

}
