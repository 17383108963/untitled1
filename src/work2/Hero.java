package work2;

public class Hero {//创建英雄对象
    private String name;//名字
    private int hp;//生命值
    private int atk;//攻击力
    private int defence;//防御

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public Hero(String name, int hp, int atk, int defence) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.defence = defence;
    }
}
