package com.suzhouxueyuan.bawanglong;
import java.util.Scanner;
public class shuru
{
    public static void main(String[] args) {
        //bmi=体重/身高的平方
        Scanner kk = new Scanner(System.in);
        Scanner scanner =new Scanner(System.in);
        System.out.print("请输入您的体重：");
        double weight=kk.nextDouble();
        System.out.print("请输入您的身高：");
        double height=kk.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("您的bmi="+bmi);
    }
}
