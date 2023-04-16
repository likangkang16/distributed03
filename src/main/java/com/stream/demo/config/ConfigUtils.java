package com.stream.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConfigUtils
 * @Description //TODO
 * @Author lkk
 * Date 2023/04/14/17:11
 * @Version 1.0
 **/
@Configuration
public class ConfigUtils {


    @Bean
    public RestTemplate setRestTemplate(){
        RestTemplate restTemplate =new RestTemplate();
        return restTemplate;
    }

}
