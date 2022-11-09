package work2;

public class Batman {//小兵对象
    private String name;//名字
    private int hp;//生命值
    private int atk;//攻击力

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Batman(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }
}
