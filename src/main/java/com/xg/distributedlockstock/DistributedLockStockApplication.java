package com.xg.distributedlockstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DistributedLockStockApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DistributedLockStockApplication.class);
        Environment env = app.run(args).getEnvironment();
        System.out.println("启动成功！！");
//        System.out.printf("测试地址: \thttp://127.0.0.1:{}{}/deductstock", env.getProperty("server.port"), env.getProperty(
//                "server.servlet.context-path"));
        System.out.print("测试地址: \thttp://127.0.0.1:9000/stock/deductstock/1/1\n");
    }
}
