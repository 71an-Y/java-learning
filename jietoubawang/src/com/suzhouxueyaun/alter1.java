package com.suzhouxueyaun;
import java.util.Scanner;
public class alter1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字母：");
        char a=sc.next().charAt(0);
        //1转换小写；
        char xx=(char)(a+32);
        System.out.print(xx);
    }

}
