package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu
 * @ClassName: RunAppZuul
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/22 19:55
 * @Version: 1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class RunAppZuul {
    public static void main(String[] args) {
        SpringApplication.run(RunAppZuul.class,args);
    }
}
