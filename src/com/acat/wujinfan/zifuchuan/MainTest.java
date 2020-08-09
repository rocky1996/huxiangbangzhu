package com.acat.wujinfan.zifuchuan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-06-08
 */
public class MainTest {

//    public static String LeftRotateString(String str,int n) {
//        if(str.length() == 0){
//            return str;
//        }
//        StringBuffer buffer = new StringBuffer(str);
//        StringBuffer buffer1 = new StringBuffer(str);
//        StringBuffer buffer2 = new StringBuffer();
//        buffer.delete(0,n);
//        System.out.println(buffer);
//        buffer1.delete(n,str.length());
//        System.out.println(buffer1);
//        buffer2.append(buffer.toString()).append(buffer1.toString());
//        return buffer2.toString();
//    }

//    public static int FirstNotRepeatingChar(String str) {
//        if(str == null || str.length()==0){
//            return -1;
//        }
//        for (int i=0;i<str.length();i++){
//            char c = str.charAt(i);
//            if (str.indexOf(c)== str.lastIndexOf(c))
//                return str.indexOf(c);
//        }
//        return -1;
//    }

    public int FindGreatestSumOfSubArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum+=array[j];
                list.add(sum);
            }
        }

        if(list.size()==0){
            return 0;
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }


    public static void main(String[] args) {
//        System.out.println(LeftRotateString("abcXYZdef",3));
        //System.out.println(FirstNotRepeatingChar("abbbccc"));
    }
}
