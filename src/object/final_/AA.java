package object.final_;

public class AA {
    public final int n1;
    public static final int n2 = 10;
    static public final int n3 = 50;
    public AA(int n1) {
        this.n1 = n1;
    }
}
class BB{
    public static final int n1;
    static {
        n1 = 50;
        System.out.println("代码块被执行");
    }
}
