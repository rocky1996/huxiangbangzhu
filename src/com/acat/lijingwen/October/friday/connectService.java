package com.acat.lijingwen.October.friday;

/*
*redis的配置和导包
* redisService
* 导入jar包做法  自行下载jedis-2.9.0.jar  commons-pool2-2.4.3.jar包
* file->project strucu..->modules->add->选择导入jar的包
* */
public class connectService {
    //连接到redis服务
  /*  public static void main(String[]args){
        //连接本地的redis服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("链接成功");
        //查看服务是否运行
        System.out.println("服务正在运行："+jedis.ping());
    }*/

 /*   public static void main(String[]args){
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //存储数据到列表中
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0 ,2);
        for(int i=0; i<list.size(); i++) {
            System.out.println("列表项为: "+list.get(i));
        }
    }*/
    //redis java keys实例
/*    public static void main(String [] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }*/


}
