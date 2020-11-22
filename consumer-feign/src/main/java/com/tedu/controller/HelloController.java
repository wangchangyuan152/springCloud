package com.tedu.controller;

import com.tedu.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    private HelloFeign helloFeign;

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable String name){
        return helloFeign.hello(name);
    }
}
