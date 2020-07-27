package com.carve.springcloud.dao;

import com.carve.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Function:
 * ClassName: PaymentDao
 *
 * @author lmb on 2020/7/25 11:57
 */
@Mapper
@Repository
public interface PaymentDao {
    int create(Payment payment);

    Payment getById(@Param("id") Long id);
}
