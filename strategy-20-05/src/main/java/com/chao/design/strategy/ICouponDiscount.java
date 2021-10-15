package com.chao.design.strategy;

import java.math.BigDecimal;

public interface ICouponDiscount<T> {

    /**
     * 计算折扣后的价格
     * @param skuPrice 商品原价
     * @Param couponInfo 折扣信息
     * @return 打折之后商品的价格
     *
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
