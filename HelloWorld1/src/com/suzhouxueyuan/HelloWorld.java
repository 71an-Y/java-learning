package com.suzhouxueyuan;
//表示当前的类定义在com.suzhouxueyuan这个文件夹（包）下


//表示定义一个类
//class:表示定义一个类，之java项目中最基本的组成单元
//HelloWorld，表示类的名字
//{}：表示类的范围，所有的代码都要写在这个大括号里面
public class HelloWorld {
    //main方法：程序的入口，JVM启动时会首先调用这个方法
    //public static void：方法的修饰符和返回值类型
    //String[] args：命令行参数，可以在运行程序时传入字符串数组
    public static void main(String[] args) {
        //System.out.println：向控制台输出内容并换行
        System.out.println("Hello World!");
    }

}
