package com.wb.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : GatewayConfig
 * @Author : 王斌
 * @Date : 2020-11-26 17:40
 * @Description
 * @Version
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){

        return builder.routes()
                .route("gateway_test1",v -> v.path("/expo").uri("http://www.xinhuanet.com/expo/2016/guonei.htm"))
                .build();
    }
}
