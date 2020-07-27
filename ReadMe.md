# 简介
尚硅谷SpringCloud2020跟学代码

# 项目结构
com.carve.springcloud  
    ├─ cloud-api-common                         通用模块  
    ├─ cloud-provider-payment8001               支付提供者服务    
    ├─ cloud-consumer-order80                   订单消费者服务  
    ├─ cloud-eureka-server7001                  Eureka注册中心7001  
    ├─ cloud-eureka-server7002                  Eureka注册中心7002  
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