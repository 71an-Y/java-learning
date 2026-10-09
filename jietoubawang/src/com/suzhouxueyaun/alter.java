package com.suzhouxueyaun;
import java.sql.SQLOutput;
import java.util.Scanner;
public class alter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");
        int a=sc.nextInt();
        if (97<=a&&a<=122)
        {
            a=a-32;
        }
        else if (65<=a&&a<=90)
        {
            a=a+32;
        }
        char b=(char) a;
        System.out.println(a);
        System.out.println(b);

    }
}
