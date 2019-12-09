package com.acat.lijingwen.December;

public class Quick_sort {
    //在数组中找支点（任意）经过一趟排序后，支点左边的数都要比支点小，支点右边的数毒药比支点大
    //数组中使用递归依照人家的这个比较好的惯性，往往定义两个变量：L和R，L指向第一个数组元素
    //R指向最后数组元素
    public static void main(String args[]){
        int arr[]={1,4,5,67,2,7,8,6,9,44};
        quicksort(arr,0,arr.length-1);

    }
    /**
     * @param arr
     * @param L  指向数组的第一个数
     * @param R  指向数组的第二个数
     */
    public static void quicksort(int [] arr,int L,int R){
//        左右两端进行扫描  只要没有交替就继续
        int i=L;
        int j=R;
        int set=arr[(L+R)/2];
        //while  循环  之哟啊i,j没有交替那就一直循环
        while(i<=j){
            while(arr[i]<set)
                i++;
            while(arr[j]>set)
                j--;
            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
        }
        if (L<j)
            quicksort(arr,L,j);
        if (R>i)
            quicksort(arr,i,R);
        for (int p=0;p<arr.length;p++){
            System.out.println(arr[p]);
        }
    }
}
