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

    public static void main(String[] args) {
        int[] arr={1,1,5,7,9,11,17,27,35,66,77,99,101};
        int num=6;
        int[] arr1=getSumToANum(arr,0,12,num);
        System.out.println(arr1[0]+","+arr1[1]);
    }

    public static int[] getSumToANum(int arr[],int start,int end,int num){
        int[] arr1=new int[2];
        while (start<=end){
            if (num==(arr[start]+arr[end])){
                arr1[0]=start;
                arr1[1]=end;
                break;
            }else if (num>(arr[start]+arr[end]))
                start++;
            else
                end--;
        }
        return arr1;
    }

    //2,0
    //

//    public static void main(String[] args) {
//        Map<Integer,Integer> map = new HashMap<>();
//        //key:openTime
//        //value:createTime
//        map.put(11,1);
//        map.put(12,1);
//        map.put(13,1);
//        map.put(21,2);
//        map.put(22,2);
//        map.put(23,2);
//
//        Set<Integer> set = new HashSet<>(map.values());
////        set.add(1);
////        set.add(2);
//
////        List<Integer> list = new ArrayList<>();
////        for(Integer num:set){
////            list.add(bijiao(map,num));
////        }
//
//        System.out.println(set);
//    }

//    private static Integer bijiao(Map<Integer,Integer> map,int value){
//        int min = 0;
//        //List<Integer> list = new ArrayList<>();
//        for(Map.Entry<Integer,Integer> num:map.entrySet()){
//            if(value == num.getValue()){
//                int key = num.getKey();
//                if(key < min){
//                    min = key;
//                }
//            }
//        }
//        //Collections.sort(list);
//        return min;
//    }
}
