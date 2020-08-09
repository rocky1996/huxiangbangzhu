package com.acat.wujinfan.demo.duoxiancheng;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-06-06
 */
public class OutputDemo {

    public static void main(String[] args) {
        Res r = new Res();
        Input input = new Input(r);
        Output output = new Output(r);

        Thread t1 = new Thread(input);
        Thread t2 = new Thread(output);

        t1.start();
        t2.start();


    }
}

class Res{
    private String name;
    private String sex;
    private boolean flag = false;

    public synchronized void set(String name,String sex){
        if(flag){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.name = name;
        this.sex = sex;

        flag = true;
        this.notify();
    }

    public synchronized void out(){
        if(!flag){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(name +"......"+sex);

        flag = false;
        this.notify();
    }
}

class Input implements Runnable{

    private Res r;
    Input(Res r){
        this.r = r;
    }

    public void run(){
        boolean b = true;
        while (true){
            if(b){
                r.set("A","A");
                b = false;
            }else {
                r.set("B","B");
                b = true;
            }
        }
    }
}

class Output implements Runnable{

    private Res r;
    Output(Res r){
        this.r = r;
    }

    public void run(){
        while (true){
            r.out();
        }
    }
}
