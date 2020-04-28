package com.acat.wujinfan;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-03-30
 */
public class User {

    /**
     * ASCII码,A:65,Z:90 --> 65+26-1
     *        a:97,z:122 --> 97+26-1
     *        0:48,9:57  --> 48+10-1
     */

    /**
     * a:3,b:5,c:2@a:1,b:2
     * @param args
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String targetString = scanner.next();
//        String[] str = targetString.split("@");
////        Map<String,String> resMap1 = function(str[0]);
////        Map<String,String> resMap2 = function(str[1]);
////
////        Map<String,String> okMap = new HashMap<>();
////        for(String string:resMap1.keySet()){
////            if(resMap2.containsKey(string)){
////                okMap.put(string,String.valueOf(Integer.parseInt(resMap1.get(string))-Integer.parseInt(resMap2.get(string))));
////            }else {
////                okMap.put(string,resMap1.get(string));
////            }
////        }
////        StringBuilder stringBuilder = new StringBuilder();
////
////        List<String> keyStringList = new ArrayList<>();
////
////        for(String string:okMap.keySet()){
////            keyStringList.add(string);
////        }
////        for(String string:keyStringList){
////            if(keyStringList.indexOf(string) == keyStringList.size()-1){
////                stringBuilder.append(string).append(":").append(okMap.get(string));
////            }else {
////                stringBuilder.append(string).append(":").append(okMap.get(string)).append(",");
////            }
////        }
////        System.out.println(stringBuilder.toString());
//
//        String str1 = str[0];
//        String str2 = str[1];
//
//        Map<String,String> map1 = new HashMap<>();
//        Map<String,String> map2 = new HashMap<>();
//
//        for(int i=0;i<str1.length();i++){
//            char ch = str1.charAt(i);
//            if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
//                map1.put(Character.toString(ch),Character.toString(str1.charAt(i+2)));
//            }
//        }
//
//        char[] chars = str2.toCharArray();
//        for(int i=0;i<chars.length;i++){
//            if((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122)){
//                map2.put(Character.toString(chars[i]),Character.toString(chars[i+2]));
//            }
//        }
//
//        System.out.println(map1);
//        System.out.println(map2);
//
//    }

//    private static Map<String,String> function(String str){
//        Map<String,String> resMap = new HashMap<>();
//        String[] strs = str.split(",");
//        List<String> list = Arrays.asList(strs);
//        for(String s:list){
//            resMap.put(Character.toString(s.charAt(0)),Character.toString(s.charAt(2)));
//        }
//        return resMap;
//    }
//    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<>();
//        map.put("a","1");
//        map.put("b","2");
//        map.put("c","3");
//
////        for(String str:map.keySet()){
////            System.out.println(str+":"+map.get(str));
////        }
//        for(Object obj:map.entrySet()){
//            System.out.println(obj);
//        }
//
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for(String str:list){
//            if(list.indexOf(str) != list.size()-1){
//                stringBuilder.append(str).append(",");
//            }else {
//                stringBuilder.append(str);
//            }
//        }
//        System.out.println(stringBuilder.toString());
//    }
    public static void main(String[] args) {
        User2 u1 = new User2("wujinfan",24);
        User2 u2 = new User2("lipan",22);
        User2 u3 = new User2("sunfan",23);
        User2 u4 = new User2("zhangweibo",21);

        //User2 u4 = new User2("zhangweibo",21);

        List<User2> user2List = new ArrayList<>();
        user2List.add(u1);
        user2List.add(u2);
        user2List.add(u3);
        user2List.add(u4);

//        for (User2 u:user2List){
//            if("lipan".equals(u.getName())){
//                continue;
//            }
//            if(u.getAge() < 22){
//                continue;
//            }
//            System.out.println(u.getName());
//        }

        user2List.forEach(stu->{
            System.out.println(stu.getName());
        });
    }
}
