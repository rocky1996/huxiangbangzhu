package com.acat.wujinfan.paixu;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-04-03
 */
public class Maopao1 {

    public static void main(String[] args) {
        int[] a = {3,1,6,2,5};
        int temp = 0;

        int count1 = 0;
        int count2 = 0;

        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){

                count1++;


                if(a[j]>a[j+1]){
                    count2++;

                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }


        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println(count1);
        System.out.println(count2);
    }



}
