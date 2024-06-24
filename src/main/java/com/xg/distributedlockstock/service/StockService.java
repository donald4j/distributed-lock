package com.xg.distributedlockstock.service;


import com.xg.distributedlockstock.dao.StockDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <h1> StockService </h1>
 * Created by GaoJia
 * Date  6/24/24 10:53 AM
 */
@Service
public class StockService {

    @Resource
    StockDao stockDao;

    public String deductStock(Long goodsId, int count) {

        //1、查询商品库存的库存数量
        // 2、判断库存数量是否足够
        // 3、如果库存数量足够，那么就去扣减库存
        Integer existCnt = stockDao.selectStockByGoodsId(goodsId);
        if (existCnt < count) {
            return "库存不足";
        }

        stockDao.updateStockByGoodsId(goodsId, existCnt - count);
        return "扣减库存成功";

    }
}
