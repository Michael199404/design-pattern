package com.chao.design.strategy.impl;

import com.chao.design.strategy.ICouponDiscount;

/**
 * @author CHAO
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {

    @Override
    public double discountAmount(Double couponInfo, Double skuPrice) {
        return couponInfo;
    }
}
