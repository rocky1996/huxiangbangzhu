package com.acat.lijingwen.saturday;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

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
/**工作线程  线程池创建线程时 会将县城封装成工作县城Worker   Worker在执行完任务后还会循环获取工作队列里的任务来执行  底下的worker的run（）方法就可以看出 */
/*public void run(){
    try{
        Runnable task = firstTask;
        firstTask = null;
        while(task != null || (task=getTask())!=null){
            runTask(task);
            task = null;
        }

    }finally {
        workerDone(this);
    }
}*/

/*
* 线程池中的线程执行任务分两种情况
* 1.在execute()方法中创建一个线程时，会让这个线程执行当前任务
* 2.这个线程执行完上图中的1任务后会犯毒瘾从BlockingQueue获取任务来执行
* */
//线程池的使用（通过ThreadPoolExcutetor 来创建一个线程池）
/*    new ThreadPoolExecutor(corePoolSize,maximumPoolSize,keepAliveTime,milliseconds,runnableTaskQueue,handler);

    Public ThreadPoolExcutor(int corePoolSize,
                             Int maximumPoolSize,   //线程池最大数量
                             Long keepAliveTime,    //线程活动保持时间
                             TimeUilt unit,	   //线程活动保持时间的单位
                             BlockingQueue<Runnable> workQueue，
                                     ThreadFactory threadfactory,
                             RejectedExecutionHandler handler    */
                             //饱和策略  如果队列和线程池都满了说明线程池处于饱和状态
                             // 必须采取一种策略处理提交的新任务 这个策略默认情况下是AbortPolicy表示无法处理新任务时抛出异常
                             /*有四种策略
                                     1.AbortPolicy:不执行新任务  直接抛出异常 提示线程池已满
                                     2.DIsCardPolicy ：不执行新任务，也不抛出异常
                                     3.DIsCardOldSetPolicy：将消息队列中的第一个任务替换为当前新进来的任务执行
                                     4.CallerRunsPolicy：直接调用execute  来执行当前任务*/
  /*  )*/
//可以使用两种方法向线程池提交任务
    //excute()方法用于提交不需要返回值的任务  所以无法判断任务是否被线程池执行成功
/*    threadsPool.execute(new Runnable()){
        public void run(){

        }
    }*/
    //submit()用于提交需要返回值的任务  通过返回的future对象可以判断任务是否执行成功
//    可以通过future的get方法获取返回值
/*
Future <Object> future = executor.submit(hanReturnValuetask);
    try{
        Object s=future.get();
    }catch(InterruptedException){
        //处理中断异常
    }catch(ExecutionException e){
        //处理无法执行任务异常
    }finally{
        //关闭线程池
        executor.shutdown();
    }
*/
//关闭线程池是通过  shutdown()或者 shutdownNow()(当线程不一定要执行完时调用此方法)
}
