package com.tedu.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu.Controller
 * @ClassName: HelloController
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/18 20:56
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "2 我是服务的提供者:"+name;
    }
}
