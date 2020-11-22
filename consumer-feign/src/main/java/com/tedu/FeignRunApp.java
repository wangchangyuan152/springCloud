package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu
 * @ClassName: FeignRunApp
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/22 13:45
 * @Version: 1.0
 */
@SpringCloudApplication
@EnableFeignClients            //开启Feign
public class FeignRunApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignRunApp.class, args);
    }
}
