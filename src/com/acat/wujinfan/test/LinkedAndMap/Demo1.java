package com.acat.wujinfan.test.LinkedAndMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-12-18
 * 统计一个List列表中的元素出现的次数
 */
public class Demo1 {

    public static Map<String,Integer> function(List<String> items){
        if(items == null || items.size() == 0){
            return null;
        }

        Map<String,Integer> resMap = new HashMap<>();
        for(String temp : items){
            Integer count = resMap.get(temp);
            resMap.put(temp,(count==null) ? 1 : count+1);
        }

        return resMap;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");

        System.out.println(Demo1.function(list));
    }

}
