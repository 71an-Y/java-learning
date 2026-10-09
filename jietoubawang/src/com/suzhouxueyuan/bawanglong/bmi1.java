package com.suzhouxueyuan.bawanglong;

import java.util.Scanner;
public class bmi1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的身高：");
        double height=sc.nextDouble();
        System.out.println("请输入您的体重:");
        double weight=sc.nextDouble();
        double BMI=weight/(height*height);
        //定义一个字符串类型
        String ch="";
        if (BMI>=30)
            ch="严重肥胖";
        else if (BMI >=27.0)
            ch="肥胖";
        else if (BMI >=24.0)
            ch="偏胖";
        else if (BMI>=18.5)
            ch="正常";
        else
            ch="消瘦";
        System.out.println("您的身体状态:"+ch);
    }
}
