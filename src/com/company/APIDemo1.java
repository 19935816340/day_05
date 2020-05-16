package com.company;

import java.util.Scanner;

public class APIDemo1 {
    public static void main(String[] args) {
        // 1. Scanner类(System.in是指通过键盘录入数据)
        // 除了java.lang包下的类不需要导入，其他必须导入才能使用
        //导包格式： import 包名，类名;
        //调用方法 变量名.方法名() + altEnter
        // 2. Random类
        // 3. ArrayList类
        //三个数求最大值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数（求最大值）：");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int max;
        if(x >= y && x >= z){
            max = x;
        }else if (y >= x){
            max = y;
        }else{
            max = z;
        }
        System.out.println("最大的数为：" + max);
    }
}
