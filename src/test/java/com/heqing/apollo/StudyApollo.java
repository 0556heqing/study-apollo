package com.heqing.apollo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author heqing
 * @date 2021/11/11 19:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyApollo {

    @Value("${test}")
    public String value;

    @Test
    public void testApollo() {
        System.out.println("---> " + value);
    }
}
