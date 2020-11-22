package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu
 * @ClassName: RunAppHystrix
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/22 19:06
 * @Version: 1.0
 */
@SpringCloudApplication        //内置开启hystrix
@EnableFeignClients            //开启feign
public class RunAppHystrix {
    public static void main(String[] args) {
        SpringApplication.run(RunAppHystrix.class, args);
    }
}
