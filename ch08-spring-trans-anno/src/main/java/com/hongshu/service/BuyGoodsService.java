package com.hongshu.service;

public interface BuyGoodsService
{
    /**
     * 购买商品的方法
     * @param goodsId 购买商品的编号
     * @param nums 购买商品的数量
     */
    void buy(Integer goodsId,Integer nums);
}
