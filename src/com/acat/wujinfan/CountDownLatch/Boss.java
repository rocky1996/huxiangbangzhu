package com.acat.wujinfan.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-08-20
 */
public class Boss implements Runnable{

    private CountDownLatch countDownLatch;

    public Boss(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("老板正在等所有的工人干完活......");
        try{
            this.countDownLatch.await();
        }catch (InterruptedException e){

        }
        System.out.println("工人活都干完了，老板开始检查了！");
    }
}
