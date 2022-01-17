package com.chao.design.build.strategy;

import com.chao.design.build.strategy.impl.MJCouponDiscount;
import com.chao.design.build.strategy.impl.NYGCouponDiscount;
import com.chao.design.build.strategy.impl.ZJCouponDiscount;
import com.chao.design.build.strategy.impl.ZKCouponDiscount;

import java.math.BigDecimal;

/**
 * 将策略模式和工厂模式进行结合
 * @param <T>
 */
public class Context<T> {

    private ICouponDiscount<T> iCouponDiscount;

    public Context(String type) {
        if ("满减".equals(type)) {
            ICouponDiscount mjCouponDiscount = new MJCouponDiscount();
            iCouponDiscount = mjCouponDiscount;
        } else if ("一元购".equals(type)) {
            ICouponDiscount nygCouponDiscount = new NYGCouponDiscount();
            iCouponDiscount = nygCouponDiscount;
        } else if ("直减".equals(type)) {
            iCouponDiscount = (ICouponDiscount<T>) new ZJCouponDiscount();
//            ICouponDiscount zjCouponDiscount = new ZJCouponDiscount();
//            iCouponDiscount = zjCouponDiscount;
        } else if ("折扣".equals(type)) {
            ICouponDiscount zkCouponDiscount = new ZKCouponDiscount();
            iCouponDiscount = zkCouponDiscount;
        }
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return iCouponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
