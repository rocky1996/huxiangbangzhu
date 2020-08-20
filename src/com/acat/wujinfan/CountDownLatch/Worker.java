package com.acat.wujinfan.CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-08-20
 */
public class Worker implements Runnable{

    private CountDownLatch countDownLatch;
    private String name;

    public Worker(CountDownLatch countDownLatch,String name){
        this.countDownLatch = countDownLatch;
        this.name = name;
    }

    @Override
    public void run() {
        this.doWork();
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        }catch (InterruptedException e){

        }
        System.out.println(this.name+"活干完了!!!");
        this.countDownLatch.countDown();
    }

    private void doWork(){
        System.out.println(this.name + "正在干活!!!");
    }
}
