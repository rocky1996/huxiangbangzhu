package com.acat.wujinfan.CountDownLatch;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-10-21
 */

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 模拟整个跑步比赛场景
 */
public class CountDownDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        CountDownLatch countDownLatch = new CountDownLatch(3);
        Worker w1 = new Worker(countDownLatch,"张三");
        Worker w2 = new Worker(countDownLatch,"李四");
        Worker w3 = new Worker(countDownLatch,"王二");

        Boss boss = new Boss(countDownLatch);
        executor.execute(w3);
        executor.execute(w2);
        executor.execute(w1);
        executor.execute(boss);
    }
}
