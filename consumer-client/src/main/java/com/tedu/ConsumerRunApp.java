package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu
 * @ClassName: ConsumerRunApp
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/22 11:52
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerRunApp {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRunApp.class, args);
    }
}
