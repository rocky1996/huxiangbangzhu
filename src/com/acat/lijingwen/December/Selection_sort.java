package com.acat.lijingwen.December;

public class Selection_sort {
    //选择排序，每次从待排序的数据元素中选出最小或最大的元素，  是不稳定的排序
    //稳定与否就是相同数据是否经过排序后顺序是否会混乱
    public static void selection(int array[]){

        for(int i=0;i<array.length-1;i++){
            int pos=0;
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]>array[pos]){
                     pos=j;
                 }
            }
            int temp =0;
            temp=array[pos];
            array[pos]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static  void main (String [] args){
        int[] arrays = {2, 3, 1, 4, 3, 5, 1, 6, 1, 2, 3, 7, 2, 3};
        selection(arrays);
    }
}
