package com.suzhouxueyaun;

import java.util.Scanner;
//忽略此卡的规则，计算充值不同的额度，卡中的余额
public class pya {
    public static void main(String[] args) {
        System.out.println("请输入充值的金额：");
        Scanner sc = new Scanner(System.in);
        double cash = sc.nextDouble();
        double sum = 0;
        if (cash >= 50000)
            sum = cash + 15000;

        else if (cash >= 20000)
            sum = cash + 6000;
        else if (cash >= 10000)
            sum = cash + 2500;
        else if (cash >= 5000)
            sum = cash + 1300;
        else if (cash >= 3000)
            sum = cash + 700;
        else if (cash >= 2000)
            sum = cash + 500;
        else if (cash >= 1000)
            sum = cash + 200;
        System.out.println("您的余额为：" + sum);
    }
}
