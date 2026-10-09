package com.SwitchDemo;

public class Switchcout {
    public static void main(String[] args) {
        int a=1;
        switch (a)
        {
            case 1,2,3->System.out.println("冬季");
            case 4,5,6->System.out.println("春季");
            case 7,8,9->System.out.println("夏季");
            case 10,11,12->System.out.println("秋季");
            default->System.out.println("输入错误");
        }
    }
}
