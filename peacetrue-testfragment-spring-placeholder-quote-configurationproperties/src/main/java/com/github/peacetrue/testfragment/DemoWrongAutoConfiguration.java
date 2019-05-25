package com.github.peacetrue.testfragment;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiayx
 */
@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoWrongAutoConfiguration {

}
