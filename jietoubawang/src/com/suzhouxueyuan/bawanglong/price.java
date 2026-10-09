package com.suzhouxueyuan.bawanglong;

import java.util.Scanner;

public class price {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您使用的电量：");
        double usage=sc.nextDouble();
        double cost=0;
        if (usage<=100) {
            cost=usage*0.5;
        } else if (usage<=200) {
            cost=100*0.5+(usage-100)*0.8;
        } else {
            cost=100*0.5+100*0.8+(usage-200)*1.2;
        }
        System.out.println("总电费为："+cost+"元");
    }
}