package com.chao.design.build.strategy.impl;

import com.chao.design.build.strategy.ICouponDiscount;

import java.util.Map;

public class MJCouponDiscount implements ICouponDiscount<Map<String, Double>> {

    @Override
    public double discountAmount(Map<String, Double> couponInfo, Double skuPrice) {
        //满
        Double x = couponInfo.get("x");
        //减
        Double o = couponInfo.get("o");

        if (skuPrice < x) {
            return skuPrice;
        } else {
            return skuPrice - o;
        }
    }
}
