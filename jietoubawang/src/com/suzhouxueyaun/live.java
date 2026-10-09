package com.suzhouxueyaun;

import java.util.Scanner;

public class live {
    public static void main(String[] args) {
        int hp=200;
        System.out.println("请输入当前人物受到的伤害");
        Scanner sc=new Scanner(System.in);
        int danmage=sc.nextInt();
        hp=hp-danmage;
        System.out.println("请输入当前人物恢复的血量");
        int server=sc.nextInt();
        if(hp+server>=200)
        {
            hp=200;
        }
        if (hp+server<200 && hp+server>=1)
        {
            hp=hp+server;
        }
        if (hp+server<=0)
        {
            hp=1;
        }
        System.out.println("人物当前血量为："+hp);

    }
}
