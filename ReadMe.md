# 简介
尚硅谷SpringCloud2020跟学代码  
项目地址: https://github.com/carve-myself/SpringCloud2020.git

# 项目结构
com.carve.springcloud  
    ├─ cloud-api-common                         通用模块  
    ├  
    ├  02 基础模块  
    ├─ cloud-provider-payment8001               普通-支付提供者服务8001    
    ├─ cloud-consumer-order80                   普通-订单消费者服务80  
    ├  
    ├  03 Eureka的服务注册与发现  
    ├─ cloud-eureka-server7001                  Eureka注册中心7001  
    ├─ cloud-eureka-server7002                  Eureka注册中心7002   
    ├  
    ├  05笔记    
    ├─ cloud-providerconsul-payment8006         consul服务提供者8006  
    ├─ cloud-consumerconsul-order80             consul服务消费者80  
    ├  
    ├  07笔记   
    ├─ cloud-consumer-order80                   Ribbon  
    ├   
    ├  08笔记    
    ├─ cloud-consumer-feign-order80             OpenFeign服务调用80  
    ├  
    ├  10笔记  
    ├─ cloud-provider-hystrix-payment8001       hystrix服务提供者8001  
    ├─ cloud-consumer-feign-hystrix-order80     hystrix服务消费者80  
    ├  
    ├  12笔记  
    ├─ cloud-consumer-hystrix-dashboard9001     hystrix服务监控Dashboard  
    ├  
    ├  
    └

# 官网文档传送门
SpringCloud: https://spring.io/projects/spring-cloud/  
这个网址是各springcloud组件的配置介绍，自己搭建组件环境可以考虑看这个。

Seata： https://seata.io/zh-cn/docs/overview/what-is-seata.html  
分布式事务解决的框架，文档介绍很详细，推荐。

Nacos： https://nacos.io/zh-cn/docs/what-is-nacos.html  
那个替代Eureka和Config的男人。

Sentinel：https://github.com/alibaba/Sentinel/wiki/%E4%BB%8B%E7%BB%8D  
在Hystrix基础上增加了流控规则和持久化,alibaba体系的一员。  
