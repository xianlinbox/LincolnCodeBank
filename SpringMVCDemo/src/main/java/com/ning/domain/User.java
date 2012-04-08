package com.ning.domain;

import com.sun.istack.internal.NotNull;
import org.springframework.format.annotation.NumberFormat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/5/12
 * Time: 1:30 PM
 */
public class User {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        StringBuilder builder  = new StringBuilder();
        builder.append("Name: ").append(name).append("; Sex:").append(sex).append("; Age:").append(age);
        return builder.toString();
    }

}
