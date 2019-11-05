package com.acat.lijingwen.October.wednesday;

/*
public class BuildThread extends Thread{
    public void run(){
        for (int i = 0;i<10;i++){
            System.out.println("gongzuo");
        }
    }
    public static void  main (String []args){
        BuildThread thread = new BuildThread();
        thread.start();
        for (int i =0;i<3;i++){
        System.out.println("changge");
    }
  }
}
*/
/*
* 总结一下：上述代码只是创建了一个线程，如果要创建多个，通过
* 继承Thread就需要创建多个不同的继承Thread的类.
* 这里通过建立一个主线程就是main函数的for循环，以及之间创建的线程表示两个线程的运行
*  */

//实现runnable
/*public class BuildThread implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("hahaha");
        }
    }
    public static void main (String [] args){
        //创建实现类对象
        BuildThread buildThread = new BuildThread();
        //创建代理类对象
        Thread t =new Thread(buildThread);
        t.start();
        //一个对象只用一次可以匿名
// 上面三步可用这一句代替 new Thread(new BuildThread()).start();
        for (int i=0;i<10;i++){
            System.out.println("changge");
        }
    }
}*/
/*
java 可以实现多个接口  这种方式常用
*/
/*public class BuildThread implements Runnable{
    //票数
    private int ticketNum=5;
    @Override
    public void run() {
        while (true){
            if(ticketNum<0)
                break;
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNum--);
        }
    }
    public static  void main (String []args){
        //一份资源
        BuildThread webT=new BuildThread();
        //多个代理
        new Thread(webT,"xiaohong").start();
        new Thread(webT,"xiaohuang").start();
        new Thread(webT,"xiaolv").start();
    }
}*/
//抢票   线程调用start（）方法并不意味着立即执行  而是到就绪状态等待cpu调度，所以每次执行的结果都是不一样的

import java.util.concurrent.*;

//实现callable  重现call方法  call有返回值且可以抛出异常
public class BuildThread implements Callable<Integer>{
    private int step = 0;
    private String name;
    private long time;
    private boolean flag = true;
    BuildThread(String name,long time){
        this.name=name;
        this.time=time;
    }
    @Override
    public Integer call() throws Exception {
        while(flag){
            Thread.sleep(time);
            step++;
        }
        return step;
    }
    public void setFlag(boolean flag){
        this.flag = flag;
    }
    public static void main (String [] args) throws InterruptedException, ExecutionException {
        //创建callable的实现类对象
        BuildThread tortoise = new BuildThread("tortoise",0);
        BuildThread rabit = new BuildThread("rabit",100);
        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(2);
        //提交执行，得到future对象
        Future<Integer> resultR=ser.submit(tortoise);
        Future<Integer> resultT=ser.submit(rabit);

        Thread.sleep(3000);
        rabit.setFlag(false);
        tortoise.setFlag(false);

        //获取结果
        int numR = resultR.get();
        int numT = resultT.get();

        System.out.println("rabbit"+numR);
        System.out.println("tortoise"+numT);

        //停止服务
        ser.shutdown();
    }
}
/**
 * 1、创建一个类实现Callable接口，然后重写call()方法
 * （和run方法不一样的是，call方法可以有返回值，并且可以抛出异常）
 * 2、创建Callable的实现类对象--》创建执行服务
 * --》提交执行服务得到Future对象--》获取结果--》停止服务
 */


