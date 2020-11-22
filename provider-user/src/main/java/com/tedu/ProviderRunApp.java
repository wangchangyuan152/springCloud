package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu
 * @ClassName: ProviderRunApp
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/18 20:56
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderRunApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderRunApp.class, args);
    }
}
