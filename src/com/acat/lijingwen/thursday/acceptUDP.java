package com.acat.lijingwen.thursday;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class acceptUDP {
    public static  void  main(String [] args) throws Exception{
        //创建接收端的socket
        DatagramSocket ds = new DatagramSocket(8888);
        byte [] buf = new byte[1024];
        //创建数据包对象，用来封装接收到的数据
        DatagramPacket dp = new DatagramPacket(buf,buf.length);
        //接受数据包
        ds.receive(dp);
        //获得实际接受的字节个数
        int len = dp.getLength();
        System.out.println("len="+len);
        //获得发送端的IP地址
        String sendIP = dp.getAddress().getHostAddress();
        //获取发送端的端口号
        int sendPort = dp.getPort();
        System.out.println("sendIP="+sendIP);
        System.out.println("sendPort="+sendPort);
        //关闭Socket释放端口号
        ds.close();
    }

}