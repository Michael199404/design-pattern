package com.chao.design.build;

/**
 * 建造者主要解决的问题是：
 * 有时候面临“一个复杂对象”的创建工作，其通常由各个部分的子对象用一定的过程构成
 * 由于需求的变化，这个复杂的对象的各个部分经常面临重大的变化
 * 但是将他们组合在一起的过程却相对稳定
 */
public interface IMenu {

    // 吊顶
    IMenu appendCeiling(Matter matter);

    // 涂料
    IMenu appendCoat(Matter matter);

    // 地板
    IMenu appendFloor(Matter matter);

    // 地砖
    IMenu appendTile(Matter matter);

    // 明细
    String getDetail();
}
