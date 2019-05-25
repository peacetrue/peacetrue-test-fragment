package com.github.peacetrue.testfragment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author xiayx
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {
        PropertyPlaceholderAutoConfiguration.class,
        DemoWrongAutoConfiguration.class
})
public class DemoWrongAutoConfigurationTest {

    @Value("${peacetrue.testfragment.name:}")
    private String name;
    @Value("${peacetrue.testfragment.quote-name:}")
    private String quoteName;

    @Test
    public void placeholder() {
        Assert.assertEquals("", name);
        Assert.assertEquals("!", quoteName);
    }
}