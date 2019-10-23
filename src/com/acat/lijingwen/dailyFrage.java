package com.acat.lijingwen;

public class dailyFrage {
    //引用数据类型
    public static void main(String [] args){
        int a=10,b=20;
        change(a,b);
        System.out.println("a="+a+"b="+b);
        String values1="ni";
        String values2="da";
        System.out.println("V1="+values1+",v2="+values2);
        int []array={1,2,3,4,5};
        change(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void change(int []a){
        for (int i=0;i<a.length;i++){
            a[i] *=2;
        }
    }
    public static void change(String a,String b){
        a="nihao";
        b="dashazi";
    }
    public static void change(int x,int y){
        x=100;
        y=200;
    }
}
/*
解析：此处为栈内存和堆内存的关系
栈内存的话会自动申请和释放内存，方法中的变量生存时间就是方法运行，
堆内存是程序员自己申请和释放内存，所以生命周期会比较长由程序员来决定
一和二都是因为change在栈内存中，所以当运行完毕后就会释放
输出数据为
<1>
a=10b=20
<2>
V1=ni,v2=da
<3>
2  4  6  8  10
*/
