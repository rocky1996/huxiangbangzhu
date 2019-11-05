package com.acat.lijingwen.October.thursday;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class sendUDP {
    public static void main(String [] args) throws Exception{
        //定义字符串要发送内容
        byte [] content = "我爱java".getBytes();
        //创建数据包对象：用来封装要发送的数据
        DatagramPacket dp = new DatagramPacket(content,content.length, InetAddress.getLocalHost(),8888);
        //创建发送对象 ；Socket对象
        DatagramSocket ds = new DatagramSocket();
        //发送数据包
        ds.send(dp);
        //关闭Socket 释放端口号
        ds.close();
    }
}