package com.geekplus.test.athena.application;


import com.geekplus.test.athena.application.initialization.InitRunner;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableAsync;


/**
 * 默认启动类
 * @author wanghao
 */
@EnableAsync
@EnableAutoConfiguration
@MapperScan({"com.geekplus.test.*.dao"})
@ComponentScan(basePackages = "com.geekplus.test.athena"
        ,excludeFilters ={@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,
        classes ={com.geekplus.test.athena.config.MotanClient.class})})
@SpringBootApplication
public class ApplicationStart {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationStart.class);
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationStart.class,args);
        logger.info("start success");
    }
}

