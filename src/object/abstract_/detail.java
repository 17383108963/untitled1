package object.abstract_;

public class detail {
    public static void main(String[] args) {
        B b = new B();
        b.A();
        System.out.println(AA.n1);
        System.out.println(b instanceof AA);
    }
}
