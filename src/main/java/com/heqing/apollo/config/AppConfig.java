package com.heqing.apollo.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author heqing
 * @date 2021/7/16 16:30
 */
@Configuration
@EnableApolloConfig(value = "application", order = 10)
@ComponentScan("com.heqing.apollo.*")
public class AppConfig {

}
