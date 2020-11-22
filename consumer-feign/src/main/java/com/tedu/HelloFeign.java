package com.tedu;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu
 * @ClassName: HelloFeign
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/22 13:41
 * @Version: 1.0
 */
@FeignClient(value = "provider-user")
public interface  HelloFeign {
    @RequestMapping(value="/hello/{name}",method= RequestMethod.GET)
    public String hello(@PathVariable("name") String name);
}
