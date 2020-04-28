package com.acat;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-04-07
 */

//金额:4
//[1,2,3]
public class Main {
//    public static void main(String[] args) {
//        int[] array = {6, -3, -2, 7, -15, 1, 2, 2};
//        //List<Integer> list = new ArrayList<>();
//
//        int maxValue = 0;
//        int thisValue = 0;
//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = i; j < array.length; j++) {
//                thisValue += array[j];
//                //list.add(sum);
//                if(thisValue > maxValue){
//                    maxValue = thisValue;
//                }
//            }
//        }
//        System.out.println(maxValue);
//
//    }

    public static void main(String[] args) {
        String str = "aabbcdeeddfft";
        //System.out.println(str.substring(0,2));

        List<String> list = new ArrayList<>();

        for(int i = 0;i<=str.length();i++) {
            for(int j = str.length();j>i;j--) {
                list.add(str.substring(i, j));
            }
        }
        //System.out.println(list);

        int maxSize = 0;
        String strtemp = null;

        for(String string:list){
            if(!function(string)){
                int length = string.length();
                if(length > maxSize){
                    maxSize = length;
                    strtemp = string;
                }
            }
        }
        System.out.println(maxSize);
        System.out.println(strtemp);
    }

    public static boolean function(String str){
        if(str.length() == 0 || str == null){
            return false;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) != str.lastIndexOf(ch)){
                return true;
            }
        }
        return false;
    }
}