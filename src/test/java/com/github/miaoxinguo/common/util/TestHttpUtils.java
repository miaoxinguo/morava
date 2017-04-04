package com.github.miaoxinguo.common.util;

import org.junit.Test;

import java.io.IOException;

/**
 *
 */
public class TestHttpUtils {
    
    @Test
    public void testGet() throws IOException {
        String url = "http://www.baidu.com";
        System.out.println(HttpUtils.doGet(url));
    }
}
