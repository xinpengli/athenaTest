package com.geekplus.test.athena.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:config/spring/spring-client-rpc.xml")
public class ClientRpcConfiguration {
}
