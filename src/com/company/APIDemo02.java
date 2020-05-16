package com.company;

import java.util.Scanner;

public class APIDemo02 {
    public static void main(String[] args) {
        //输入两位数求和
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数（求和）：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println(num1 + "+" + num2 + "的和为" + sum);

    }
}
