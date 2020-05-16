package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Test01ArrayList {
    public static void main(String[] args) {
        // 生成 10个1到33之间的随机整数，添加到集合中, 并且遍历输出
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(33) + 1;
            list.add(number);
        }
        printArrayList(list);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(list.get(i));
//        }
    }
    public static void printArrayList(ArrayList<Integer> list){
        System.out.print("[");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(list.get(list.size()-1));
        System.out.print("]");
    }
    }

