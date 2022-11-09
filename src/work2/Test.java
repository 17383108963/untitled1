package work2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name,name1;
        int hp,hp1;
        int atk,atk1;
        int defence;
        //先创建对象

        //英雄名字输入
        while (true) {
            System.out.println("请输入英雄属性：（名字）");
            name = scanner.next();
            if(name.length() >= 1 && name.length() <= 20){
                break;
            }else {
                System.out.println("名字长度为1-20，请重新输入");
            }
        }

        //英雄生命值
        while (true) {
            System.out.println("请输入英雄属性：（生命值）");
            hp = scanner.nextInt();
            if(hp >= 1 && hp <= 9999){
                break;
            }else {
                System.out.println("生命值为1-9999，请重新输入");
            }
        }

        //英雄攻击力
        while (true) {
            System.out.println("请输入英雄属性：（攻击力）");
            atk = scanner.nextInt();
            if(atk >= 1 && atk <= 999){
                break;
            }else {
                System.out.println("攻击力为1-999，请重新输入");
            }
        }

        //英雄防御力
        while (true) {
            System.out.println("请输入英雄属性：（防御力）");
            defence = scanner.nextInt();
            if(defence >= 1 && defence <= 999){
                break;
            }else {
                System.out.println("防御力为1-999，请重新输入");
            }
        }
        Hero hero = new Hero(name, hp, atk, defence);

        //小兵名字输入
        while (true) {
            System.out.println("请输入小兵属性：（名字）");
            name1 = scanner.next();
            if(name1.length() >= 1 && name1.length() <= 20){
                break;
            }else {
                System.out.println("名字长度为1-20，请重新输入");
            }
        }

        //小兵生命值
        while (true) {
            System.out.println("请输入小兵属性：（生命值）");
            hp1 = scanner.nextInt();
            if(hp1 >= 1 && hp1 <= 5000){
                break;
            }else {
                System.out.println("生命值为1-5000，请重新输入");
            }
        }

        //小兵攻击力
        while (true) {
            System.out.println("请输入小兵属性：（攻击力）");
            atk1 = scanner.nextInt();
            if(atk1 >= 1 && atk1 <= 999){
                break;
            }else {
                System.out.println("攻击力为1-999，请重新输入");
            }
        }
        Batman batman = new Batman(name1, hp1, atk1);

        //调用Fight类
        Fight fight = new Fight();
        fight.F(hero,batman);
    }
}
