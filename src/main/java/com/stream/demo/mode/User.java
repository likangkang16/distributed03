package com.stream.demo.mode;

/**
 * @ClassName User
 * @Description //TODO
 * @Author lkk
 * Date 2023/04/16/14:15
 * @Version 1.0
 **/
public class User {

    private String name;
    private String age;

    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
