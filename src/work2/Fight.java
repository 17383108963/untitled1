package work2;

import java.util.Scanner;

public class Fight {
    Scanner scanner = new Scanner(System.in);
    public void F(Hero hero,Batman batman){
        System.out.println("请输入回合数");
        int round = scanner.nextInt();
        //进行回合制进攻
        for (int i = 0; i < round; i++) {

            //英雄生命值 = 总生命值 - 小兵攻击力 + 英雄防御力）,小兵攻击力需大于英雄防御力才能造成伤害
            if(batman.getAtk() > hero.getDefence()) {
                hero.setHp(hero.getHp() - batman.getAtk() + hero.getDefence());
                System.out.println("英雄 " + hero.getName() + " 被小兵 " + batman.getName() +
                        " 造成了" + (batman.getAtk() - hero.getDefence()) + "点伤害");
            }else {
                System.out.println("小兵 " + batman.getName() + " 无法对英雄 " + hero.getName() + " 造成伤害");
            }

            //小兵生命值 = 总生命值 - 英雄攻击力
            batman.setHp(batman.getHp() - hero.getAtk());
            System.out.println("小兵 " + batman.getName() + " 被英雄 " + hero.getName() +
                    " 造成了" + hero.getAtk() + "点伤害");

            //判断英雄，小兵是否死亡，分别输出不同结果
            if(hero.getHp() <= 0){
                System.out.println("英雄 " + hero.getName() + " 死亡");
                break;
            } else if (batman.getHp() <= 0) {
                System.out.println("小兵 " + batman.getName() + " 死亡");
            }
        }
        if(hero.getHp() > 0 && batman.getHp() > 0){
            System.out.println("英雄 " + hero.getName() + " 生命值剩余：" + hero.getHp());
            System.out.println("小兵 " + batman.getName() + " 生命值剩余：" + batman.getHp());
        }
        System.out.println("游戏结束");
    }
}
