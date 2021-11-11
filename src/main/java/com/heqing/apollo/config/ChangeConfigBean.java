package com.heqing.apollo.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author heqing
 * @date 2021/7/16 16:36
 */
@Component
public class ChangeConfigBean {

    private  final Logger log = LoggerFactory.getLogger(ChangeConfigBean.class);

    @ApolloConfig
    private Config config;

    private String value;

    public String getTest() {
        return value;
    }

    @Value("${test:200}")
    public void setValue(String value) {
        this.value = value;
    }

    @ApolloConfigChangeListener
    private void valueChange(ConfigChangeEvent changeEvent) {
        String key = "test";
        if (changeEvent.isChanged(key)) {
            value = config.getProperty(key,"");
            log.info("valueChange ---> " + value);
        }
    }
}
