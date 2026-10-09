package com.suzhouxueyuan.bawanglong;

public class actribute {

    public static void main(String[] args) {
//1.定义一个变量表示我方的攻击武器为：叉子
        String weapon = "叉子";
        //2.定义一个对方攻击武器为：长手
        String enemyWeapon = "长手";
        //3.定义我方的攻击武力值为：220
        int weaponPower = 220;
        //定义对手攻击武力值为210
        int enemyWeaponPower = 210;
        //4定义我方血量为1012.5，
        double blood = 1012.5;
        //定义对手血量为1223.3
        double enemyBlood = 1223.3;
        //定义我方技能加成为12
        int skillPower = 12;
        //定义对手技能加成为13
        int enemySkillPower = 13;
        //定义我方防御为80
        int defense = 80;
        //定义对手防御为70
        int enemyDefense = 70;


        int damage = weaponPower - enemyDefense;
        System.out.println("我方进行一次攻击，造成" + damage + "伤害，对方还剩" + (enemyBlood - damage) + "血量");


    }




}
