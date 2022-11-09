package object.abstract_;

public abstract class AA {
    public static final int n1 = 10;
    abstract void A();
}
class B extends AA{
    @Override
     final void A() {
        System.out.println("重写");
    }
}