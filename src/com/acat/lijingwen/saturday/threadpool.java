package com.acat.lijingwen.saturday;

public class threadpool {
    //线程池执行任务方法
/*
    public void execute (Runnable command){
        if(command == null)
            throw new NullPointerException();        }
        //如果线程数小于基本线程数，则创建线程并执行当前任务
    if(poolSize>=corePoolSize || !addIFUnderCorePoolSize(command)){
        //如果线程数大于等于基本线程数或线程创建失败，则将当前任务放到工作队列中
        if(runState == RUNNING && workQueue.offer(command)){
            if(runnState != RUNNING || poolsize==0){
                ensureQueuedTaskHandled(command);
            }
        }
        //如果线程池不处于运行中或任务无法放入队列  并且当前线程数量小于最大允许的线程数量
        //则创建一个县城执行任务
        else if(!addIFUnderMaxiumPoolSize(command))
            reject(command);//is  shutdown or saturated
    }
*/

}
