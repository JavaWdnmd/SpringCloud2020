package com.carve.springcloud.controller;

import com.carve.springcloud.entity.CommonResult;
import com.carve.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Function:
 * ClassName: OrderController
 *
 * @author lmb on 2020/7/25 12:33
 */
@RestController
@Slf4j
public class OrderController {
    private static final String PAYMENT_URL = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;



    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult get(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }




    @PostMapping("/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }


}















