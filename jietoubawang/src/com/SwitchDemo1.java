package com;

import java.util.Scanner;

/* switch的注意点
1. 表达式：结果(字符/整数byte short int 枚举 字符串)不支持浮点数
2. case 标签不能重复
3. case 标签不能是变量
4. switch 语句中可以使用表达式
5. break 关键字可以省略
6. default 标签可以省略
7. switch 语句中可以使用多个 case 标签
8. switch 语句中可以使用 break 关键字
9. switch 语句中可以使用 continue 关键字
10. switch 语句中可以使用 return 关键字
 */
public class SwitchDemo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数字:");
        int week = sc.nextInt();
        switch (week)
        {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;

            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("放纵餐");
                break;



        }
 }

}
