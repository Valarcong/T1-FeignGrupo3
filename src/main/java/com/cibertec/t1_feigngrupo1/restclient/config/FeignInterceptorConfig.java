package com.cibertec.t1_feigngrupo1.restclient.config;

import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@Configuration
public class FeignInterceptorConfig implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template
        .header("Authorization",
         "Bearer token");
    }
}
