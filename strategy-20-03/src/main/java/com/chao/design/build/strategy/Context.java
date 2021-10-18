package com.chao.design.build.strategy;

public class Context<T> {

    private ICouponDiscount<T> iCouponDiscount;

    public Context(ICouponDiscount<T> iCouponDiscount) {
        this.iCouponDiscount = iCouponDiscount;
    }

    public double discountAmount(T couponInfo, Double skuPrice) {
        return iCouponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
