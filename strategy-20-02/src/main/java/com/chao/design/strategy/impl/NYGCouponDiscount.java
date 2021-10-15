package com.chao.design.strategy.impl;

import com.chao.design.strategy.ICouponDiscount;

/**
 * @author CHAO
 */
public class NYGCouponDiscount implements ICouponDiscount {

    public double discountAmount(double skuPrice, double discount, double ext) {
        return discount;
    }
}
