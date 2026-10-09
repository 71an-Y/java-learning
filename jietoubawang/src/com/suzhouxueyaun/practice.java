package com.suzhouxueyaun;

public class practice
{
    public static void main(String[] args) {
        int number=123;
        int a =number/100%10;
        int b=number/10%10;
        int c=number%10;
        System.out.println("百位是："+a);
        System.out.println("十位是："+b);
        System.out.println("个位是:"+c);

    }
}
