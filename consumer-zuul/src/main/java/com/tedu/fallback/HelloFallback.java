package com.tedu.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ProjectName: springcloud
 * @Package: com.tedu.fallback
 * @ClassName: HelloFallback
 * @Author: 王长远
 * @Description:
 * @Date: 2020/11/22 20:15
 * @Version: 1.0
 */
@Component
public class HelloFallback implements ZuulFallbackProvider {
    /**
     * 获取路由
     * @return
     */
    @Override
    public String getRoute() {
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse() {
            /**
             * 状态吗的值
             * @return
             * @throws IOException
             */
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.BAD_REQUEST;
            }

            /**
             * 状态码
             * @return
             * @throws IOException
             */
            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.BAD_REQUEST.value();
            }

            @Override //状态的文字
            public String getStatusText() throws IOException {
                return HttpStatus.BAD_REQUEST.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            /**
             * 返回的内容
             * @return
             * @throws IOException
             */
            @Override
            public InputStream getBody() throws IOException {
                String msg = "tonyzull";
                return new ByteArrayInputStream(msg.getBytes());
            }
            /**
             * 响应头信息
             * @return
             * @throws IOException
             */
            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
                return httpHeaders;
            }
        };
    }
}
