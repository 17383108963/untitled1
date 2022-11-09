package object.constructor;

public class constructor1 {
    public static void main(String[] agrs) {
        T t = new T();
        t.b();
    }
}

class T {
    /*
    this细节：
    普通的访问方法语法：this.方法名(形参列表)
    访问构造器语法：this(形参列表)
    注意：只能在构造器中访问另外一个构造器，并且只能放在第一句
     */
    public T() {
        this(5);
        System.out.println("T() 被调用======");
    }

    public T(int a) {
        System.out.println("T(int a) 被调用=====");
    }

    public void a() {
        System.out.println("a() 被调用====");
    }

    public void b() {
        System.out.println("b() 被调用====");
        //这里a()和this.a() 有区别，后面会讲
        a();
        this.a();
    }
}