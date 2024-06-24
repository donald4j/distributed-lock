package com.xg.distributedlockstock.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <h1> stockDao </h1>
 * Created by GaoJia
 * Date  6/24/24 10:40 AM
 */
@Mapper
public interface StockDao {
    //1、查询商品库存的库存数量

    @Select("select stock from goods_stock where goods_id = #{goodsId}")
    Integer selectStockByGoodsId(@Param("goodsId") Long goodsId);


    //3、如果库存数量足够，那么就去扣减库存
    @Update("update goods_stock set stock = #{stock} where goods_id = #{goodsId}")
    Integer updateStockByGoodsId(@Param("goodsId") Long goodsId, @Param("stock") Integer stock);
}
