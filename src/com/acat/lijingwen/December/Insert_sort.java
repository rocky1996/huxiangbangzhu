package com.acat.lijingwen.December;

public class Insert_sort {
    //插入排序呢指的是将一个数插入到有序的数列中  形成新的有序数列   如果本身为非有序数列  则将第一个数作为有序数列

    public  static void insert_sort(int arr[]){
        int  temp;
       for(int i=1;i<arr.length;i++){
           temp=arr[i];
           while ( i>=1 && arr[i-1]>temp){
               arr[i]=arr[i-1];
               i--;
           }
           arr[i]=temp;
       }
       for (int i=0 ;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
    public static void main(String [] args){
        int []arr={3,2,1,3,3};
        insert_sort(arr);
    }
}
