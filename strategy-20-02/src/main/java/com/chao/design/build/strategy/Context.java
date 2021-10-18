package com.chao.design.build.strategy;

public class Context {

    private ICouponDiscount iCouponDiscount;

    public Context(ICouponDiscount iCouponDiscount) {
        this.iCouponDiscount = iCouponDiscount;
    }

    public double discountAmount(double skuPrice, double discount, double ext) {
        return iCouponDiscount.discountAmount(skuPrice, discount, ext);
    }
}
