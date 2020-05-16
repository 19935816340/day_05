package com.company;

import java.util.Scanner;

public class EmpJavaBean {
            //员工姓名
            private String name;
            //工号
            private int num;
            //职位
            private String position;
            //薪资
            private int salary;
            //编写对应的测试类
            public EmpJavaBean(){
            }
            public EmpJavaBean(String name,int num,String money,int salary){
                this.name = name;
                this.num = num;
                this.position = getPosition();
                this.salary = salary;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getNum() {
                return num;
            }

            public void setNum (int num) {
                this.num = num;
            }

            public String getPosition() {
                return position;
            }

            public void setMoney(String position) {
                this.position = position;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }
        }


