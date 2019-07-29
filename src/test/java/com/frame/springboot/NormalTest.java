package com.frame.springboot;

import cn.hutool.core.map.MapUtil;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NormalTest {

    public static void main(String[] args) {

        Map<String, Integer> map = MapUtil.<String, Integer>createMap(ConcurrentHashMap.class);

        System.out.println(map.getClass().getName());

    }

}
