package com.acat.wujinfan.CountDownLatch;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-10-21
 */

import java.util.concurrent.CountDownLatch;

/**
 * 模拟一名参赛选手
 */
public class MyThread extends Thread{

    private Service service;

    private final CountDownLatch begin;

    private final CountDownLatch end;

    public MyThread(Service service,CountDownLatch begin,CountDownLatch end){
        this.service = service;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        try{
            begin.await();//每个选手都站在自己的跑跑道上,做好了比赛的准备，正在准备裁判鸣枪开始比赛
            service.testMethod();//听到鸣枪后开始比赛
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            end.countDown();//其中的一个参赛选手已经开始跑完了
        }
    }
}
