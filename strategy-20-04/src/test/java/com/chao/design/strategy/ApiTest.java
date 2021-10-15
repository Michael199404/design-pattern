package com.chao.design.strategy;

import com.chao.desigh.strategy.Context;
import com.chao.desigh.strategy.impl.ZJCouponDiscount;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 *
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);
    
    @Test
    public void test_zj() {
        Context<Double> context = new Context<Double>(new ZJCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(10D, new BigDecimal(100));
        logger.info("测试结果：直减优惠后的金额{}", discountAmount);
        System.out.println(discountAmount);
    }

}
