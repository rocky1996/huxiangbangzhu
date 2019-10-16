package com.acat.lijingwen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class set_1016 {
//三个set的比较
//    public static void main (String []args){
//        HashSet<String>hashset = new HashSet<>();
//        LinkedHashSet<String>linkedHashSet = new LinkedHashSet<>();
//        TreeSet<String> treeSet = new TreeSet<>();
////        asList 方法的参数必须是对象或者对象数组  "B","E","D","C","A"
//        for(String data : Arrays.asList("a","b","d","c")){
//         hashset.add(data);
//         linkedHashSet.add(data);
//         treeSet.add(data);
//        }
//        System.out.println("hashset:"+hashset);  //有序指的是存取的顺序一致  hashset不保证有序，结果虽然可能有序但是不可依赖
//        System.out.println("linkedhashset"+linkedHashSet);  //先进先出按插入顺序排序
//        System.out.println("treeset"+treeSet); //treeset内部进行了排序
//    }

    //treeset的排序比较
    public static void main(String []args){
        //自然顺序的排序
        TreeSet<Integer> ts =new TreeSet<>();
        ts.add(20);
        ts.add(22);
        ts.add(21);
        for (int i : ts){
            System.out.println(i);
        }
    }
}
