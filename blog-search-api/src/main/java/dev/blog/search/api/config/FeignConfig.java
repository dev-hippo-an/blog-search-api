package dev.blog.search.api.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "dev.blog.search.api.feign")
public class FeignConfig {

}