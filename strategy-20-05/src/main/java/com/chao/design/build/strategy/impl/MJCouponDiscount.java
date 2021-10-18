package com.chao.design.build.strategy.impl;

import com.chao.design.build.strategy.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {

    /**
     * 满减计算
     * 1. 判断满足x元后-n元，否则不减
     * 2. 最低支付1元
     * @param couponInfo
     * @param skuPrice 商品原价
     * @return
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        // 满
        String x = couponInfo.get("x");
        // 减
        String o = couponInfo.get("n");

        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {
            return skuPrice;
        }

        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }

        return discountAmount;
    }


//    @Override
//    public double discountAmount(Map<String, Double> couponInfo, Double skuPrice) {
//        //满
//        Double x = couponInfo.get("x");
//        //减
//        Double o = couponInfo.get("o");
//
//        if (skuPrice < x) {
//            return skuPrice;
//        } else {
//            return skuPrice - o;
//        }
//    }


}
