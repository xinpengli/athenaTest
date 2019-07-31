package com.geekplus.test.athena.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = { "com.geekplus" } ,useDefaultFilters = false)
@ImportResource(locations = "classpath:config/spring/spring-client-rpc.xml")
public class MotanClient {

}
