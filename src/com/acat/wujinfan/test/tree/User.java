package com.acat.wujinfan.test.tree;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-01-20
 */
public class User {

    private String age;

    private String name;

    private Integer id;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(String age, String name, Integer id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public User(){}
}
