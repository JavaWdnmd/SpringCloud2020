package com.carve.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Function:
 * ClassName: PaymentFailbackService
 *
 * @author lmb on 2020/8/26 21:10
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------PaymentFailbackService.paymentInfo_OK() fallback";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------PaymentFailbackService.paymentInfo_TimeOut() fallback";
    }
}
