package com.acat.wujinfan.test;

import com.acat.wujinfan.test.tree.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-01-16
 */
public class Main {

    public static void main(String[] args) {
        User user1 = new User("12","wujinfan",1);
        User user2 = new User("11","lipan",2);
        User user3 = new User("11","zhangweibo",1);
        User user4 = new User("3","sunfan",2);
        User user5 = new User("9","lizhen",1);
        User user6 = new User("1","lihao",2);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);

        //对输出的主观题做排序
        Collections.sort(list, (o1, o2) -> {
            Integer scoreLeft = o1.getId();
            Integer scoreRight = o2.getId();
            int flag = scoreLeft.compareTo(scoreRight);
            if(flag == 0){
                Integer scoreAgeLeft = Integer.parseInt(o1.getAge());
                Integer scoreAgeRight = Integer.parseInt(o2.getAge());
                return scoreAgeLeft.compareTo(scoreAgeRight);
            }else {
                return flag;
            }
        });

        for(User user:list){
            System.out.println(user.getName());
        }
    }

}
