package com.chao.design.build.strategy.impl;

import com.chao.design.build.strategy.ICouponDiscount;

/**
 * @author CHAO
 */
public class NYGCouponDiscount implements ICouponDiscount {

    public double discountAmount(double skuPrice, double discount, double ext) {
        return discount;
    }
}
