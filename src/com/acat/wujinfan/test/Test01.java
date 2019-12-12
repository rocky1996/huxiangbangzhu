package com.acat.wujinfan.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-12-09
 */
public class Test01 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,8,9};
        System.out.println(Test01.getTwoNumSumToGivenValue(arr,100));
    }

    //Time:O(n),Space:O(1)
    public static int getTwoNumSumToGivenValue(int[] numbers,int target) {
        int i = 0, j = numbers.length - 1;
        while(i < j) {
            if(numbers[i] + numbers[j] > target){
                j--;
            } else if (numbers[i] + numbers[j] < target){
                i++;
            } else {
                return (i+j);
            }
        }
        return -1+(-1);
    }
}