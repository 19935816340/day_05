package com.company;

import java.util.Scanner;

public class Test01Scanner {
    // 匿名对象，（没有名的对象） 只创建对象语句， 没有把对象地址值赋值给某个变量
    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        // 这就是匿名对象的创建
        System.out.println(new Scanner(System.in).nextInt());
        // 缺点： 一旦调用两次成员方法， 就创建了两个对象，造成了浪费
//        new Scanner(System.in).nextInt();
//        new Scanner(System.in).nextInt();

    }
}
