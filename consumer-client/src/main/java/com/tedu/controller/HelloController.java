package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu.controller
 * @ClassName: HelloController
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/22 11:41
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable String name) {
        String url = "http://localhost:7900/hello/" + name;
        url = "http://PROVIDER-USER/hello/" + name;
        return this.restTemplate.getForObject(url, String.class);
    }
}
