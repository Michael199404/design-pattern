package com.chao.design.strategy.impl;

import com.chao.design.strategy.ICouponDiscount;

/**
 * @author CHAO
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {

    @Override
    public double discountAmount(Double couponInfo, Double skuPrice) {
        return skuPrice - couponInfo;
    }

}
