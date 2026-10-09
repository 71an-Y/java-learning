package com.suzhouxueyaun;

import javax.swing.*;

public class oprator
{
    public static void main(String[] args) {
        //运算符
        //1.算数运算符：+ - * / %
        //1.整数计算，结果是整数
        int a=10;
        int b=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("_________________");
        //小数计算，结果是有可能不精确的
        double c=10.0;
        double d=3.01;
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c%d);

    }
}
