package com.suzhouxueyaun;

import java.util.Scanner;

public class elseif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您消费的金额：");
        double money = sc.nextDouble();
        System.out.print("有会员卡扣1，否则扣0：");
        int pd = sc.nextInt();

        double couponPrice = money;
        if (money >= 200) {
            couponPrice = money - 90;
        } else if (money >= 100) {
            couponPrice = money - 50;
        } else if (money >= 50) {
            couponPrice = money - 30;
        } else if (money >= 10) {
            couponPrice = money - 8;
        }

        double memberPrice = money * 0.8;

        if (pd == 1) {
            System.out.println("使用会员卡，最终消费金额为：" + memberPrice);
        } else {
            System.out.println("使用优惠券，最终消费金额为：" + couponPrice);
        }

        double bestPrice = Math.min(couponPrice, memberPrice);
        System.out.println("最优惠的价格为：" + bestPrice);
    }
}