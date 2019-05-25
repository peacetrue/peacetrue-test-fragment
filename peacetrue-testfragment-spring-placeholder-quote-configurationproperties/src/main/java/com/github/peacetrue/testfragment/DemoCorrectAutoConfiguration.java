package com.github.peacetrue.testfragment;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiayx
 */
@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@PropertySource("classpath:application-demo.properties")
public class DemoCorrectAutoConfiguration {

}
