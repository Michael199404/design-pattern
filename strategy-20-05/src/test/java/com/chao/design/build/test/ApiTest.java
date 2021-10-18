package com.chao.design.build.test;

import com.chao.design.build.strategy.Context;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_zj() {
        Context<Double> context = new Context<Double>("直减");
        BigDecimal discountAmount = context.discountAmount(10D, new BigDecimal(100));
        logger.info("测试结果：直减优惠后的金额{}", discountAmount);
        System.out.println(discountAmount);
    }

}
