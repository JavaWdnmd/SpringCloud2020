package com.carve.springcloud.service.impl;

import com.carve.springcloud.dao.PaymentDao;
import com.carve.springcloud.entity.Payment;
import com.carve.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function:
 * ClassName: PaymentServiceImpl
 *
 * @author lmb on 2020/7/25 12:04
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentDao.getById(id);
    }
}
