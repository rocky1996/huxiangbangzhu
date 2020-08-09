package com.acat.wujinfan.demo.duoxiancheng;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-06-06
 */
public class ProConDemo {
    public static void main(String[] args) {
        Resource res = new Resource();
        Producer p = new Producer(res);
        Consumer c = new Consumer(res);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Resource{
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name){
        while(flag){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.name = name + "..." + count++;
        System.out.println(Thread.currentThread().getName() + "...生产者"+this.name);

        flag = true;
        this.notifyAll();
    }

    public synchronized void out(){
        while(!flag){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "........................消费者"+this.name);

        flag = false;
        this.notifyAll();
    }
}

class Producer implements Runnable{
    private Resource res;

    public Producer(Resource res){
        this.res = res;
    }

    public void run(){
        while(true){
            res.set("+商品+");
        }
    }
}

class Consumer implements Runnable{
    private Resource res;

    public Consumer(Resource res){
        this.res = res;
    }

    public void run(){
        while(true){
            res.out();
        }
    }

}
