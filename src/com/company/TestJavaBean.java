package com.company;

public class TestJavaBean {
    //  JavaBean 爪哇 的 咖啡豆 是一种Java的标准规范.
    //  符合JavaBean的类要求类1、必须是具体的和公共的/2、并且具有无参构造方法
    // 3、提供用来操作成员变量的set和get方法， 和数据库中表字段对应的实体类就是一个典型JavaBean

    // 格式
    // 成员变量
    // 无参构造方法[必须]
    // 有参构造方法[建议]
    // 成员方法
    // get***()
    // set***()

    public static void main(String[] args) {
        // 无参的构造方法的调用
        StudentJavaBean s = new StudentJavaBean();
        s.setName("李白");
        s.setAge(9999);
        s.setSalary(6666);
        System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getSalary());

        // 有参的构造方法的调用
        StudentJavaBean s2 = new StudentJavaBean("杜甫", 8888);
        System.out.println(s2.getName()+"---"+s2.getAge());

    }

    }

