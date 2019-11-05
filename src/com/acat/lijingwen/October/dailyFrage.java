package com.acat.lijingwen.October;

import javafx.util.Pair;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dailyFrage {
  /*  //引用数据类型
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
    }*/

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

/********************2019.10.29-
/**java基础规范
 * 类的第一个字母大写
 * */
/*
* 设计出物品这种类
类名：Item
物品有如下属性:
名字 name 类型是字符串String
价格 price 类型是整型 int

创建(实例化)3件具体物品
名称 价格
血瓶 50
草鞋 300
长剑 350
* */
/*   String name;
   int price;
    public static  void main(String [] args){
        dailyFrage df=new dailyFrage();
        df.name="血瓶";
        df.price=12;
        dailyFrage df1 = new dailyFrage();
        df1.name="";
        df1.price=15;
        dailyFrage df2 =new dailyFrage();
        df2.name="";
        df2.price=56;
    }*/

/*java 输入  */
/*import java.util.Scanner;
Scanner sc = new Scanner(System.in);
sc.nextInt() //输入整数
    sc.nextFloat(); //输入浮点数
    sc.nextLine();//输入字符串*/

/*
类的转化：
    子类一定可以转父类 ，但父类不一定可以转子类要转就得强制转化  ,没有继承关系的两个类互相转化肯定失败
    转化不行的时候：
    Hero h = new Hero();
    ADHero ad=new ADHero();
    Support s =new Support();
    h=s;  是子类转父类，是可以转换成功的
    ad=(ADHero)h;  是把h引用所指向的对象 Support，转换为ad引用的类型ADHero。 从语义上讲，把物理攻击英雄，当成辅助英雄来用，说不通，所以会强制转换失败，并且抛出异常
*/

/*重写
* 子类可以继承父类的对象方法
在继承后，重复提供该方法，就叫做方法的重写
又叫覆盖 override
* 多态
* 操作符的多态
+ 可以作为算数运算，也可以作为字符串连接
类的多态
父类引用指向子类对象
* 多态: 都是同一个类型，调用同一个方法，却能呈现不同的状态
*要实现类的多态，需要如下条件
1. 父类（接口）引用指向子类对象
2. 调用的方法有重写
* */
/*public static void main(String []args) {
    *//*配对提供了一种方便方式来处理简单的键值关联，当我们想从方法返回两个值时特别有用。*//*
    Pair<Integer, String> pair = new Pair<>(1, "one");
    Integer key = pair.getKey();
    String value = pair.getValue();
    System.out.println(key);
    System.out.println(value);

}*/
/*list的实际操作 */
    public static void main(String[] args) {
        String s6 = "     z   h   a   n   g  s  an     ";
        String z = s6.substring(0, s6.indexOf('z'));//开始空格
        String n = s6.substring(s6.lastIndexOf('n') + 1);//末尾空格
        String s7 = s6.trim();//去除前后空格
        ArrayList<Character> list=new ArrayList<Character>();

        char arr[]=new char[s7.length()];
        for (int i = 0; i < s7.length(); i++) {
            if (s7.charAt(i) == ' ') {
                continue;
            }char c= s7.charAt(i);
            list.add((c));
        }
        for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
        }
    }


}