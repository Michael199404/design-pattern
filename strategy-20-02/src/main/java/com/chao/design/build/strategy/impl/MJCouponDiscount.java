package com.chao.design.build.strategy.impl;

import com.chao.design.build.strategy.ICouponDiscount;

public class MJCouponDiscount implements ICouponDiscount {

    public double discountAmount(double skuPrice, double discount, double ext) {
        if (skuPrice < ext) return skuPrice;
        return skuPrice - discount;
    }
}
