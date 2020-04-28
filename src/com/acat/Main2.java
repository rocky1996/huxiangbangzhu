package com.acat;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-04-16
 */

import sun.invoke.empty.Empty;

import javax.lang.model.type.ArrayType;
import java.util.*;

/**
 * 有序的整数数组[2,3,5,7,9,10,11,12,13,14]，寻找满足[]+[]=K条件的值。如果 K=12，则输出(2,10)(3,9)(5,7)组合的对，要求时间和空间复杂度尽可能的低。
 */
public class Main2 {

//    public static void main(String[] args) {
//        int[] array = {2,3,5,7,9,10,11,12,13,14};
//        vaildateSum(array,array.length,12);
//    }
//
//    public static void vaildateSum(int[] array,int length,int sum){
//        int i = 0;
//        int j = length-1;
//      //  boolean flag = false;
//
//        while(i < j){
//            int result = array[i] + array[j];
//            if(result > sum){
//                j--;
//            }else if(result > sum){
//                i++;
//            } else if(result == sum){
//                System.out.println(array[i]+","+array[j]);
//            }
//        }
//    }

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        //key:openTime
        //value:createTime
        map.put(11,1);
        map.put(12,1);
        map.put(13,1);
        map.put(21,2);
        map.put(22,2);
        map.put(23,2);

        Set<Integer> set = new HashSet<>(map.values());
//        set.add(1);
//        set.add(2);

//        List<Integer> list = new ArrayList<>();
//        for(Integer num:set){
//            list.add(bijiao(map,num));
//        }

        System.out.println(set);
    }

    private static Integer bijiao(Map<Integer,Integer> map,int value){
        int min = 0;
        //List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> num:map.entrySet()){
            if(value == num.getValue()){
                int key = num.getKey();
                if(key < min){
                    min = key;
                }
            }
        }
        //Collections.sort(list);
        return min;
    }
}
