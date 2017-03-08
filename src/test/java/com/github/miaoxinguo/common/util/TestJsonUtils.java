package com.github.miaoxinguo.common.util;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试 Json 工具类.
 */
public class TestJsonUtils {

    @Test
    public void testParseArray() throws IOException {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("abc");
        String s = JsonUtils.toJsonString(list);
        List result = JsonUtils.parseList(s, String.class);

        Assert.assertEquals(list, result);
    }

    @Test
    public void testParseMap() throws IOException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aa");
        map.put(2, "bb");
        String s = JsonUtils.toJsonString(map);
        Map result = JsonUtils.parseMap(s, Integer.class, String.class);

        Assert.assertEquals(map, result);
    }
}
