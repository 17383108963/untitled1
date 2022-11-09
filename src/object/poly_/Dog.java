package object.poly_;

public class Dog extends Animal {
    int a = 20;
    public void cry() {
        System.out.println("Animal cry() 小狗汪汪汪...");
    }
    public void play(){//Dog类的特有方法（成员）
        System.out.println("小狗玩游戏...");
    }
}
