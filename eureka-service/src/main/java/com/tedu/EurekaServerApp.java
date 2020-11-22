package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu
 * @ClassName: EurekaServerApp
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/18 20:45
 * @Version: 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp.class, args);
    }
}
