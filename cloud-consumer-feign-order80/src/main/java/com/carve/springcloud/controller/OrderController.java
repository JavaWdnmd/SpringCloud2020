package com.carve.springcloud.controller;

import com.carve.springcloud.entity.CommonResult;
import com.carve.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function:
 * ClassName: OrderController
 *
 * @author lmb on 2020/7/25 12:33
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult get(@PathVariable Long id) {
        return paymentFeignService.get(id);
    }

    @GetMapping("/consumer/feign/timeout")
    public String paymentFeignTimeout() {
        return paymentFeignService.paymentFeignTimeout();
    }

}
