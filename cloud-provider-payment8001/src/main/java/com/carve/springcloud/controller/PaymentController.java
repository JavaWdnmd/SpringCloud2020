package com.carve.springcloud.controller;

import com.carve.springcloud.entity.CommonResult;
import com.carve.springcloud.entity.Payment;
import com.carve.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Function:
 * ClassName: PaymentController
 *
 * @author lmb on 2020/7/25 12:07
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200, "插件数据库成功", result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult get(@PathVariable Long id) {
        Payment payment = paymentService.getById(id);
        if (null != payment) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(404, "没有对应记录,查询ID:" + id, null);
        }
    }
}
