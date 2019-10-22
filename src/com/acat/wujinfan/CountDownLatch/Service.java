package com.acat.wujinfan.CountDownLatch;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-10-21
 */


/**
 * 模拟跑步
 */
public class Service {

    public void testMethod(){
        try{
            System.out.println(Thread.currentThread().getName() + " begin timer "+ System.currentTimeMillis());
            Thread.sleep((long)(Math.random()*10000));//模拟每个跑步选手跑完100米所需要的时间
            System.out.println(Thread.currentThread().getName() + " end timer "+ System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
