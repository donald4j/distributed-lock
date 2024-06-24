package com.xg.distributedlockstock.controller;

import com.xg.distributedlockstock.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <h1> StockController </h1>
 * Created by GaoJia
 * Date  6/24/24 10:42 AM
 */
@RestController
public class StockController {

    @Resource
    StockService stockService;

    // 扣减库存 哪一件商品 扣减了几件
    @GetMapping("/deductstock/{goodsId}/{count}")
    public String deductStock(@PathVariable Long goodsId, @PathVariable int count) {
        String msg = stockService.deductStock(goodsId, count);
        return msg;
    }
}
