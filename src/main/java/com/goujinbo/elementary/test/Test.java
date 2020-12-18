package com.goujinbo.elementary.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * 测试源码
 *
 * @author BO
 * @date 2020-11-30 15:49
 * @since 2020/11/30
 **/
public class Test {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();
        objects.add("a");
        TreeSet<Object> objects1 = new TreeSet<>();
        objects1.add("b");

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("c", "d");

    }
}
