package com.github.peacetrue.testfragment;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xiayx
 */
@Data
@ConfigurationProperties(prefix = "peacetrue.testfragment")
public class DemoProperties {

    private String name = "hi";

}
