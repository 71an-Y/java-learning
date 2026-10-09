package com.suzhouxueyaun;
import java.sql.SQLOutput;
import java.util.Scanner;
public class time
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入时间：");
        //一分钟=60秒
        int time = sc.nextInt();
        int s = time / 60 / 60;
        int f = time / 60-s*60;
        int m=time-(s*3600)-(f*60);
        System.out.println(s);
        System.out.println(f);
        System.out.println(m);
    }
}
