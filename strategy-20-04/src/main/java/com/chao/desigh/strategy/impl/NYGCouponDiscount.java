package com.chao.desigh.strategy.impl;


import com.chao.desigh.strategy.ICouponDiscount;

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
