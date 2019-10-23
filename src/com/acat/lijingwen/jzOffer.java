package com.acat.lijingwen;

import java.util.Scanner;
import java.util.Stack;

public class jzOffer {

  /*  //用两个栈来实现一个队列
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        }

        return stack2.pop();
    }*/
  //3+33+333+...
/*  public static double Count(int num,int cycle){
      double sum=0;
      for (int j=cycle-1;j>=0;j--){

          double number=0;
          for(int i=j;i>=0;i--){
              number=number+num*(Math.pow(10,i));
          }
          sum+=number;
      }
      return sum;
  }

  public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      System.out.println("输入值");
      int a=sc.nextInt();
      int b=sc.nextInt();
      double num= Count(a,b);
      System.out.println(num);
  }*/


//半成品想法 好像倒置想错了

  /*public static int minNumberInRotateArray(int [] array) {
      //进行倒置
      int b=array.length/2;
      for(int i=0;i<array.length;i++){
          int temp;
          if (b%2==0) {
              temp = array[b];
              array[b] = array[i];
              array[i]=temp;
              b++;
              if (b >= array.length)
                  break;
          }else{
              temp = array[b+1];
              array[b+1] = array[i];
              array[i]=temp;
              b++;
              if (b >= array.length)
                  break;

          }
      }

      //输出转后的array
      for(int j=0;j<array.length;j++){
          System.out.println("          System.out.println(输出转后的array);\n");
          System.out.println(array[j]);
      }
      //输出倒置的最小值
      if(array.length==0){
          System.out.println("是空数组");
          return 0;
      }
      if((array.length%2)==0){
         int g=(array.length)/2;
          return array[(array.length)/2];
      }else{
          int c=(array.length)/2+1;
          return array[(array.length)/2+1];
      }

  }*/
//大佬想法
    /*public static int minNumberInRotateArray1(int [] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] < array[j]) {
                return array[i];
            }
            int mid = (i + j) >> 1;
            if (array[mid] > array[i]) {
                i = mid + 1;
            } else if (array[mid] < array[j]) {
                j = mid; // 如果是mid-1，则可能会错过最小值，因为找的就是最小值
            } else i++;  // 巧妙避免了offer书上说的坑点（1 0 1 1 1）
        }
        return array[i];
    }

  public static void main(String []args){
      int[] array={1,2,3,4,5};
      int a=minNumberInRotateArray(array);
      System.out.println("a="+a);
  }*/

/*    public static int feibo(int n){
        int [] array=new int[39];
        array[0]=1;
        array[1]=1;
        for (int i=2;i<n;i++){
            array[i]=array[i-1]+array[i-2];
        }
        if (n==0) {
            return 0;
        }else if(n==1||n==2){
            return 1;
        }else {
            return array[n-1];
        }
    }
    public static void main(String [] args){
        int a=5;
        int key=feibo(a);
        System.out.println(key);
    }*/

//在你面前有一个n阶的楼梯，你一步只能上1阶或2阶。
//请问计算出你可以采用多少种不同的方式爬完这个楼梯。

    //这个只有百分之40的通过率    why？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？
    public static int JumpFloor(int target) {
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        return(JumpFloor(target-1)+JumpFloor(target-2));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int result=JumpFloor(b);
        System.out.println(result);
    }
}
