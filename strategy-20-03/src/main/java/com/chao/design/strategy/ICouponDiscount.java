package com.chao.design.strategy;

public interface ICouponDiscount<T> {

    /**
     * 计算折扣后的价格
     * @param skuPrice 商品原价
     * @Param couponInfo 折扣信息
     * @return 打折之后商品的价格
     *
     */
    double discountAmount(T couponInfo, Double skuPrice);
}
