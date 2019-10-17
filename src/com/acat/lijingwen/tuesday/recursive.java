package com.acat.lijingwen.tuesday;

import java.io.File;

public class recursive {
//    private static void testLoopOutAllFileName(String testFileDir) {
//        if (testFileDir == null) {
//            //因为new File(null)会空指针异常,所以要判断下
//            return;
//        }
//        //.listfiles()返回一个抽象路径名数组。这些路径名表示此抽象路径名表示的目录文件
//        File[] testFile = new File(testFileDir).listFiles();
//        if (testFile == null) {
//            return;
//        }
//        for (File file : testFile) {
//            if (file.isFile()) {
//                System.out.println(file.getName());
//            } else if (file.isDirectory()) {
//                System.out.println("-------this is a directory, and its files are as follows:-------");
//                testLoopOutAllFileName(file.getPath());
//            } else {
//                System.out.println("文件读入有误！");
//            }
//        }
//    }
    public static void digui (String directory){
        if (directory == null){
            return;
        }
        File [] file = new File(directory).listFiles();
        if (file==null){
            System.out.println("文件目录为空");
        }
        for (File testfile:file) {
            if (testfile.isFile()){
                System.out.println(testfile.getName());
            }else if(testfile.isDirectory()){
                System.out.println("--------------------文件夹中包含文件夹------------------");
                digui(testfile.getPath());
            }else{
                System.out.println("文件目录有误");
            }

        }
    }
    public static void  main (String []args){
        digui("C:\\Users\\Administrator\\Desktop\\document");
    }
}
