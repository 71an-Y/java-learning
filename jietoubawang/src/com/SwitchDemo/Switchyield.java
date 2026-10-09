package com.SwitchDemo;

import java.util.Scanner;

public class Switchyield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字a:");
        int a = sc.nextInt();
        System.out.println("请输入数字b:");
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        int result = switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;

        };

    }
}