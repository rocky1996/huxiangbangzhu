package com.acat.wujinfan.test.LinkedAndMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-12-18
 */
public class Demo2 {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("b");

        //System.out.println(Demo2.function1(list));
        //System.out.println(Demo2.function2(list));
        System.out.println(Demo2.function3(list));
    }

    //方式一:
    public static List<String> function1(List<String> list){
        for(int i=0;i<list.size();i++){
            for(int j=list.size()-1;j>i;j--){
                if(list.get(j).equals(list.get(i))){
                    list.remove(j);
                }
            }
        }
        return list;
    }

    //方式二:
    public static List<String> function2(List<String> list) {
        HashSet hashSet = new HashSet(list);
        list.clear();
        list.addAll(hashSet);
        return list;
    }

    //方式三:
    public static List<String> function3(List<String> list) {
        List<String> tempList = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(!tempList.contains(list.get(i))){
                tempList.add(list.get(i));
            }
        }

        return tempList;
    }
}
