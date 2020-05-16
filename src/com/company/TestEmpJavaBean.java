package com.company;

public class TestEmpJavaBean {
    public static void main(String[] args) {
        // 无参构造方法的调用
        EmpJavaBean empJavaBean = new EmpJavaBean();
        empJavaBean.setName("张三");
        empJavaBean.setNum(1234);
        empJavaBean.setMoney("员工");
        empJavaBean.setSalary(8888);
        System.out.println(empJavaBean.getName() + "-" + empJavaBean.getNum() + "-" + empJavaBean.getPosition() + "-" + empJavaBean.getSalary());
        // 有参构造方法的调用
        EmpJavaBean empJavaBean1 = new EmpJavaBean("张三",6666,"员工",8888);
        System.out.println(empJavaBean1.getName() + "-" + empJavaBean1.getNum()+ "-" + empJavaBean1.getPosition() + "-" + empJavaBean1.getSalary());
    }
}
