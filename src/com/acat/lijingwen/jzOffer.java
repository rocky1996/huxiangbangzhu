package com.acat.lijingwen;

import java.util.Scanner;
import java.util.Stack;
import java.lang.Math;
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
/*    public static int JumpFloor(int target) {
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
    }*/
//    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    //大佬思路，小弟没有思路  想的超级复杂
    /*
    * 大佬说   最终目标爬到第n阶台阶，所以底下的台阶经过亦或是不经过那就随意了  所以底下每一级台阶就是1  或是0  两种可能   有n-1阶台阶所以就是  2^(n-1)种可能
    * */
 /*   public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入跳到几级台阶");
        int target=sc.nextInt();
        int result=biantaitaijie(target);
        System.out.println(result);

    }
    public static int biantaitaijie(int target){
        if (target<=0)
            return 0;
        return (int)Math.pow(2,target-1);
    }*/


    /*
    * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
    * 看完人家的解析发现还是和青蛙跳的问题  然后就  嗯。。。。。醉了人家好牛逼
    * */

   /*    public static  void main(String [] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("请输入用n个2*1的小矩形");
        int target=sc.nextInt();
        int result=RectCover(target);
        System.out.println(result);

        int  a =13;
        jinzhirecover(a);

    }

   */
/*
    public static int RectCover(int target) {
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        return(RectCover(target-1)+RectCover(target-2));
    }
*/

/*
* 进制的转化   十进制转二进制  并计算其一的个数
*代码错误  10-25继续
* */
/*public  static void jinzhirecover(int number){
    int [] num=new int[8];
    boolean flag=true;
    int i=0;
    while(flag){

       num[i]=number%2;
       number=number/2;
       if (number==1||number==0){

           break;
       }
    }
    for(int j=num.length-1;j>=0;j--){
        System.out.println(num[j]);
    }
  }
    public static  void main(String [] args){
         int a=173;
//        jinzhirecover(a);
       int result = jinzhi(a);
        System.out.println(result);
    }*/

    /*大佬思想   将n与flag进行与操作初始的flag是1  每次与操作后将flag左移1  因为1的二进制位0000001
    然后每次左移就会1向前进行移动   这样就可以检查n中到底有几个1了   */
/*   public   static int jinzhi(int n){
       int count=0;
       int flag=1;
       while(flag!=0){
           if((n & flag)!=0){
               count++;
           }
           flag = flag <<1;
       }
       return  count;
   }*/
/*给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
保证base和exponent不同时为0   (终于自己搞好了一道题)*/
  /*  public double Power(double base, int exponent) {
        if((base!=0)||(exponent!=0))
        {
            double result=Math.pow(base,exponent);
            return result;
        }
        else {
            return 0;
        }
    }*/

  /*
  * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
  * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
  * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
  * 0是偶数 虽然下面的代码跑通了  但是自己给自己找到了bug  在这里没有考虑0的问题    若数组里面没有0   下面的算法就没问题0
  * */
    public static void reOrderArray(int[] array) {
        int temp=0;
        int array1[] = new int[array.length];
        int array2[] = new int[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                array1[i]=array[i];
            }else{
                array2[i]=array[i];
            }
        }
        int k=0;
        for (int j=0;j<array.length;j++){
            if(array2[j]!=0){
                array[k]=array2[j];
                k++;
            }
        }
        int p=k;
        for (int j=0;j<array.length;j++){
            if(array1[j]!=0){
                array[p]=array1[j];
                p++;
            }
        }
        for (int j=0;j<array.length;j++){
            System.out.println(array[j]);
        }
    }
    /**
     * 上述问题改良版算法
     *
     * */
    public static void updatereOrderArray(int array[]){

    }
    public static void main(String []args){
        int []array={0,1,0};
        reOrderArray(array);
    }

}
