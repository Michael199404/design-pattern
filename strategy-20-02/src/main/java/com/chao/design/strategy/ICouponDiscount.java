package com.chao.design.strategy;

public interface ICouponDiscount {

    /**
     *
     * @param skuPrice 商品原价
     * @param discount 折扣
     * @param ext 额外字段
     * @return 打折之后商品的价格
     *
     * 缺点：只能用discount和ext来作为入参决定如何打折，不灵活，如果需要三个参数这个接口就不行了，可以考虑使用泛型来解决这个问题
     */
    double discountAmount(double skuPrice, double discount, double ext);
}
