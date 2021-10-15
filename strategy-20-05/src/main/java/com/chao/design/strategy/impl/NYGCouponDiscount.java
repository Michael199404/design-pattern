package com.chao.design.strategy.impl;

import com.chao.design.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * n元购买
 * 无论多少钱都按n元购买
 * @author CHAO
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {

    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
