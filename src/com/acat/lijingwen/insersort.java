package com.acat.lijingwen;

import javax.swing.*;
public class insersort {
//直接插入排序
    public static void insert(int R[], int n){
      int i,j;
      int temp;
      for (i=1;i<n;i++){
          temp=R[i];//将带插入的值放到temp
          j=i-1;
          while(j>=0&&temp<R[j]){   //带插入的值小于目前的最大值  则将目前的最大值后移然后将待排的值放到前面合适的地方
              R[j+1]=R[j];
              --j;
          }
          //这里的j+1排好序的某个位置
          R[j+1]=temp;
      }
      for (int k=0;k<n;k++){
          System.out.println(R[k]);
      }
    }
    //折半插入排序**
    private static void binaryInsertSort(int arr[],int length){
        int low,high,m,temp,i,j;
        for(i = 1;i<arr.length;i++){
            //折半查找应该插入的位置
            low = 0;
            high = i-1;
            while(low <= high){
                m = (low+high)/2;
                if(arr[m] > arr[i])
                    high = m - 1;
                else
                    low = m + 1;
            }
            //统一移动元素，然后将这个元素插入到正确的位置
            temp = arr[i];
            for(j=i;j>high+1;j--){
                arr[j] = arr[j-1];
            }
            arr[high+1] = temp;
        }
        for (int k=0;k<length;k++){
            System.out.println(arr[k]);
         }
}
//剑指offer二维数组
public static boolean Find(int target, int [][] array) {
    int hang = array.length;
    int lie = array[0].length;
    boolean result=false;
    for (int i=0;i<hang;i++){
        for (int j=0;j<lie;j++){
            if (target==array[i][j]){
                result=true;
                System.out.println("数组中含有此整数");
                break;
            }
        }
        if(result)
            break;
    }
    return result;
}
    //剑指offer字符串的替换

    public static String replaceSpace() {

        String str ="acb*db de";
        return  str.toString().replaceAll(" " , "%20");
    }
    public static void main(String []args){
       /* int [] R={9,5,6,8,7,4,1,3,2};
        int Ilength=R.length;
        insersort.insert(R,Ilength);
        int [] H ={1,2,3,5,4,6};
        int Hlength=H.length;
        int key=5;
        insersort.binaryInsertSort(H,Hlength);*/
/*        int Array[][]={{1,2},{3,4}};
        int target=3;
        boolean reault=insersort.Find(target,Array);
        System.out.println("reault:"+reault);*/
       // System.out.println(length);
        String string=insersort.replaceSpace();
        System.out.println(string);
    }
}
//class Demo extends SuperClass {
//    String s = "this";
//    public static void main (String[] args) {
//        new Demo();
//    }
//
//    void display(String s){
//        System.out.println("this: "+ s);
//    }
//    Demo(){
//        super.display(s);
//    }
//}
//class SuperClass {
//    String s = "super";
//    void display( String s){
//        System.out.println("super:" + s);
//    }
//}
