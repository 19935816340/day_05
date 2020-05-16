package com.company;

public class StudentJavaBean {
    // 成员变量
    private String name;
    private int age;
    private int salary;
    // 无参构造方法(必须)
    public StudentJavaBean(){
    }
    // 有参构造方法（建议)
    public StudentJavaBean(String name, int age){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    // 成员方法
    // get***()
    public String getName(){
        return name;
    }
    // set***()
    public void setName(String name){
        this.name = name;}



    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }


    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}
