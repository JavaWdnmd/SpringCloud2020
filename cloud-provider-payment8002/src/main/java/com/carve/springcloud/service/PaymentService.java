package com.carve.springcloud.service;

import com.carve.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Function:
 * ClassName: PaymentService
 *
 * @author lmb on 2020/7/25 12:04
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getById(@Param("id") Long id);
}
