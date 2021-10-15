package com.chao.design.factory;

import java.util.Map;

public class AwardReq {

    // 用户唯一ID
    private String uId;

    // 奖品类型：1优惠券 2实物商品 3第三方兑换卡
    private Integer awardType;

    // 奖品编号
    private String awardNumber;

    // 业务ID
    private String bizId;

    // 扩展信息
    private Map<String, String> extMap;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }
}
