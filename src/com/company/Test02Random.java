package com.company;

import java.util.Random;
import java.util.Scanner;

public class Test02Random {
    public static void main(String[] args) {
        //生成一个[0,100]之间的数，玩家猜数字，提示大还是小
        Random random = new Random();
        int number = random.nextInt(100)+1;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您猜的数字：");
            int i = scanner.nextInt();
            if( i > number){
                System.out.println("输入的数字大了");
            }else if(i < number){
                System.out.println("输入的数字小了");
            }else{
                System.out.println("恭喜您猜对了！！！");
                break;
            }
        }
    }
}
